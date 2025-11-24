-- 01. WHERE clause is used to filter the data based on a condition
-- 02. NULL represent an empty record. They don't have any value and wont through any comparison operators
-- 03. AND/OR are used to combine two conditions
-- 04. AND given more precedence than OR statment. AND are executed first.
-- 05. BETWEEN is used to filter range of values
-- 06. BETWEEN will have both values inclusive and NOT BETWEEN will exclude them
-- 07. IN operator is used to filter based a list given
-- 09. LIKE operator is used to filter wildcard related strings
-- 10. _ -> a single character
-- 11. % -> one more character

-- WHERE clause is used to filter the data based on a condition
SELECT COUNT(*)
FROM PAYMENT WHERE CUSTOMER_ID = 100;

SELECT first_name,last_name
FROM CUSTOMER WHERE FIRST_NAME = 'ERICA';


-- NULL represent an empty record. They don't have any value and wont through any comparison operators
SELECT * FROM RENTAL WHERE RETURN_DATE IS NULL;

-- AND/OR are used to combine two conditions
-- AND given more precedence than OR statment. AND are executed first.
SELECT * FROM RENTAL WHERE RENTAL_ID = 11496 AND INVENTORY_ID = 2047;


-- BETWEEN is used to filter range of values
-- BETWEEN will have both values inclusive and NOT BETWEEN will exclude them
SELECT * FROM RENTAL WHERE RENTAL_DATE BETWEEN '2020-02-01' AND '2020-02-29 23:59';
SELECT * FROM RENTAL WHERE RENTAL_DATE NOT BETWEEN '2020-02-01' AND '2020-02-29 23:59';

-- IN operator is used to filter based a list given
SELECT * FROM RENTAL WHERE RENTAL_ID IN (11496,11541,12101,11563);
SELECT * FROM RENTAL WHERE RENTAL_ID NOT IN (11496,11541,12101,11563);

-- LIKE operator is used to filter wildcard related strings
-- _ -> a single character
-- % -> one more character
SELECT * FROM CUSTOMER WHERE FIRST_NAME LIKE 'AD%';
SELECT * FROM CUSTOMER WHERE FIRST_NAME NOT LIKE 'AD%';
SELECT * FROM CUSTOMER WHERE FIRST_NAME LIKE ANY (ARRAY['AD%','BAR%']);