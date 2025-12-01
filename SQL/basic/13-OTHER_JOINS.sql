CREATE TABLE employee (
	employee_id INT,
	name VARCHAR (50),
	manager_id INT
);

INSERT INTO employee 
VALUES
	(1, 'Liam Smith', NULL),
	(2, 'Oliver Brown', 1),
	(3, 'Elijah Jones', 1),
	(4, 'William Miller', 1),
	(5, 'James Davis', 2),
	(6, 'Olivia Hernandez', 2),
	(7, 'Emma Lopez', 2),
	(8, 'Sophia Andersen', 2),
	(9, 'Mia Lee', 3),
	(10, 'Ava Robinson', 3);

-- SELF JOIN -> Joining the table to itself to elaborate the infromation 
select 
e1.employee_id,
e1.name as employee_name,
e1.manager_id, 
e2.name as manager_name  
from employee e1
left join employee e2 on e2.employee_id = e1.manager_id;

-- CROSS JOIN -> Cartesian Product of two table with all combination of rows
-- does not require any reference/foreign key
select 
*
FROM
staff 
CROSS JOIN store;

-- NATURAL JOIN -> Automatically joins using columns with same column name without any reference pointing out
SELECT 
FIRST_NAME,
LAST_NAME,
SUM(AMOUNT)
FROM PAYMENT
NATURAL INNER JOIN CUSTOMER
group by 1,2
order by 3 desc;