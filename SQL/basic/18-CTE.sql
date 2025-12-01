-- Common Table Expression are temporary result 
-- that can be used to store a result in run time and use it later in another query

WITH FILM_RENTALS AS
(
SELECT F.FILM_ID, F.TITLE, COUNT(R.RENTAL_ID) AS RENTAL_COUNT
FROM FILM F
JOIN INVENTORY I ON F.FILM_ID = I.FILM_ID
JOIN RENTAL R ON I.INVENTORY_ID = R.INVENTORY_ID
GROUP BY F.FILM_ID, F.TITLE
) 
SELECT FILM_ID, TITLE, RENTAL_COUNT
FROM
FILM_RENTALS
WHERE RENTAL_COUNT > 30;

-- multiple CTEs can be used in query to retrieve data

WITH customer_totals AS (
    SELECT c.customer_id, c.first_name, c.last_name,
           COUNT(r.rental_id) AS rental_count,
           SUM(p.amount) AS total_amount
    FROM customer c
    JOIN rental r ON c.customer_id = r.customer_id
    JOIN payment p ON c.customer_id = p.customer_id AND p.rental_id = r.rental_id
    GROUP BY c.customer_id, c.first_name, c.last_name
),
average_rental_count AS (
    SELECT AVG(rental_count) AS avg_rental_count
    FROM customer_totals
)
,
high_rental_customers AS (
    SELECT ct.customer_id, ct.first_name, ct.last_name, ct.rental_count, ct.total_amount
    FROM customer_totals ct
    JOIN average_rental_count arc ON ct.rental_count > arc.avg_rental_count
)
SELECT hrc.customer_id, hrc.first_name, hrc.last_name, hrc.rental_count, hrc.total_amount, f.film_id, f.title
FROM high_rental_customers hrc
JOIN rental r ON hrc.customer_id = r.customer_id
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id;


-- RECURSIVE CTE -> CTE CREATED TO PULL DATA UNTIL A SPECIFIED CONDITION IS MET
-- Create the employee table
DROP TABLE IF EXISTS EMPLOYEE;

CREATE TABLE IF NOT EXISTS employee (
    employee_id INTEGER PRIMARY KEY,
    name TEXT NOT NULL,
    manager_id INTEGER REFERENCES employee(employee_id)
);
 
-- Insert sample data to establish an employee hierarchy
INSERT INTO employee (employee_id, name, manager_id) VALUES
(1, 'Alice', NULL),       -- Alice is the CEO, no manager
(2, 'Bob', 1),            -- Bob reports to Alice
(3, 'Charlie', 1),        -- Charlie reports to Alice
(4, 'David', 2),          -- David reports to Bob
(5, 'Eve', 2),            -- Eve reports to Bob
(6, 'Frank', 3);          -- Frank reports to Charlie

WITH RECURSIVE cte AS (
-- anchor
    SELECT 
        e.employee_id,
        e.name,
        e.manager_id,
        0 AS level_depth
    FROM employee e
    WHERE e.employee_id = 1
    UNION ALL
-- recursive
    SELECT 
        e.employee_id,
        e.name,
        e.manager_id,
        c.level_depth + 1 AS level_depth
    FROM employee e
    INNER JOIN cte c 
        ON c.employee_id = e.manager_id
)
SELECT *
FROM cte;
