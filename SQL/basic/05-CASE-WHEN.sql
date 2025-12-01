-- CASE WHEN Statements

select * from demo.bookings.bookings;

SELECT CASE 
WHEN extract(MONTH from BOOK_DATE) between 1 and 3 then 'Autumn'
WHEN extract(MONTH from BOOK_DATE) between 4 and 6 then 'Summer'
WHEN extract(MONTH from BOOK_DATE) between 7 and 9 then 'Autumn'
WHEN extract(MONTH from BOOK_DATE) between 10 and 12 then 'Winter' END as season, count(*) from bookings.bookings group by 1;

-- CASE WHEN along with SUM

SELECT 
SUM(CASE WHEN RATING IN ('PG','G') THEN 1 ELSE 0 END) AS PG_G_COUNT,
SUM(CASE WHEN RATING NOT IN ('PG','G') THEN 1 ELSE 0 END) AS NON_PG_G_COUNT
FROM
FILM;

-- COALESCE -- Null Exception Handler
SELECT 
ACTUAL_ARRIVAL,
SCHEDULED_ARRIVAL,
COALESCE(ACTUAL_ARRIVAL, SCHEDULED_ARRIVAL)
FROM FLIGHTS;

-- CAST -> datatype change
SELECT 
COALESCE(CAST(ACTUAL_ARRIVAL AS VARCHAR), 'NOT YET ARRIVED')
FROM FLIGHTS;


-- REPLACE -> REPLACE CHARACTER IN STRING
SELECT
REPLACE(FLIGHT_NO,'PG','')
FROM 
FLIGHTS;