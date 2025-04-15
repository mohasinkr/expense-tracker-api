# 💰 MicroExpense - Expense Tracker API

A simple and secure **Expense Tracker REST API** built with **Spring Boot 3**, **PostgreSQL**, and **Spring Security**. This project demonstrates solid backend architecture using best practices like layered service design, DTOs, error handling, and actuator monitoring.

---

## 🚀 Features

- ✅ CRUD operations for managing expenses
- 🔐 Basic authentication with Spring Security
- 🧪 Tested with Postman / HTTPie
- 📊 Real-time metrics with Spring Boot Actuator
- 🐘 PostgreSQL for persistent storage
- 🔄 Proper DTO-layer for clean request/response separation
- 🧹 Clean architecture and structured codebase

---

## 🧱 Tech Stack

| Layer       | Technology           |
|-------------|----------------------|
| Language    | Java 17+             |
| Framework   | Spring Boot 3.x      |
| Database    | PostgreSQL           |
| Auth        | Spring Security      |
| Monitoring  | Spring Boot Actuator |
| Build Tool  | Maven                |
| API Testing | Postman / HTTPie     |

---

## 📁 Project Structure

```plaintext
expense-tracker/
├── src/
│   ├── main/
│   │   ├── java/com/mkr/expensetracker/
│   │   │   ├── controller/         # REST API controllers
│   │   │   ├── dto/                # DTOs for request and response
│   │   │   ├── entity/             # JPA Entities
│   │   │   ├── repository/         # Spring Data JPA Repositories
│   │   │   ├── service/            # Business logic layer
│   │   │   └── config/             # Security and other configurations
│   │   └── resources/
│   │       ├── application.properties # DB and server configs
│   │       └── static/
│   └── test/                       # Unit and integration tests
├── pom.xml                         # Maven build file
└── README.md                       # Project documentation
```

---

## 🛠️ How to Run

### 📦 Prerequisites

- Java 17 or later
- Maven
- PostgreSQL running with a database created (e.g. `microexpense`)

### 🔧 Setup

1. Clone the repository

```bash
git clone https://github.com/yourusername/expense-tracker.git
cd expense-tracker
```

2. Update your database credentials in `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/microexpense
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
```

3. Build and run the app:

```bash
mvn clean install
mvn spring-boot:run
```

4. Access API at:

```
http://localhost:8080/api/v1/expenses
```

---

## 🔐 Authentication

Spring Security is enabled. By default, Basic Auth is configured.

Use the following credentials (or update in `application.properties`):

```txt
Username: user
Password: [Auto-generated on app start — check console logs]
```

You can test secured endpoints with:

```bash
http --auth user:yourpassword :8080/api/v1/expenses
```

---

## 🧪 Sample API Endpoints

### 📥 Create Expense

```http
POST /api/v1/expenses
Content-Type: application/json

{
  "name": "Groceries",
  "description": "Weekly shopping",
  "amount": 55.75
}
```

### 📤 Get All Expenses

```http
GET /api/v1/expenses
```

### 🔄 Update Expense

```http
PUT /api/v1/expenses/{id}
```

### ❌ Delete Expense

```http
DELETE /api/v1/expenses/{id}
```

---

## 📊 Monitoring with Actuator

Visit:

```http
GET /actuator/health
GET /actuator/metrics
```

Enable custom actuator endpoints in `application.properties` if needed.

---

## 📌 Roadmap Ideas

- ✅ Add unit tests
- ⏳ Add pagination and sorting
- ⏳ Add JWT-based authentication
- ⏳ Add category support for expenses
- ⏳ Add Swagger/OpenAPI documentation

---

## 🧑‍💻 Author

Built by [@mohasin](https://github.com/yourgithub)

---

## 📄 License

MIT License. See `LICENSE` for more info.

