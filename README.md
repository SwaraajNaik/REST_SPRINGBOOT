# REST_SPRINGBOOT
CRUD operation using spring boot
# MyFirstRestAPI - Simple Spring Boot REST API

A beginner-friendly Spring Boot REST API demonstrating basic CRUD operations on an in-memory collection of employees.

---

## Project Overview

This project exposes REST endpoints to create, read, update, and delete employee records. It uses a simple Java POJO (`EntityClass`) to represent employees and stores them in a `HashMap`.
![Screenshot 2025-05-23 001111](https://github.com/user-attachments/assets/7eb110ef-9639-4225-b781-0af508e2792a)
![Screenshot 2025-05-22 232847](https://github.com/user-attachments/assets/a1a76746-a5c8-43b9-a56a-4f88d395a168)
![Screenshot (124)](https://github.com/user-attachments/assets/c91335de-1131-4b10-bd1e-05cd569cd02c)
![Screenshot 2025-05-22 220212](https://github.com/user-attachments/assets/d337f368-ef79-447f-9ce3-227738ac9be0)

## Tech Stack

- Java 17+
- Spring Boot 3.x (Spring Web)
- Maven or Gradle

---

## Getting Started

### Run the Application

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/MyFirstRestAPI.git
   cd MyFirstRestAPI

API Endpoints
- Method	Endpoint	Description
- GET	/employees	Get all employees
- GET	/employees/id/{id}	Get employee by ID
- POST	/employees	Add a new employee
- PUT	/employees/id/{id}	Update employee by ID
- DELETE	/employees/id/{id}	Delete employee by ID

```bash
Sample JSON Payload
{
  "id": 755432,
  "name": "Swaraaj Naik",
  "company": "Tata Capital",
  "designation": "SDE1"
}
---

