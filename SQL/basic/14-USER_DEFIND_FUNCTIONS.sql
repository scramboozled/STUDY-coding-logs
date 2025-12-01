-- User Defined Functions
-- extends users to define function
-- can be created using SQL,PLPGSQL,PYTHON,C

;

-- Custom Functions can be created by users to be used in queries.
CREATE OR REPLACE FUNCTION date_splitter(input_date TIMESTAMPTZ)
RETURNS JSONB
LANGUAGE plpgsql
AS '
DECLARE
DATE_JSON JSONB;
BEGIN
    SELECT jsonb_build_object(
        ''day'',   EXTRACT(DAY   FROM input_date),
        ''month'', EXTRACT(MONTH FROM input_date),
        ''year'',  EXTRACT(YEAR  FROM input_date),
        ''week'',  EXTRACT(WEEK  FROM input_date)
    ) INTO DATE_JSON;
	RETURN DATE_JSON;
END;
';


SELECT DATE_SPLITTER(PAYMENT_DATE),PAYMENT_DATE FROM PAYMENT;

	