# REST_SPRINGBOOT
CRUD operation using spring boot
# MyFirstRestAPI - Simple Spring Boot REST API

A beginner-friendly Spring Boot REST API demonstrating basic CRUD operations on an in-memory collection of employees.

---

## Project Overview

This project exposes REST endpoints to create, read, update, and delete employee records. It uses a simple Java POJO (`EntityClass`) to represent employees and stores them in a `HashMap`.

---

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
Method	Endpoint	Description
GET	/employees	Get all employees
GET	/employees/id/{id}	Get employee by ID
POST	/employees	Add a new employee
PUT	/employees/id/{id}	Update employee by ID
DELETE	/employees/id/{id}	Delete employee by ID

Sample JSON Payload
json
Copy
Edit
{
  "id": 755432,
  "name": "Swaraaj Naik",
  "company": "Tata Capital",
  "designation": "SDE1"
}

