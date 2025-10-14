# 📚 LibraryManagement-BE

Backend repository for the **Library Management System** — built with **Spring Boot**, **Spring Data JPA**, and **RESTful APIs**.  
This service provides endpoints for managing books, including adding, updating, deleting, and listing them.  
It is designed to integrate seamlessly with the JavaFX frontend (`LibraryManagement-FE`).

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

## 🧾 API Endpoints

| Method | Endpoint | Description |
|--------|-----------|-------------|
| `GET`  | `/api/books` | Retrieve all books |
| `GET`  | `/api/books/{id}` | Retrieve a specific book by ID |
| `POST` | `/api/books` | Add a new book |
| `PUT`  | `/api/books/{id}` | Update an existing book |
| `DELETE` | `/api/books/{id}` | Delete a book by ID |

---

## 🧠 Example JSON Request

```json
{
  "title": "Steal Like An Artist",
  "author": "Austin Kleon",
  "isbn": "9780761169253",
  "publishedDate": "2012-02-14"
}


