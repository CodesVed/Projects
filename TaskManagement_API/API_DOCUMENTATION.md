# 📘 API Documentation – Task Management API

## 🧠 Overview
Basic API for handling CRUD operations of a todo list.

## 🌐 Base URL
http://localhost:8080/api/task-manager

---

## 📍 Endpoints

### 📝 Create a task
- **URL:** `/task`
- **Method:** `POST`
- **Request Params / Body:** `Task`
```json
{
  "title": "task title",
  "description": "task description"
}
```

- **Response:**
```json
{
  "id":
  "title":
  "description":
  "completed":
  "createdAt":
  "updatedAt": 
}
```

## 🔁 Common Response Format

| Field        | Type       | Description                      |
| ------------ | ---------- | -------------------------------- |
| id           | number     | task id                          |
| title        | string     | task title                       |   
| description  | string     | task description                 |
| completed    | boolean    | task status                      | 
| createdAt    | timestamp  | time of task creation            |
| updatedAt    | timestamp  | time when task was last updated  |

---

### 📃 Fetch task list
- **URL:** `/tasks`
- **Method:** `GET`
- **Request Params / Body:** `completed (optional, filter purpose)`

- **Response:**
```json
{
  "id":
  "title":
  "description":
  "completed":
  "createdAt":
  "updatedAt": 
}
```

## 🔁 Common Response Format

| Field        | Type       | Description                      |
| ------------ | ---------- | -------------------------------- |
| id           | number     | task id                          |
| title        | string     | task title                       |   
| description  | string     | task description                 |
| completed    | boolean    | task status                      | 
| createdAt    | timestamp  | time of task creation            |
| updatedAt    | timestamp  | time when task was last updated  |

---

### 📝 Updating a task
- **URL:** `/task/{id}`
- **Method:** `PUT`
- **Request Params / Body:** `id (in URL), Task`
```json
{
  "title": "updated title (if applicable)"
  "description": "updated description (if applicable)"
  "completed": true/false
}
```

- **Response:** `Task updated successfully.`

---

### 📃 Deleting a task
- **URL:** `/task/{id}`
- **Method:** `DELETE`
- **Request Params / Body:** `id (in URL)`

- **Response:**  `Task Successfully Deleted.`

---

## Notes
- All endpoints accept and return JSON (except UPDATE & DELETE).
- Ensure required fields are included in request.

---
