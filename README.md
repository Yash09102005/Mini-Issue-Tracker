\# Mini Issue Tracker Console Application



\## 📌 Project Overview



Mini Issue Tracker is a simple console-based Java application developed using JDBC and PostgreSQL.  

The application helps users manage software bugs/issues through CRUD operations.



This project demonstrates:

\- JDBC Connectivity

\- PostgreSQL Database Integration

\- DAO Design Pattern

\- Maven Project Structure

\- Console-Based Application Development



\---



\## 🛠 Tech Stack



\- Java

\- PostgreSQL

\- JDBC

\- Maven

\- VS Code



\---



\## 📂 Project Structure



src/main/java



com.day5



├── App.java



├── dao

│ └── BugDAO.java



├── model

│ └── Bug.java



└── util

└── DBConnection.java



\---



\## ✅ Features



1\. Add Bug

2\. View All Bugs

3\. Update Bug Status

4\. Delete Bug

5\. Exit Application



\---



\## 🗄 Database Setup



\### Create Database



```sql

CREATE DATABASE issuetracker;

```



\### Create Table



```sql

CREATE TABLE bugs (

&#x20;   id SERIAL PRIMARY KEY,

&#x20;   title VARCHAR(100),

&#x20;   description TEXT,

&#x20;   status VARCHAR(30)

);

```



\---



\## 🔗 JDBC Connection



Update database credentials in:



```text

DBConnection.java

```



Example:



```java

private static final String URL =

"jdbc:postgresql://localhost:5432/issuetracker";



private static final String USER = "postgres";



private static final String PASSWORD = "your\_password";

```



\---



\## ▶ How to Run



\### Compile Project



```bash

mvn compile

```



\### Run Application



```bash

mvn exec:java -Dexec.mainClass="com.day5.App"

```



\---



\## 💻 Sample Output



```text

===== ISSUE TRACKER =====



1\. Add Bug

2\. View Bugs

3\. Update Status

4\. Delete Bug

5\. Exit

```



\---



\## 📌 Learning Outcomes



\- Understanding JDBC

\- Performing CRUD Operations

\- PostgreSQL Integration

\- Maven Build Management

\- Java Package Structure

\- DAO Layer Implementation



\---



\## 👨‍💻 Author



Yashila Devi

