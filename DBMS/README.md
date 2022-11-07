
# Types of Databases
- Hierarchical databases
- Network databases
- Object-oriented databases
- Relational databases
- NoSQL databases

# SQL
SQL is a programming language

• Manage data held in a relational database
• Easy to learn
• Very powerful
• 1974
• Used all over the internet
# How data is stored
### Stores data in tables
- Columns
- Rows

# TABLE
![alt text](DBMS_SS/DBMS1.jpg)
# Relational database
![alt text](DBMS_SS/DBMS2.jpg)

# sql language types
- TCL (Transaction Control Language)
- DML (Data Manipulation Language)
- DCL (Data Control Language)
- DDL (Data Definition Language)

# SQL COMMAND 

### LIST OF ALL DATA BASE 
- `\l`

### CREATE DATA BASE
````
    CREATE DATABASE database_name;
````
![alt text](DBMS_SS/1.jpg)

## Change Data base 
````
    \c database_name
````
![alt text](DBMS_SS/2.jpg)

# How to create table with Postgres 

### CREATE TABLE WITHOUT CONSTRAINTS
````
CREATE TABLE table name (
Column name + data type + constraints if any
)

CREATE TABLE person (
id int, 
first_name VARCHAR (50), 
last name VARCHAR (50), 
gender VARCHAR (6),
date of birth TIMESTAMP,
)
````
## show all table in database 
````
\d 
````
## show perticular table 
````
\d table_name   // it show all info about table
````
![alt text](DBMS_SS/3.jpg)

# How to Delete table in databases 
````
    DROP TABLE table_name;
````
# CREATE TABLE WITH CONSTRAINTS
````
CREATE TABLE person (
id BIGSERIAL NOT NULL PRIMARY KEY, 
first name VARCHAR (50) NOT NULL, 
last name VARCHAR (50) NOT NULL, 
gender VARCHAR (5) NOT NULL, 
date of birth DATE NOT NULL,
)
````
# INSERT DATA
![alt text](DBMS_SS/4.jpg)
![alt text](DBMS_SS/5.jpg)
# READ DATA FROM THE TABLE
````
        SELECT * FROM table_name;
        SELECT COLUMN_NAME FROM table_name;
````

# SORTING 
 ````
 SELECT * FROM person ORDER BY country_of_birth;
 SELECT * FROM person ORDER BY country_of_birth ASC ;
 SELECT * FROM person ORDER BY country_of_birth DESC ;
 ````
# REMOVING DUPLICATES
DISTINCT TAKE 1 COLUMN NAME
````
SELECT DISTINCT country_of_birth FROM person ORDER BY country_of_birth;
````
# WHERE CLAUSE
````
 SELECT * FROM person
 WHERE gender='Male';

 SELECT * FROM person
 WHERE gender='Male' AND country_of_birth='Poland';
````
# COMPARISON OPERATORS

# LIMIT OFFSET AND FETCH
````
SELECT * FROM person LIMIT 10;                 //DISPLAY UPPER 10 ROW 
SELECT * FROM person OFFSET 5 LIMIT 10;        // DISPLAY  UPPER 10 ROW AFTER 5 ROW

SELECT * FROM person OFFSET 5 FETCH FIRST 5 ROW ONLY;
````
# IN KEYWORD
````
===> BAD WAY 

SELECT * FROM person WHERE country_ôf_birth = 'China'
OR country_of_birth = 'France' OR country_of_birth = 'Brazil'

===> GOOD WAY

SELECT * test-# FROM person
WHERE country_of _birth IN ('China', 'Brazil', 'France")
````
# BETWEEN


















