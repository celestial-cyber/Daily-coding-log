-- 1. Select all records from a table
SELECT * FROM students_details;

-- 2. Select specific columns
SELECT id, name, cgpa FROM students_details;

-- 3. Use DISTINCT
SELECT DISTINCT cgpa FROM students_details;

-- 4. Filter data using WHERE
SELECT * FROM students_details
WHERE cgpa > 8.0;

-- 5. Use comparison operators (=, >, <, !=)
SELECT * FROM students_details
WHERE coding = 95;

SELECT * FROM students_details
WHERE cgpa > 8.5;

SELECT * FROM students_details
WHERE aptitude < 70;

SELECT * FROM students_details
WHERE name != 'Arjun';

-- 6. Use AND, OR, NOT
SELECT * FROM students_details
WHERE cgpa > 8.0 AND coding > 85;

SELECT * FROM students_details
WHERE projects >= 4 OR certifications >= 5;

SELECT * FROM students_details
WHERE NOT cgpa < 8.0;

-- 7. Use BETWEEN
SELECT * FROM students_details
WHERE cgpa BETWEEN 8.0 AND 9.0;

-- 8. Use IN
SELECT * FROM students_details
WHERE name IN ('Arjun', 'Sneha', 'Rohit');

-- 9. Use LIKE with % and _
SELECT * FROM students_details
WHERE name LIKE 'A%';

SELECT * FROM students_details
WHERE name LIKE '_o%';

-- 10. Handle NULL values
SELECT * FROM students_details
WHERE email IS NULL;

SELECT * FROM students_details
WHERE email IS NOT NULL;

-- 11. Sort using ORDER BY
SELECT * FROM students_details
ORDER BY cgpa;

-- 12. Sort ascending/descending
SELECT * FROM students_details
ORDER BY cgpa ASC;

SELECT * FROM students_details
ORDER BY cgpa DESC;

-- 13. Limit rows using LIMIT
SELECT * FROM students_details
LIMIT 5;

-- 14. Alias columns using AS
SELECT name AS Student_Name,
       cgpa AS Academic_Score
FROM students_details;

-- 15. Concatenate columns
SELECT CONCAT(name, ' - ', email) AS Student_Details
FROM students_details;



-- 16. COUNT()
SELECT COUNT(*) AS Total_Students
FROM students_details;

-- 17. SUM()
SELECT SUM(coding) AS Total_Coding_Score
FROM students_details;

-- 18. AVG()
SELECT AVG(cgpa) AS Average_CGPA
FROM students_details;

-- 19. MIN()
SELECT MIN(cgpa) AS Minimum_CGPA
FROM students_details;

-- 20. MAX()
SELECT MAX(cgpa) AS Maximum_CGPA
FROM students_details;

-- 21. Count distinct values
SELECT COUNT(DISTINCT cgpa) AS Unique_CGPA_Count
FROM students_details;

-- 22. Aggregate with conditions
SELECT COUNT(*) AS Eligible_Students
FROM students_details
WHERE cgpa >= 8.0;

SELECT AVG(coding) AS Average_Coding
FROM students_details
WHERE projects >= 3;

-- 23. Find total salary in department
-- Example table: employees(emp_id, emp_name, department, salary)

SELECT department,
       SUM(salary) AS Total_Salary
FROM employees
GROUP BY department;

-- 24. Find highest/lowest salary
SELECT MAX(salary) AS Highest_Salary
FROM employees;

SELECT MIN(salary) AS Lowest_Salary
FROM employees;

-- 25. Find average marks/salary

-- Average CGPA
SELECT AVG(cgpa) AS Average_CGPA
FROM students_details;

-- Average Salary
SELECT AVG(salary) AS Average_Salary
FROM employees;


-- 26. GROUP BY basics
SELECT cgpa, COUNT(*) AS Student_Count
FROM students_details
GROUP BY cgpa;

-- 27. HAVING clause
SELECT cgpa, COUNT(*) AS Student_Count
FROM students_details
GROUP BY cgpa
HAVING COUNT(*) > 1;

-- 28. Count employees per department
-- employees(emp_id, emp_name, department, salary)

SELECT department, COUNT(*) AS Employee_Count
FROM employees
GROUP BY department;

-- 29. Department with highest salary
SELECT department, MAX(salary) AS Highest_Salary
FROM employees
GROUP BY department
ORDER BY Highest_Salary DESC
LIMIT 1;

-- 30. Average salary department-wise
SELECT department, AVG(salary) AS Average_Salary
FROM employees
GROUP BY department;

-- 31. Find duplicate records using GROUP BY
SELECT email, COUNT(*) AS Occurrences
FROM students_details
GROUP BY email
HAVING COUNT(*) > 1;

-- 32. Count occurrences of values
SELECT projects, COUNT(*) AS Occurrences
FROM students_details
GROUP BY projects;

-- 33. Departments with more than X employees
SELECT department, COUNT(*) AS Employee_Count
FROM employees
GROUP BY department
HAVING COUNT(*) > 5;

-- 34. Highest marks per subject

-- Highest Coding Marks
SELECT MAX(coding) AS Highest_Coding_Marks
FROM students_details;

-- Highest Aptitude Marks
SELECT MAX(aptitude) AS Highest_Aptitude_Marks
FROM students_details;

-- Highest Communication Marks
SELECT MAX(communication) AS Highest_Communication_Marks
FROM students_details;

-- 35. Monthly sales report
-- sales(sale_id, sale_date, amount)

SELECT MONTH(sale_date) AS Month,
       SUM(amount) AS Total_Sales
FROM sales
GROUP BY MONTH(sale_date)
ORDER BY Month;


-- 36. UPPER()
SELECT UPPER(name) AS Upper_Name
FROM students_details;

-- 37. LOWER()
SELECT LOWER(name) AS Lower_Name
FROM students_details;

-- 38. LENGTH()
SELECT name, LENGTH(name) AS Name_Length
FROM students_details;

-- 39. SUBSTRING()
SELECT name, SUBSTRING(name, 1, 3) AS First_Three_Chars
FROM students_details;

-- 40. TRIM()
SELECT TRIM('   Arjun   ') AS Trimmed_Name;

-- 41. REPLACE()
SELECT REPLACE(email, '@gmail.com', '@company.com') AS Updated_Email
FROM students_details;

-- 42. CONCAT()
SELECT CONCAT(name, ' - ', email) AS Student_Details
FROM students_details;

-- 43. Extract first/last name
-- Example table: employees(full_name)

SELECT full_name,
       SUBSTRING_INDEX(full_name, ' ', 1) AS First_Name,
       SUBSTRING_INDEX(full_name, ' ', -1) AS Last_Name
FROM employees;

-- 44. Remove spaces
SELECT REPLACE(name, ' ', '') AS Name_Without_Spaces
FROM students_details;

-- 45. Find names starting with specific character
SELECT *
FROM students_details
WHERE name LIKE 'A%';

-- Names starting with 'R'
SELECT *
FROM students_details
WHERE name LIKE 'R%';



-- =========================
-- 5. DATE & TIME FUNCTIONS
-- =========================

-- 46. Current date/time
SELECT CURDATE() AS Current_Date;
SELECT NOW() AS Current_DateTime;

-- 47. Add days/months
SELECT DATE_ADD(CURDATE(), INTERVAL 10 DAY) AS After_10_Days;
SELECT DATE_ADD(CURDATE(), INTERVAL 2 MONTH) AS After_2_Months;

-- 48. Difference between dates
SELECT DATEDIFF('2025-12-31', '2025-01-01') AS Days_Difference;

-- 49. Extract month/year/day
SELECT
    YEAR(CURDATE()) AS Year_Value,
    MONTH(CURDATE()) AS Month_Value,
    DAY(CURDATE()) AS Day_Value;

-- 50. Find employees joined after a date
SELECT *
FROM employees
WHERE join_date > '2024-01-01';

-- 51. Find records in last 30 days
SELECT *
FROM employees
WHERE join_date >= DATE_SUB(CURDATE(), INTERVAL 30 DAY);

-- 52. Monthly/yearly grouping
SELECT YEAR(join_date) AS Year,
       MONTH(join_date) AS Month,
       COUNT(*) AS Total_Employees
FROM employees
GROUP BY YEAR(join_date), MONTH(join_date);

-- 53. Age calculation
SELECT name,
       TIMESTAMPDIFF(YEAR, dob, CURDATE()) AS Age
FROM employees;

-- 54. Orders placed this month
SELECT *
FROM orders
WHERE MONTH(order_date) = MONTH(CURDATE())
  AND YEAR(order_date) = YEAR(CURDATE());

-- 55. Find weekday/weekend entries
SELECT *
FROM orders
WHERE DAYOFWEEK(order_date) IN (1,7);

SELECT *
FROM orders
WHERE DAYOFWEEK(order_date) NOT IN (1,7);


-- =========================
-- 6. JOINS
-- =========================

-- Assumed Tables:
-- employees(emp_id, emp_name, dept_id, manager_id)
-- departments(dept_id, dept_name)
-- customers(customer_id, customer_name)
-- orders(order_id, customer_id, order_date)
-- student_courses(student_id, course_id)
-- students(student_id, student_name)
-- courses(course_id, course_name)

-- 56. Inner Join
SELECT e.emp_name, d.dept_name
FROM employees e
INNER JOIN departments d
ON e.dept_id = d.dept_id;

-- 57. Left Join
SELECT e.emp_name, d.dept_name
FROM employees e
LEFT JOIN departments d
ON e.dept_id = d.dept_id;

-- 58. Right Join
SELECT e.emp_name, d.dept_name
FROM employees e
RIGHT JOIN departments d
ON e.dept_id = d.dept_id;

-- 59. Full Join (MySQL workaround)
SELECT e.emp_name, d.dept_name
FROM employees e
LEFT JOIN departments d
ON e.dept_id = d.dept_id

UNION

SELECT e.emp_name, d.dept_name
FROM employees e
RIGHT JOIN departments d
ON e.dept_id = d.dept_id;

-- 60. Self Join
SELECT e1.emp_name AS Employee,
       e2.emp_name AS Manager
FROM employees e1
JOIN employees e2
ON e1.manager_id = e2.emp_id;

-- 61. Cross Join
SELECT e.emp_name, d.dept_name
FROM employees e
CROSS JOIN departments d;

-- 62. Employee–Department join
SELECT e.emp_name, d.dept_name
FROM employees e
JOIN departments d
ON e.dept_id = d.dept_id;

-- 63. Customers with no orders
SELECT c.customer_name
FROM customers c
LEFT JOIN orders o
ON c.customer_id = o.customer_id
WHERE o.customer_id IS NULL;

-- 64. Orders with customer names
SELECT o.order_id,
       c.customer_name,
       o.order_date
FROM orders o
JOIN customers c
ON o.customer_id = c.customer_id;

-- 65. Find unmatched records
SELECT e.*
FROM employees e
LEFT JOIN departments d
ON e.dept_id = d.dept_id
WHERE d.dept_id IS NULL;

-- 66. Join 3 tables
SELECT e.emp_name,
       d.dept_name,
       p.project_name
FROM employees e
JOIN departments d
ON e.dept_id = d.dept_id
JOIN projects p
ON e.emp_id = p.emp_id;

-- 67. Many-to-many relationship query
SELECT s.student_name,
       c.course_name
FROM students s
JOIN student_courses sc
ON s.student_id = sc.student_id
JOIN courses c
ON sc.course_id = c.course_id;

-- 68. Duplicate rows using joins
SELECT e1.emp_name, e2.emp_name
FROM employees e1
JOIN employees e2
ON e1.dept_id = e2.dept_id;

-- 69. Compare inner vs left join

-- Inner Join
SELECT e.emp_name, d.dept_name
FROM employees e
INNER JOIN departments d
ON e.dept_id = d.dept_id;

-- Left Join
SELECT e.emp_name, d.dept_name
FROM employees e
LEFT JOIN departments d
ON e.dept_id = d.dept_id;

-- 70. Self join for manager-employee relation
SELECT e.emp_name AS Employee,
       m.emp_name AS Manager
FROM employees e
LEFT JOIN employees m
ON e.manager_id = m.emp_id;


```sql
-- 71. Scalar Subquery
SELECT *
FROM employees
WHERE salary >
(
    SELECT AVG(salary)
    FROM employees
);
```

```sql
-- 72. Correlated Subquery
SELECT *
FROM employees e1
WHERE salary >
(
    SELECT AVG(salary)
    FROM employees e2
    WHERE e1.dept_id = e2.dept_id
);
```

```sql
-- 73. Nested Subquery
SELECT *
FROM employees
WHERE dept_id =
(
    SELECT dept_id
    FROM
    (
        SELECT dept_id, AVG(salary) avg_salary
        FROM employees
        GROUP BY dept_id
    ) t
    ORDER BY avg_salary DESC
    LIMIT 1
);
```

```sql
-- 74. Find 2nd Highest Salary
SELECT MAX(salary) AS second_highest_salary
FROM employees
WHERE salary <
(
    SELECT MAX(salary)
    FROM employees
);
```

```sql
-- 75. Find Nth Highest Salary
SELECT salary
FROM
(
    SELECT salary,
           DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
    FROM employees
) t
WHERE rnk = N;
```

```sql
-- 76. Employee Earning More Than Average Salary
SELECT *
FROM employees
WHERE salary >
(
    SELECT AVG(salary)
    FROM employees
);
```

```sql
-- 77. Department With Maximum Average Salary
SELECT dept_id
FROM employees
GROUP BY dept_id
ORDER BY AVG(salary) DESC
LIMIT 1;
```

```sql
-- 78. EXISTS
SELECT *
FROM departments d
WHERE EXISTS
(
    SELECT 1
    FROM employees e
    WHERE e.dept_id = d.dept_id
);
```

```sql
-- 78. IN
SELECT *
FROM departments
WHERE dept_id IN
(
    SELECT dept_id
    FROM employees
);
```

```sql
-- 79. Find Records Not Present In Another Table
SELECT *
FROM employees
WHERE dept_id NOT IN
(
    SELECT dept_id
    FROM departments
);
```

```sql
-- 80. Highest Salary Employee Per Department
SELECT *
FROM employees e1
WHERE salary =
(
    SELECT MAX(salary)
    FROM employees e2
    WHERE e1.dept_id = e2.dept_id
);
```

```sql
-- 81. ROW_NUMBER()
SELECT emp_name,
       salary,
       ROW_NUMBER() OVER (ORDER BY salary DESC) AS row_num
FROM employees;
```

```sql
-- 82. RANK()
SELECT emp_name,
       salary,
       RANK() OVER (ORDER BY salary DESC) AS rank_num
FROM employees;
```

```sql
-- 83. DENSE_RANK()
SELECT emp_name,
       salary,
       DENSE_RANK() OVER (ORDER BY salary DESC) AS dense_rank_num
FROM employees;
```

```sql
-- 84. Running Total
SELECT emp_id,
       salary,
       SUM(salary) OVER (ORDER BY emp_id) AS running_total
FROM employees;
```

```sql
-- 85. Partition By Department
SELECT emp_name,
       dept_id,
       salary,
       AVG(salary) OVER (PARTITION BY dept_id) AS dept_avg_salary
FROM employees;
```

```sql
-- 86. Top 3 Salaries In Each Department
SELECT *
FROM
(
    SELECT *,
           DENSE_RANK() OVER
           (
               PARTITION BY dept_id
               ORDER BY salary DESC
           ) AS rnk
    FROM employees
) t
WHERE rnk <= 3;
```

```sql
-- 87. Find Duplicate Rows
SELECT *
FROM
(
    SELECT *,
           COUNT(*) OVER
           (
               PARTITION BY emp_name, dept_id
           ) AS cnt
    FROM employees
) t
WHERE cnt > 1;
```

```sql
-- 88. Consecutive Rows Problem
SELECT DISTINCT num
FROM
(
    SELECT num,
           LAG(num,1) OVER (ORDER BY id) AS prev1,
           LAG(num,2) OVER (ORDER BY id) AS prev2
    FROM logs
) t
WHERE num = prev1
AND num = prev2;
```

```sql
-- 89. LEAD() and LAG()
SELECT emp_name,
       salary,
       LAG(salary) OVER (ORDER BY emp_id) AS previous_salary,
       LEAD(salary) OVER (ORDER BY emp_id) AS next_salary
FROM employees;
```

```sql
-- 90. Compare Previous Row Values
SELECT emp_name,
       salary,
       LAG(salary) OVER (ORDER BY emp_id) AS previous_salary,
       salary - LAG(salary) OVER (ORDER BY emp_id) AS difference
FROM employees;
```
```sql
-- 91. Use CASE WHEN
SELECT emp_name,
       salary,
       CASE
           WHEN salary > 70000 THEN 'High'
           ELSE 'Low'
       END AS salary_status
FROM employees;
```

```sql
-- 92. Grade Classification
SELECT student_name,
       marks,
       CASE
           WHEN marks >= 90 THEN 'A'
           WHEN marks >= 75 THEN 'B'
           WHEN marks >= 60 THEN 'C'
           ELSE 'D'
       END AS grade
FROM students;
```

```sql
-- 93. Salary Category Classification
SELECT emp_name,
       salary,
       CASE
           WHEN salary >= 100000 THEN 'Executive'
           WHEN salary >= 50000 THEN 'Mid Level'
           ELSE 'Junior'
       END AS category
FROM employees;
```

```sql
-- 94. Conditional Aggregation
SELECT
    SUM(CASE WHEN gender = 'Male' THEN 1 ELSE 0 END) AS male_count,
    SUM(CASE WHEN gender = 'Female' THEN 1 ELSE 0 END) AS female_count
FROM employees;
```

```sql
-- 95. Replace NULLs Conditionally
SELECT emp_name,
       CASE
           WHEN bonus IS NULL THEN 0
           ELSE bonus
       END AS bonus
FROM employees;
```

```sql
-- 96. Primary Key
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50)
);
```

```sql
-- 97. Foreign Key
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    dept_id INT,
    FOREIGN KEY (dept_id)
    REFERENCES departments(dept_id)
);
```

```sql
-- 98. Unique Key
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    email VARCHAR(100) UNIQUE
);
```

```sql
-- 99. Composite Key
CREATE TABLE enrollments (
    student_id INT,
    course_id INT,
    PRIMARY KEY (student_id, course_id)
);
```

```sql
-- 100. Check Constraint
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    age INT CHECK(age >= 18)
);
```

```sql
-- 101. Default Constraint
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    status VARCHAR(20) DEFAULT 'Active'
);
```

```sql
-- 102. NOT NULL Constraint
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50) NOT NULL
);
```

```sql
-- 103. Candidate Key
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    email VARCHAR(100) UNIQUE,
    aadhar_no VARCHAR(20) UNIQUE
);
```

```sql
-- 104. Super Key
-- Any column or combination of columns
-- that uniquely identifies a record

SELECT emp_id, email
FROM employees;
```

```sql
-- 105. Difference Between PK and FK

-- Primary Key
CREATE TABLE departments (
    dept_id INT PRIMARY KEY
);

-- Foreign Key
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    dept_id INT,
    FOREIGN KEY (dept_id)
    REFERENCES departments(dept_id)
);
```

```sql
-- 106. First Normal Form (1NF)
CREATE TABLE students (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50),
    phone_number VARCHAR(15)
);
```

```sql
-- 107. Second Normal Form (2NF)
CREATE TABLE enrollments (
    student_id INT,
    course_id INT,
    PRIMARY KEY(student_id, course_id)
);

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50)
);
```

```sql
-- 108. Third Normal Form (3NF)
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    dept_id INT
);

CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);
```

```sql
-- 109. BCNF Basics
CREATE TABLE course_faculty (
    course_id INT,
    faculty_id INT,
    PRIMARY KEY(course_id, faculty_id)
);
```

```sql
-- 110. Denormalization
SELECT e.emp_id,
       e.emp_name,
       d.dept_name
FROM employees e
JOIN departments d
ON e.dept_id = d.dept_id;
```

```sql
-- 111. Database Schema Design
CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);

CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    dept_id INT,
    FOREIGN KEY (dept_id)
    REFERENCES departments(dept_id)
);
```

```sql
-- 112. ER Diagram Example Tables
CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(50)
);

CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    FOREIGN KEY (customer_id)
    REFERENCES customers(customer_id)
);
```

```sql
-- 113. One-to-One Relationship
CREATE TABLE users (
    user_id INT PRIMARY KEY
);

CREATE TABLE user_profiles (
    user_id INT PRIMARY KEY,
    FOREIGN KEY (user_id)
    REFERENCES users(user_id)
);
```

```sql
-- 113. One-to-Many Relationship
CREATE TABLE departments (
    dept_id INT PRIMARY KEY
);

CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    dept_id INT,
    FOREIGN KEY (dept_id)
    REFERENCES departments(dept_id)
);
```

```sql
-- 113. Many-to-Many Relationship
CREATE TABLE students (
    student_id INT PRIMARY KEY
);

CREATE TABLE courses (
    course_id INT PRIMARY KEY
);

CREATE TABLE student_courses (
    student_id INT,
    course_id INT,
    PRIMARY KEY(student_id, course_id),
    FOREIGN KEY(student_id) REFERENCES students(student_id),
    FOREIGN KEY(course_id) REFERENCES courses(course_id)
);
```
```sql
-- 114. Common Table Expression (CTE)
WITH high_salary_employees AS
(
    SELECT *
    FROM employees
    WHERE salary > 50000
)
SELECT *
FROM high_salary_employees;
```

```sql
-- 115. Recursive CTE
WITH RECURSIVE numbers AS
(
    SELECT 1 AS n
    UNION ALL
    SELECT n + 1
    FROM numbers
    WHERE n < 10
)
SELECT *
FROM numbers;
```

```sql
-- 116. Views
CREATE VIEW employee_view AS
SELECT emp_id, emp_name, salary
FROM employees;
```

```sql
-- 117. Materialized Views
CREATE MATERIALIZED VIEW employee_summary AS
SELECT dept_id,
       AVG(salary) AS avg_salary
FROM employees
GROUP BY dept_id;
```

```sql
-- 118. Stored Procedure
DELIMITER $$

CREATE PROCEDURE GetEmployees()
BEGIN
    SELECT *
    FROM employees;
END $$

DELIMITER ;
```

```sql
-- 119. Functions
DELIMITER $$

CREATE FUNCTION annual_salary(monthly_salary INT)
RETURNS INT
DETERMINISTIC
BEGIN
    RETURN monthly_salary * 12;
END $$

DELIMITER ;
```

```sql
-- 120. Triggers
CREATE TRIGGER before_employee_insert
BEFORE INSERT ON employees
FOR EACH ROW
SET NEW.created_at = NOW();
```

```sql
-- 121. Indexes
CREATE INDEX idx_emp_name
ON employees(emp_name);
```

```sql
-- 122. Clustered Index
CREATE CLUSTERED INDEX idx_emp_id
ON employees(emp_id);
```

```sql
-- 122. Non-Clustered Index
CREATE NONCLUSTERED INDEX idx_emp_name
ON employees(emp_name);
```

```sql
-- 123. Transactions (COMMIT)
START TRANSACTION;

UPDATE employees
SET salary = salary + 5000
WHERE emp_id = 1;

COMMIT;
```

```sql
-- 123. Transactions (ROLLBACK)
START TRANSACTION;

UPDATE employees
SET salary = salary + 5000
WHERE emp_id = 1;

ROLLBACK;
```

```sql
-- 124. ACID Properties
START TRANSACTION;

UPDATE accounts
SET balance = balance - 1000
WHERE account_id = 1;

UPDATE accounts
SET balance = balance + 1000
WHERE account_id = 2;

COMMIT;
```

```sql
-- 125. Deadlock Basics (Session 1)
START TRANSACTION;

UPDATE accounts
SET balance = balance - 100
WHERE account_id = 1;

UPDATE accounts
SET balance = balance + 100
WHERE account_id = 2;
```

```sql
-- 125. Deadlock Basics (Session 2)
START TRANSACTION;

UPDATE accounts
SET balance = balance - 100
WHERE account_id = 2;

UPDATE accounts
SET balance = balance + 100
WHERE account_id = 1;
```

```sql
-- 126. SQL Injection Basics (Unsafe)
SELECT *
FROM users
WHERE username = 'admin'
AND password = '123';
```

```sql
-- 126. SQL Injection Prevention (Parameterized Query)
SELECT *
FROM users
WHERE username = ?
AND password = ?;
```

```sql
-- 127. Optimization Basics
SELECT emp_id,
       emp_name
FROM employees
WHERE emp_id = 100;
```

```sql
-- 128. Query Execution Plan
EXPLAIN
SELECT *
FROM employees
WHERE salary > 50000;
```

```sql
-- 129. Temporary Tables
CREATE TEMPORARY TABLE temp_employees
AS
SELECT *
FROM employees
WHERE salary > 50000;
```

```sql
-- 130. Pivot
SELECT *
FROM
(
    SELECT dept_id,
           year,
           salary
    FROM employee_salary
) src
PIVOT
(
    SUM(salary)
    FOR year IN ([2023], [2024], [2025])
) p;
```

```sql
-- 130. Unpivot
SELECT dept_id,
       year,
       salary
FROM employee_salary
UNPIVOT
(
    salary
    FOR year IN ([2023], [2024], [2025])
) u;
```





```sql id="o1ecol"
-- 131. Find Duplicate Records
SELECT emp_name,
       COUNT(*) AS cnt
FROM employees
GROUP BY emp_name
HAVING COUNT(*) > 1;
```

```sql id="79l4dm"
-- 132. Delete Duplicate Rows
DELETE FROM employees
WHERE emp_id NOT IN
(
    SELECT MIN(emp_id)
    FROM employees
    GROUP BY emp_name, email
);
```

```sql id="8cc7fc"
-- 133. Find 2nd Highest Salary
SELECT MAX(salary) AS second_highest_salary
FROM employees
WHERE salary <
(
    SELECT MAX(salary)
    FROM employees
);
```

```sql id="l0vw42"
-- 134. Find Nth Highest Salary
SELECT salary
FROM
(
    SELECT salary,
           DENSE_RANK() OVER(ORDER BY salary DESC) AS rnk
    FROM employees
) t
WHERE rnk = N;
```

```sql id="jgk7ud"
-- 135. Top 3 Salaries Per Department
SELECT *
FROM
(
    SELECT *,
           DENSE_RANK() OVER
           (
               PARTITION BY dept_id
               ORDER BY salary DESC
           ) AS rnk
    FROM employees
) t
WHERE rnk <= 3;
```

```sql id="q4a1yq"
-- 136. Employees Without Manager
SELECT *
FROM employees
WHERE manager_id IS NULL;
```

```sql id="74mvn7"
-- 137. Employees Earning Above Average
SELECT *
FROM employees
WHERE salary >
(
    SELECT AVG(salary)
    FROM employees
);
```

```sql id="2m3y6p"
-- 138. Customers With No Orders
SELECT *
FROM customers c
LEFT JOIN orders o
ON c.customer_id = o.customer_id
WHERE o.customer_id IS NULL;
```

```sql id="f0n8hy"
-- 139. Find Consecutive Login Days
SELECT user_id,
       login_date
FROM
(
    SELECT user_id,
           login_date,
           LAG(login_date) OVER
           (
               PARTITION BY user_id
               ORDER BY login_date
           ) AS prev_date
    FROM logins
) t
WHERE DATEDIFF(login_date, prev_date) = 1;
```

```sql id="lthm4r"
-- 140. Running Total Of Sales
SELECT sale_date,
       amount,
       SUM(amount) OVER
       (
           ORDER BY sale_date
       ) AS running_total
FROM sales;
```

```sql id="kx9l2z"
-- 141. Rank Employees By Salary
SELECT emp_name,
       salary,
       RANK() OVER
       (
           ORDER BY salary DESC
       ) AS salary_rank
FROM employees;
```

```sql id="1brxrk"
-- 142. Department-Wise Highest Salary
SELECT *
FROM employees e1
WHERE salary =
(
    SELECT MAX(salary)
    FROM employees e2
    WHERE e1.dept_id = e2.dept_id
);
```

```sql id="d6h1w5"
-- 143. Find Missing IDs
SELECT t1.id + 1 AS missing_id
FROM employees t1
LEFT JOIN employees t2
ON t1.id + 1 = t2.id
WHERE t2.id IS NULL;
```

```sql id="v3qzhg"
-- 144. Find Duplicate Emails
SELECT email,
       COUNT(*) AS cnt
FROM employees
GROUP BY email
HAVING COUNT(*) > 1;
```

```sql id="d5fx3i"
-- 145. Swap Values In Column
UPDATE employees
SET gender =
CASE
    WHEN gender = 'M' THEN 'F'
    WHEN gender = 'F' THEN 'M'
END;
```

```sql id="mxn5z5"
-- 146. Cumulative Sum
SELECT id,
       amount,
       SUM(amount) OVER
       (
           ORDER BY id
       ) AS cumulative_sum
FROM sales;
```

```sql id="smgqq9"
-- 147. Pivot Rows Into Columns
SELECT *
FROM
(
    SELECT dept_id,
           year,
           salary
    FROM employee_salary
) src
PIVOT
(
    SUM(salary)
    FOR year IN ([2023], [2024], [2025])
) p;
```

```sql id="hdd5jl"
-- 148. Remove Duplicates Keeping Latest Row
DELETE FROM employees
WHERE emp_id NOT IN
(
    SELECT MAX(emp_id)
    FROM employees
    GROUP BY email
);
```

```sql id="4kgqzy"
-- 149. Most Sold Product
SELECT product_id,
       COUNT(*) AS total_sales
FROM orders
GROUP BY product_id
ORDER BY total_sales DESC
LIMIT 1;
```

```sql id="yicnyc"
-- 150. Find Percentage Contribution
SELECT product_id,
       sales_amount,
       ROUND(
           sales_amount * 100.0 /
           SUM(sales_amount) OVER(),
           2
       ) AS percentage_contribution
FROM sales;
```
















