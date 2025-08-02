--Activity 1: Create a salesman table 
 CREATE TABLE salesman(salesman_id int , salesman_name varchar2(20),salesman_city varchar2(20),commission int );
 DESCRIBE salesman;

-- Insert Data into the Salesman table
-- Insert one row
INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);
INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);
SELECT * FROM salesman;
-- Insert multiple rows at once
INSERT ALL
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;

-- View data from all columns
SELECT * FROM salesman;

--Activity 3
--Show data from the salesman_id, salesman_city from salesman table
SELECT salesman_id,salesman_city FROM salesman; 

--Show all data from the salesman table where salesman_city from PARIS
SELECT * FROM salesman WHERE salesman_city = 'Paris';

-- Show salesman_id, commission where salesman name = 'Paul Adam' 
SELECT salesman_id, commission FROM salesman WHERE salesman_name = 'Paul Adam';

--Activity 4 Adding a new column to the salesman table

ALTER TABLE salesman ADD grade int;
UPDATE salesman SET grade = 100;
SELECT * FROM salesman;

--Activity 5 
UPDATE salesman SET grade = 200 WHERE salesman_city = 'Rome';

UPDATE salesman SET grade = 300 WHERE salesman_name = 'James Hoog';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

SELECT * FROM salesman;

SELECT * FROM salesman ORDER BY grade DESC, commission ASC ; 
