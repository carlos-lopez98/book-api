# 📘 Book Manager API – Spring Boot Fundamentals Review Project

> A simple REST API built with Spring Boot as a **review of core Spring fundamentals**.  
> Demonstrates clean architecture, CRUD operations, DTO usage, validation, and RESTful design using an in-memory list.

---

## 🚀 Features

- ✅ Clean, layered architecture (Controller → Service → Repository-style in-memory store)
- ✅ Full CRUD operations:
  - `GET /books` – Get all books
  - `GET /books/{id}` – Get a single book by ID
  - `POST /books` – Add a new book
  - `DELETE /books/{id}` – Delete a book by ID
- ✅ Uses DTOs to separate API layer from internal models
- ✅ Constructor-based dependency injection with `@Autowired`
- ✅ Input validation with `@Valid`, `@NotBlank`, and `@Size`
- ✅ In-memory data for simplicity (no external database)
- ✅ Returns proper HTTP status codes using `ResponseEntity`

---

## 📦 Tech Stack

- Java 17+
- Spring Boot 3.x
- Maven
- IntelliJ IDEA
- Embedded Apache Tomcat

---

## 💡 Purpose of This Project

This project was created as a **review of Spring Boot fundamentals**. It reinforces:
- Setting up a Spring Boot project from scratch
- Using DTOs and validation to build clean RESTful APIs
- Applying proper dependency injection and layering
- Writing maintainable code with clear separation of concerns

A future project will include full database integration and persistence logic. Once complete, it will be linked here for reference.

---

## 🧪 How to Test

### ▶️ Run the Application

From your terminal:
```bash
./mvnw spring-boot:run
```
Or from IntelliJ:
```bash
Click the green run button on the main class.
```
By default, the app runs on:
```bash
http://localhost:8080
```
---

## 📬 Example Requests
`POST /books` – Add a new book
Postman:

Method: `POST`

URL: `http://localhost:8080/books`

Body (raw JSON):
```bash
{
  "title": "Clean Code",
  "author": "Robert C. Martin"
}
```
Curl:
```bash
curl -X POST http://localhost:8080/books \
     -H "Content-Type: application/json" \
     -d '{"title": "Clean Code", "author": "Robert C. Martin"}'
```
---
## 📥 Fork & Clone
To clone the repository:
```bash
git clone https://github.com/yourusername/book-manager-api.git
cd book-api
./mvnw spring-boot:run
```
