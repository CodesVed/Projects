# 📘 API Documentation – Calculator API

## 🧠 Overview
API for basic and some advanced calculator operations

## 🌐 Base URL
http://localhost:8080/api/calculator

---

## 📍 Endpoints

### ➕ Addition
- **URL:** `/add`
- **Method:** `POST`
- **Request Params / Body:**  
```json
{
  "a": 32,
  "b": 45
}
```

- **Response:**
```json
{
  "result": 77.0 
}
```  


### ➖ Subtraction
- **URL:** `/subtract`
- **Method:** `POST`
- **Request Params / Body:**
```json
{
  "a": 37,
  "b": 22
}
```

- **Response:**
```json
{
  "result": 15.0
}
```


### ✖️ Multiplication
- **URL:** `/multiply`
- **Method:** `POST`
- **Request Params / Body:**
```json
{
  "a": "43",
  "b": "9"
}
```

- **Response:**
```json
{
  "result": 387.0
}
```


### 📃 Division
- **URL:** `/divide`
- **Method:** `POST`
- **Request Params / Body:**
```json
{
  "a": 34,
  "b": 3
}
```

- **Response:**
```json
{
  "result": 11.333333333333334
}
```


### ^ Exponent
- **URL:** `/exponent`
- **Method:** `POST`
- **Request Params / Body:**
```json
{
  "a": 4,
  "b": 3
}
```

- **Response:**
```json
{
  "result": 64.0
}
```


### % Percent of a number
- **URL:** `/percentOf`
- **Method:** `POST`
- **Request Params / Body:**
```json
{
  "a": 40,
  "b": 64
}
```

- **Response:**
```json
{
  "result": 25.6
}
```


### 📈 Interest
- **URL 1:** `/interest/simple`
- **Method:** `POST`
- **Request Params / Body:**
```json
{
  "p": 4000,
  "r": 9,
  "t": 2
}
```

- **Response:**
```json
{
  "result": 72000.0
}
```

- **URL 2:** `/interest/compound`
- **Method:** `POST`
- **Request Params / Body:**
```json
{
  "p": 4000,
  "r": 9,
  "n": 2,
  "t": 2
}
```

- **Response:**
```json
{
  "result": 4915.0
}
```


### ❗ Factorial
- **URL:** `/factorial/{number}`
- **Method:** `GET`
- **Request Params / Body:**
```json
{
  "p": 4,
}
```

- **Response:**
```json
{
  "result": 24.0
}
```


### Square Root
- **URL 1:** `sqrt/{number}`
- **Method:** `GET`
- **Request Params / Body:**
```json
{
  "p": 49
}
```

- **Response:**
```json
{
  "result": 7
}
```


### Logarithm
- **URL 1:** `/log/natural`
- **Method:** `GET`
- **Request Params / Body:**
```json
{
  "p": 40
}
```

- **Response:**
```json
{
  "result": 3.6888794541139363
}
```

- **URL 2:** `/log/10`
- **Method:** `GET`
- **Request Params / Body:**
```json
{
  "p": 100
}
```

- **Response:**
```json
{
  "result": 2.0
}
```

---

## 🔁 Common Response Format

| Field        | Type       | Description                      |
| ------------ | ---------- | -------------------------------- |
| result       | number     | computed value                   |

---

## Notes
- All endpoints accept and return JSON.
- Ensure required fields are included in request.

---
