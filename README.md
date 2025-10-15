# 📚 LibraryManagement-BE

Backend repository for the **Library Management System** — built with **Spring Boot**, **Spring Data JPA**, and **RESTful APIs**.  
This service provides endpoints for managing books, including adding, updating, deleting, and listing them.  
It is designed to integrate seamlessly with the JavaFX frontend (`Pavilion-Frontend-FE`).

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
## Getting Started
```
git clone https://github.com/olowo17/Pavilion-Library-BE.git
cd Pavilion-Library-BE
mvn spring-boot:run
The app will start at http://localhost:8080/api/books
```
---
##  Sample JSON Request

```json
{
  "title": "Steal Like An Artist",
  "author": "Austin Kleon",
  "isbn": "9780761169253",
  "publishedDate": "2012-02-14"
}

```
## Postman Collection Link
https://documenter.getpostman.com/view/33523574/2sB3QNonso
