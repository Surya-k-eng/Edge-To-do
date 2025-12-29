package com.example.demo_java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoRepository repo;

    @GetMapping
    public List<Todo> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return repo.save(todo);
    }

    @PutMapping("/{id}")
public Todo update(@PathVariable Long id, @RequestBody Todo updated) {
    return repo.findById(id).map(todo -> {
        todo.setTitle(updated.getTitle());
        todo.setDescription(updated.getDescription());  // ← Add this line
        todo.setScore(updated.getScore());              // optional if you want score editable
        todo.setCompleted(updated.isCompleted());
        return repo.save(todo);
    }).orElse(null);
}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
