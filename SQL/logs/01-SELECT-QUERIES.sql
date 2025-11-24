-- 1. SELECT query will fetch the data of specified column from the database
-- 2. * will fetch all the columns under the give FROM table
-- 3. Instead of column name we can provide column number in accordance with select query
-- 4. Default value of order by clause is ascending if you neglect to specify ASC/DESC
-- 5. DISTINCT will provide unique values on specified set of columns
-- 6. COUNT is a function that will retrieve the number of record in the scenario given


-- query to select specified columns from a table
SELECT FIRST_NAME, LAST_NAME, EMAIL FROM CUSTOMER;

-- query to select all columns from a table
SELECT * FROM CUSTOMER;

-- query to sort records ASCENDING/DESCENDING
SELECT FIRST_NAME, LAST_NAME, EMAIL
FROM CUSTOMER
ORDER BY FIRST_NAME ASC, LAST_NAME DESC;

-- Instead of column name we can provide column number in accordance with select query
-- Default value of order by clause is ascending if you neglect to specify ASC/DESC
SELECT FIRST_NAME, LAST_NAME, EMAIL
FROM CUSTOMER
ORDER BY 1, 2 DESC;

-- DISTINCT will provide unique values on specified set of columns.
SELECT FIRST_NAME, LAST_NAME, EMAIL
FROM CUSTOMER
ORDER BY 1, 2 DESC;

-- COUNT is a function that will retrieve the number of record in the scenario given
SELECT COUNT(*)
FROM CUSTOMER;


-- EXAMPLES
SELECT DISTINCT DISTRICT FROM ADDRESS ORDER BY 1;

SELECT RENTAL_DATE FROM RENTAL ORDER BY 1 DESC LIMIT 1;

SELECT COUNT(FILM_ID) FROM FILM;

SELECT COUNT(DISTINCT LAST_NAME) FROM CUSTOMER;

