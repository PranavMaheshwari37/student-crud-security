# Student Management System – Role Based Security

A Spring Boot REST API for managing students with **role-based authorization** using **Spring Security** and **BCrypt password hashing**.

This project demonstrates a clean layered architecture and secure access control for different user roles.

---

## 🚀 Features

- Role-based access control (ADMIN, USER)
- Secure authentication using HTTP Basic Auth
- Password hashing using BCrypt
- Admin can add, update, and delete students
- Users can view student details
- RESTful APIs with proper HTTP methods
- MySQL database integration
- Clean layered architecture (Controller → Service → Repository)

---

## 🧑‍💻 Roles & Permissions

| Role  | Permissions |
|-----|------------|
| ADMIN | Add, update, delete students |
| USER  | View students only |

---

## 🔐 Security

- Spring Security for authentication & authorization
- BCrypt for secure password storage
- URL-based role restrictions
- HTTP Basic Authentication (used for REST API testing)

---

## 🛠️ Tech Stack

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- Gradle
- Postman (for API testing)

---

## 📌 API Endpoints

### Student APIs

| Method | Endpoint | Access |
|------|--------|-------|
| GET | `/students` | USER, ADMIN |
| GET | `/students/{id}` | USER, ADMIN |
| POST | `/students/admin` | ADMIN |
| PUT | `/students/admin/{id}` | ADMIN |
| DELETE | `/students/admin/{id}` | ADMIN |

---

## 🔑 Authentication

Use **HTTP Basic Authentication** in Postman or any REST client.

### Sample Credentials (for testing)
ADMIN
username: admin
password: admin123

USER
username: user
password: user123


---

## 🗄️ Database Configuration

This project uses **MySQL**.

Update the following in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentcrudsecurity
spring.datasource.username=your_username
spring.datasource.password=your_password

---

## Project Architecture

controller  → handles HTTP requests
service     → contains business logic
repository  → handles database operations
security    → Spring Security configuration
model       → entity classes

---

## How to Run

1. Clone the repository
2. Configure MySQL database
3. Run the Spring Boot application
4. Test APIs using Postman

---

Author
Pranav Maheshwari
(Java & Spring Boot Developer)
