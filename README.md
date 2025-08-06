# Workforce Management API

This project is a backend API for a workforce management system, completed as part of the Backend Engineer Challenge. The application allows managers to create, assign, and track tasks for their employees. Starting with an initial codebase, the project involved fixing existing bugs and implementing several new, highly-requested features.

---

##  Video Link


https://www.loom.com/share/b0576792257145c0a82c235530fffa0c?sid=0cf8b342-85b9-44d1-aa25-61d4aa67fe5b

---

## ✅ Features Implemented

### 🐞 Part 1: Bug Fixes
- **Task Re-assignment De-duplication:**  
  Fixed a bug where re-assigning a task created duplicates. The corrected logic now assigns the task to the new user and marks any previous, duplicate active tasks as `CANCELLED`.

- **Cancelled Task Filtering:**  
  Fixed a bug where cancelled tasks were cluttering employee task lists. The task fetching endpoint now correctly excludes any tasks with a `CANCELLED` status.

---

### 🚀 Part 2: New Features
- **"Smart" Daily Task View:**  
  Enhanced task fetching logic to show a true “today’s work” view. The API now returns all active tasks within a given date range, **plus** any older tasks still open and not completed.

- **Task Priority:**
  - Added a `priority` field (`HIGH`, `MEDIUM`, `LOW`) to the Task model.
  - Created a new endpoint: `PATCH /task-mgmt/{id}/priority` for updating priority.
  - Added: `GET /task-mgmt/priority/{priority}` to fetch tasks by priority.

- **Task Comments & Activity History:**
  - Introduced `ActivityLog` model to automatically track key events (e.g. task creation, priority change).
  - Added `Comment` model and `POST /task-mgmt/{id}/comments` endpoint for adding comments.
  - Enhanced `GET /task-mgmt/{id}` to include the full activity history and all comments (chronologically sorted).

---

## 🧰 Technical Stack

| Tool           | Description               |
|----------------|---------------------------|
| **Language**   | Java 17                   |
| **Framework**  | Spring Boot 3.0.4         |
| **Build Tool** | Gradle                    |
| **Libraries**  | Spring Web, Lombok, MapStruct |
| **Database**   | In-memory Java Collections (No external DB required) |

---

## ⚙️ Setup and Run Instructions

### Prerequisites
- Java 17
- Gradle (or use the included wrapper)

### Clone and Build
```bash
git clone https://github.com/xtfaisal07/Workforcemgmt.git
cd Workforcemgmt
./gradlew build

