### Insert Data
```sql
INSERT INTO table_name (column1, column2, column3)
VALUES (value1, value2, value3);
```

### Update Data
```sql
UPDATE table_name
SET column1 = value1, column2 = value2
WHERE condition;
```

### Delete Data
```sql
DELETE FROM table_name
WHERE condition;
```

### Truncate Table
```sql
TRUNCATE TABLE table_name;
```

### Merge (Upsert)
```sql
MERGE INTO target_table USING source_table
ON condition
WHEN MATCHED THEN
    UPDATE SET column1 = value1
WHEN NOT MATCHED THEN
    INSERT (column1, column2) VALUES (value1, value2);
```

### Select All Rows
```sql
SELECT * FROM table_name;
```

### Select Specific Columns
```sql
SELECT column1, column2
FROM table_name;
```

### Filtering Rows with WHERE
```sql
SELECT * FROM table_name
WHERE condition;
```

### Sorting Results
```sql
SELECT * FROM table_name
ORDER BY column1 [ASC|DESC];
```

### Grouping Data
```sql
SELECT column1, COUNT(*)
FROM table_name
GROUP BY column1;
```

### Filtering Groups
```sql
SELECT column1, COUNT(*)
FROM table_name
GROUP BY column1
HAVING COUNT(*) > value;
```

### Limit Results
```sql
SELECT * FROM table_name
LIMIT 10;
```

### Create a Database
```sql
CREATE DATABASE database_name;
```

### View Databases
```sql
SHOW DATABASES;
```

### Use a Database
```sql
USE database_name;
```

### Drop a Database
```sql
DROP DATABASE database_name;
```

### Update Database Schema
```sql
ALTER TABLE table_name
ADD column_name datatype;
```

### Grant Permissions
```sql
GRANT ALL PRIVILEGES ON database_name.* TO 'user'@'host';
```

### Revoke Permissions
```sql
REVOKE ALL PRIVILEGES ON database_name.* FROM 'user'@'host';
```

### View Permissions
```sql
SHOW GRANTS FOR 'user'@'host';
```

### Create a Table
```sql
CREATE TABLE table_name (
    column1 datatype,
    column2 datatype,
    column3 datatype
);
```

### Alter a Table
```sql
ALTER TABLE table_name
ADD column_name datatype;
```

### Drop a Table
```sql
DROP TABLE table_name;
```

### Rename a Table
```sql
RENAME TABLE old_table_name TO new_table_name;
```

### Add a Primary Key
```sql
ALTER TABLE table_name
ADD PRIMARY KEY (column_name);
```

### Add a Foreign Key
```sql
ALTER TABLE table_name
ADD CONSTRAINT fk_name FOREIGN KEY (column_name) REFERENCES other_table(column_name);
```

### Remove a Column
```sql
ALTER TABLE table_name
DROP COLUMN column_name;
```

### Inner Join
```sql
SELECT t1.column1, t2.column2
FROM table1 t1
INNER JOIN table2 t2 ON t1.common_column = t2.common_column;
```

### Left Join
```sql
SELECT t1.column1, t2.column2
FROM table1 t1
LEFT JOIN table2 t2 ON t1.common_column = t2.common_column;
```

### Right Join
```sql
SELECT t1.column1, t2.column2
FROM table1 t1
RIGHT JOIN table2 t2 ON t1.common_column = t2.common_column;
```

### Full Outer Join
```sql
SELECT t1.column1, t2.column2
FROM table1 t1
FULL OUTER JOIN table2 t2 ON t1.common_column = t2.common_column;
```

### Cross Join
```sql
SELECT t1.column1, t2.column2
FROM table1 t1
CROSS JOIN table2 t2;
```

### Subquery in SELECT
```sql
SELECT column1, (SELECT MAX(column2) FROM table2) AS max_value
FROM table1;
```

### Subquery in WHERE
```sql
SELECT column1
FROM table1
WHERE column2 IN (SELECT column2 FROM table2 WHERE condition);
```

### 1. Find Second Highest Salary
```sql
SELECT MAX(salary)
FROM employees
WHERE salary < (SELECT MAX(salary) FROM employees);
```

### 2. Find Duplicate Records
```sql
SELECT column1, COUNT(*)
FROM table_name
GROUP BY column1
HAVING COUNT(*) > 1;
```

### 3. Find Employees Without a Manager
```sql
SELECT employee_name
FROM employees
WHERE manager_id IS NULL;
```

### 4. Get Top N Records
```sql
SELECT *
FROM table_name
ORDER BY column_name DESC
LIMIT N;
```

### 5. Retrieve Employee Details with Department Name
```sql
SELECT e.employee_name, d.department_name
FROM employees e
INNER JOIN departments d ON e.department_id = d.department_id;
```

### 6. Find Total Salary by Department
```sql
SELECT department_id, SUM(salary)
FROM employees
GROUP BY department_id;
```

### 7. Find Employees Hired in the Last 30 Days
```sql
SELECT *
FROM employees
WHERE hire_date >= NOW() - INTERVAL 30 DAY;
```

### 8. Fetch All Even Rows from a Table
```sql
SELECT *
FROM table_name
WHERE MOD(id, 2) = 0;
```

### 9. Display Employees by Salary Range
```sql
SELECT *
FROM employees
WHERE salary BETWEEN 5000 AND 10000;
```

### 10. Count Records in a Table
```sql
SELECT COUNT(*)
FROM table_name;
```