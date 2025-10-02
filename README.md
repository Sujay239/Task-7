# Employee Database App (Java JDBC)

A simple **Java Console Application** that connects to **MySQL/PostgreSQL** using **JDBC** and performs full **CRUD operations** on an Employee Database.

---

## 📌 Features
- Connects Java to a relational database using JDBC
- Supports **Add, View, Update, Delete** employee records
- Console-based interactive menu
- Works with both **MySQL** and **PostgreSQL**

---

## 🛠 Tools & Technologies
- **Java 17+**
- **JDBC Driver**
  - MySQL Connector J (for MySQL)  
  - PostgreSQL JDBC Driver (for PostgreSQL)
- **Database**: MySQL / PostgreSQL
- **IDE**: IntelliJ IDEA Ultimate (recommended)

---

## ⚙️ Setup Instructions

### 1. Create Database & Table
For **MySQL**:
```sql
CREATE DATABASE employee_db;
USE employee_db;

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    salary DOUBLE
);
