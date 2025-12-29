# Edge — Full-Stack Todo & Work Planning App

Edge is a modern full-stack task and progress-tracking application designed for focused daily execution and team-based workflows.

Built to explore real-world product patterns: scoring, progress aggregation, clean UI/UX, and future-ready multi-user collaboration.

---

## ✨ Current Features

- Create tasks with **priority scores (1–10)**
- Inline **task descriptions**
- One-way completion (completed tasks are locked)
- **Daily progress tracking** based on total vs completed points
- Clean, minimal UI inspired by Apple Music / modern dashboards
- Full CRUD with RESTful API
- Persistent storage using JPA + H2 (dev)

---

## 🧱 Tech Stack

### Frontend
- **React**
- Axios
- CSS (custom, glassmorphism-inspired UI)

### Backend
- **Java 21**
- **Spring Boot**
- Spring Data JPA
- H2 (in-memory DB for development)

---

---

## 🚀 How to Run Locally

### Backend
```bash
cd demo-java
./mvnw spring-boot:run


