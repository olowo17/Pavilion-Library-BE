# 📚 LibraryManagement-BE

Backend repository for the **Library Management System** — built with **Spring Boot**, **Spring Data JPA**, and **RESTful APIs**.  
This service provides endpoints for managing books, including adding, updating, deleting, and listing them.  
It is designed to integrate seamlessly with the JavaFX frontend (`Pavilion-Library-FE`).

---

## ⚙️ Tech Stack
- **Java 17+**
- **Spring Boot 3+**
- **Spring Data JPA**
- **Hibernate**
- **H2**
- **Jackson (with JavaTimeModule)** — for `LocalDate` handling
- **Lombok**
- **Maven**

---

## ✨ Features
✅ RESTful CRUD operations for books  
✅ JSON serialization/deserialization with Java 8+ `LocalDate` support  
✅ Exception handling for invalid requests  
✅ Lightweight and easy to integrate with any frontend (JavaFX, React, etc.)  
✅ In-memory H2 database   

---

## Getting Started

---
### 1. Clone the repository

git clone <your-backend-repo-url>
cd <backend-folder>

## 2. Build and run the project

mvn spring-boot:run
The app will start at http://localhost:8080/api/books



### 2. Access to DB

H2 is used as an in-memory database. To access the console:

Open a browser and go to:
http://localhost:8080/h2-console

Use the following settings:

JDBC URL: jdbc:h2:file:./data/librarydb

Username: sa

Password: (leave blank)

Click Connect to view and query the database.

### 3. 🧾 API Endpoints

| Method | Endpoint | Description |
|--------|-----------|-------------|
| `GET`  | `/api/books` | Retrieve all books |
| `GET`  | `/api/books/{id}` | Retrieve a specific book by ID |
| `POST` | `/api/books` | Add a new book |
| `PUT`  | `/api/books/{id}` | Update an existing book |
| `DELETE` | `/api/books/{id}` | Delete a book by ID |

---


### 4. 🧠 Example JSON Request

```json
{
  "title": "Steal Like An Artist",
  "author": "Austin Kleon",
  "isbn": "9780761169253",
  "publishedDate": "2012-02-14"
}

### 5. Postman collection
https://documenter.getpostman.com/view/33523574/2sB3QNonso

