
# 🛠️ HQL Operations in Hibernate

This project demonstrates the use of **Hibernate Query Language (HQL)** in a Java application. It covers complete **CRUD operations**, **joins**, **aggregation functions**, and **pagination** using HQL to interact with a relational database.

## 📌 Technologies Used
- Java
- Hibernate ORM
- MySQL (or any supported RDBMS)
- Maven (optional)
- IDE: Eclipse / IntelliJ / STS

---

## ✅ Features

### 🔄 CRUD Operations
- **Create** – Insert new records using HQL `INSERT`
- **Read** – Fetch records using `SELECT`
- **Update** – Modify existing records using `UPDATE`
- **Delete** – Remove records using `DELETE`

### 🔗 Joins
- **Inner Join**  
- **Left Join**  
- **Right Join**  
- **Full Join (if supported by DB dialect)**  
Used to fetch related data between entities.

### 📊 Aggregation Functions
- `COUNT()` – Count records  
- `AVG()` – Average of numeric fields  
- `SUM()` – Total of a column  
- `MAX()` / `MIN()` – Find highest/lowest values  

### 📃 Pagination
- Implemented using `Query.setFirstResult()` and `setMaxResults()`  
Useful to fetch a subset of large result sets.

---

## 🧩 Project Structure

```
src/
├── entity/
│   └── Student.java
│   └── Course.java
├── dao/
│   └── StudentDAO.java
│   └── CourseDAO.java
├── util/
│   └── HibernateUtil.java
├── main/
│   └── App.java
```

---

## ⚙️ Setup Instructions

1. **Clone the repository**  
   ```bash
   git clone https://github.com/your-username/hql-crud-demo.git
   ```

2. **Configure database in `hibernate.cfg.xml`**

3. **Run the `App.java`** class to execute examples of:
   - CRUD operations
   - Joins
   - Aggregation
   - Pagination

---

## 📂 Sample Queries

### 🔄 CRUD
```java
// Read Example
Query query = session.createQuery("FROM Student WHERE id = :id");
query.setParameter("id", 1);
Student student = (Student) query.uniqueResult();
```

### 🔗 Join Example
```java
Query query = session.createQuery("SELECT s.name, c.courseName FROM Student s JOIN s.course c");
```

### 📊 Aggregation Example
```java
Query query = session.createQuery("SELECT AVG(s.marks) FROM Student s");
```

### 📃 Pagination Example
```java
Query query = session.createQuery("FROM Student");
query.setFirstResult(0);  // start from 1st record
query.setMaxResults(10);  // fetch next 10
```

Let me know if you'd like to customize this for a specific entity (e.g., Student-Course) or add a screenshot section or setup with Postman!
