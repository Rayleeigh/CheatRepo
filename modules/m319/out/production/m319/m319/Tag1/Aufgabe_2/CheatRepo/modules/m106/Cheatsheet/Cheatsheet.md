## Normalisierung

1. 1.NF

1.NF ist dann gegeben, wenn alle Attributwerte atomar sind. Dabei ist ein Attribut dann atomar, wenn es weder aus kleineren Einheiten zusammengesetzt ist, noch mehrwertig ist.

2. 2.NF

2.NF ist dann gegeben, wenn sie in der ersten Normalform ist und jedes Nichtschlüsselattribut von jedem Schlüssel voll funktional abhängig ist. Konkret heisst das, dass Nichtschlüsselattribute vom kompletten Schlüssel und nicht nur von einem Teil des Schlüssels abhängen müssen.

3. 3.NF
   
3.NF ist dann gegeben, wenn sie in der ersten und zweiten Normalform vorliegt und kein Nichtschlüsselattribut von (irgend)einem Schlüssel transitiv abhängt. Um eine transitive Abhängigkeit also auszuschließen, dürfen alle Nichtschlüsselattribute nicht von anderen Nichtschlüsselattributen abhängig sein

## System Commands

| COMMAND                    | Syntax                                     | EXAMPLE                         |
|----------------------------|--------------------------------------------|---------------------------------|
| mysql                      | MYSQL -U <username> -P;                    | MYSQL -u rayan@'localhost' -P;  |
| exit                       | EXIT;                                      | EXIT;                           |
| create   database          | CREATE DATABASE   <database_name>;         | CREATE DATABASE sakila;         |
| delete   database          | DROP DATABASE   <database_name>;           | DROP DATABASE sakila;           |
| delete   database if exist | DROP DATABASE IF EXISTS   <database_name>; | DROP DATABASE IF EXISTS sakila; |
| show all   Databases       | SHOW DATABASES;                            | SHOW DATABASES;                 |
| open   databank            | USE <databank_name>;                       | USE sakila;                     |

## DDL - Tables

| COMMAND                         | SYNTAX                                                                                                       | EXAMPLE                                                        |
|---------------------------------|--------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------|
| create table                    | CREATE   TABLE [Tabellen Name] ([Attribut Name] [Datentype] [Constraint]);                                   | CREATE   TABLE mitglieder(                                     |
|                                 |                                                                                                              | id INT   AUTO_INCREMENT,                                       |
|                                 |                                                                                                              | firstname   VARCHAR(45) NOT NULL,                              |
|                                 |                                                                                                              | PRIMARY   KEY(id)                                              |
|                                 |                                                                                                              | );                                                             |
| delete table                    | DROP   TABLE [Tabellen Name]                                                                                 | DROP   TABLE                                                   |
| show table                      | SHOW   TABLES;                                                                                               | SHOW   TABLES;                                                 |
| show tables in structured order | DESCRIBE   [table name];                                                                                     | DESC   user;                                                   |
| edit table (add attribute)      | ALTER   TABLE [table_name] ADD [attribut_name] [datatype] [CONSTRAINTS, KEYS,   INDEXES];                    | ALTER   TABLE mitglieder ADD Nachname VARCHAR(50) NOT NULL     |
| edit table (edit attribute)     | ALTER   TABLE [table_name] MODIFY [attribut_name] [NEW_datatype] [NEW_CONSTRAINTS,   NEW_KEYS, NEW_INDEXES]; | ALTER   TABLE mitglieder MODIFY Nachname TEXT NOT NULL;        |
| edit table (rename attribute)   | ALTER   TABLE [table_name] CHANGE [attribut_name] [NEW_attribut_name] [datatype];                            | ALTER   TABLE mitglieder CHANGE Nachname lastname VARCHAR(50); |
| edit table (delete attribute)   | ALTER   TABLE [table_name] DROP [attribut_name];                                                             | ALTER   TABLE mitglieder DROP Nachname;                        |

## DCL - User and Privilages

| COMMAND                  | SYNTAX                                                                                   | EXAMPLE                                                                      |
|--------------------------|------------------------------------------------------------------------------------------|------------------------------------------------------------------------------|
| apply   changes          | FLUSH   PRIVILEGES;                                                                      | FLUSH   PRIVILEGES;                                                          |
| create user              | CREATE   USER <username>@'<location>' IDENTIFIED BY '23456’;                             | mysql>   CREATE USER backoffice@'localhost' IDENTIFIED BY '23456’;           |
| delete user              | DROP   USER <username>@'<location>';                                                     | DROP   USER backoffice@'localhost';                                          |
| set password             | SET   PASSWORD FOR <username>@'<location>’ = PASSWORD('<Dein   Passwort>’);              | mysql>   SET PASSWORD FOR backoffice @'localhost' = PASSWORD('12345’);       |
| rename user              | RENAME   USER <username>@'<location>’ TO   <username2>@'<location2>’;                    | RENAME   USER backoffice@'localhost’ TO backoffice2@'%’;                     |
| grant privileges         | GRANT   <PERMISSION>,<PERMISSION> ON <database>.<table> TO   <username>@'<location>’;    | GRANT   INSERT,UPDATE,DELETE ON lounge.mitglieder TO backoffice@'localhost’; |
| revoke/remove privileges | REVOKE   <PERMISSION>,<PERMISSION> ON <database>.<table> FROM   <username>@'<location>’; | REVOKE   DELETE, UPDATE ON lounge.* FROM office@'localhost’;                 |
| show privileges for user 	| SHOW   GRANTS FOR <username>@'<location>’;                                               	| SHOW   GRANTS FOR backoffice@’localhost
                                      	|

## DML - Data processing

| COMMAND         | SYNTAX                                                                                                           | EXAMPLE                                                                    |
|-----------------|------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------|
| insert   values | INSERT   INTO <table_name> (<atribut_name>, <atribut_name>, …)   VALUES (<value1>, <value2>…);                   | INSERT   INTO mitglieder (name, firstname, age) VALUES                     |
| edit data       | UPDATE   <table_name> SET <atribut_neu> = <value1>,   <atribut_alt> = <value2> WHERE <atribut_name> =   <value>; | UPDATE   mitglieder SET firstname = 'Markus' WHERE firstname = 'Tobias';   |
| delete data     | DELETE   FROM <table_name> WHERE <atribut_name> = <value>;                                                       | DELETE   FROM mitglieder WHERE firstname = 'Robin' AND name = 'Schneider'; |

## TCL - Transaciton for DML

| COMMAND   | DESCRIPTION                                                                                                                                                            |
|-----------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| BEGIN;    | With the "BEGIN"   command the database is stored locally virtually. This means everything that   is written from now on will not be changed directly on the database. |
| COMMIT;   | If   the entered commands were successful, you can use "COMMIT" to apply   the changes to the official database and the virtual one will be deleted.                   |
| ROLLBACK; | If the commands entered did not   give a good result, you can use "ROLLBACK" to discard the changes   and start over.                                                  |

## DRL - GROUP BY

| COMMAND  | SYNTAX                                                                             | EXAMPLE                                                                                        |
|----------|------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------|
| GROUP BY | SELECT   <Attribut>, <Attribut2> FROM <Table> GROUP BY   <option>;                 | SELECT   rating, MIN(length), MAX(length) FROM film GROUP BY rating;                           |
| HAVING   | SELECT   <Attribut>, <Attribut2> FROM <Table> GROUP BY   <option> HAVING <Option>; | SELECT   rating, MIN(length), MAX(lengths) FROM film GROUP BY rating HAVING MIN(lenth)   > 63; |

## DRL - JOIN

| COMMAND      | SYNTAX                                                                                                                                            | EXAMPLE                                                                                                                                       |
|--------------|---------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------|
| INNER   JOIN | SELECT table1.column_name,   table2.column_name<br>     FROM table1<br>     INNER JOIN table2<br>     ON table1.column_name = table2.column_name; | SELECT   Orders.OrderID, Customers.CustomerName<br>     FROM Orders<br>     INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID; |
| LEFT   JOIN  | SELECT table1.column_name,   table2.column_name<br>     FROM table1<br>     LEFT JOIN table2<br>     ON table1.column_name = table2.column_name;  | SELECT Orders.OrderID,   Customers.CustomerName<br>     FROM Orders<br>     LEFT JOIN Customers ON Orders.CustomerID = Customers.CustomerID;  |
| RIGHT   JOIN | SELECT table1.column_name,   table2.column_name<br>     FROM table1<br>     RIGHT JOIN table2<br>     ON table1.column_name = table2.column_name; | SELECT Orders.OrderID,   Customers.CustomerName<br>     FROM Orders<br>     RIGHT JOIN Customers ON Orders.CustomerID = Customers.CustomerID; |

## DRL - addiotional

| COMMAND                                | SYNTAX                                                                                                  | DESCRIPTION                                                                                                                                              |
|----------------------------------------|---------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| show   all                             | SELECT * FROM   <table_name>;                                                                           | show all datasets in a table.                                                                                                                            |
| show   multiple attributes             | SELECT <attribute 1>,   <attribute 2>  FROM   <table_name>;                                             | shows multiple datasets in a   table.                                                                                                                    |
| attribute   with synonim               | SELECT <attribute 1> AS   <attribute 1 name>, <attribute 2> AS <attribute 2   name>  FROM <table_name>; | show the given attribute and   gives them a unique name.                                                                                                 |
| LIMIT   (output only given number)     | SELECT <attibute> FROM   <table> LIMIT 4;                                                               | outputs only 4 lines.                                                                                                                                    |
| LIMIT   (put OUTPUT on multiple pages) | SELECT <attibute> FROM   <table> LIMIT 2,3;                                                             | outputs only 4 lines over 3   pages.                                                                                                                     |
| lowest   value(MIN)                    | SELECT   MIN(<attribute_name>) FROM <table_name>                                                        | outputs the datapoint with the   lowest value within the given attribute                                                                                 |
| biggest   value(MAX)                   | SELCT MAX(<attibute_name>)   FROM <table_name>                                                          | outputs the datapoint with the   biggest value within the given attribute                                                                                |
| average   of value (AVG)               | SELECT   AVG(<attribtue_name>) FROM <table_name>                                                        | outputs the average of all   datapoints within the given attribute column                                                                                |
| count   datapoints(COUNT)              | SELECT   COUNT(<attribute_name>) FROM <table_name>                                                      | outputs how many datapoints   there are in an attributes column                                                                                          |
| WHERE                                  | SELECT <attribute1>   <attribute2> FROM <table> WHERE <attribute1> > 6 AND   <attribute1> < 12;         | This command gives datapoints   associated with attribute 1 that are greate than 6 and lesser than 12.                                                   |
| WHERE                                  | SELECT <attribute 1>   <attribute 2> FROM <table> WHERE <attribute 1> = 7 OR   <attribute 1> = 9;       | Outputs all datapoints that   match the value that ist being compared to.                                                                                |
| WHERE                                  | SELECT <attribute 1>   <attribute 2> FROM <table> WHERE <attribute 2> = 'ho' OR   <attribute 1> = 9;    | outputs all datapoints that   match the given parameters of the search query. It outputs every datapoint   where attribute 2 = 'ho' and attribute 1 = 9. |
| DESC                                   | SELECT <attibute 1>   <attribute 2> FROM <table>    ORDER BY <attribute 1> DESC;                        | orders the attributes in   ascending order, meaning the biggest value is first and the tiniest is last.                                                  |
| ASC                                    | SELECT <attribute 1>   <attribute 2> FROM <table> ORDER BY <attribute 1> ASC;                           | orders the attributes in   descending order, meaning the tiniest value is first and the biggest is last.                                                 |
| REVERSE                                | REVERSE(<attribute 1>)                                                                                  | reverses the order of how   attribute 1  is written for example if   attribute 1 is named dog it would mean god                                          |
| UPPER                                  | UPPER(<attribute 1>)                                                                                    | outputs the data point in   capital characters. For example if attribute 1 is named dog it would be DOG.                                                 |
| BIN also   work with HEX and DEZ       | BIN(<attribute 1>)                                                                                      | translates the data point into   binary. For example if attribute 1 is named dog it would be 1100100 1101111   1100111.                                  |

## Like Patterns

| LIKE   SYNTAX                  | SELECT   column1, column2, ...<br>     FROM table_name<br>     WHERE columnN LIKE pattern; |
|--------------------------------|--------------------------------------------------------------------------------------------|
| WHERE   CustomerName LIKE 'a%' | Finds any values that start with   "a"                                                     |
| WHERE CustomerName LIKE '%a'   | Finds any values that end with   "a"                                                       |
| WHERE CustomerName LIKE '%or%' | Finds any values that have "or"   in any position                                          |
| WHERE CustomerName LIKE '_r%'  | Finds any values that have "r"   in the second position                                    |
| WHERE CustomerName LIKE 'a_%'  | Finds any values that start with   "a" and are at least 2 characters in length             |
| WHERE CustomerName LIKE 'a__%' | Finds any values that start with   "a" and are at least 3 characters in length             |
| WHERE ContactName LIKE 'a%o'   | Finds any values that start with   "a" and ends with "o"                                   |

## Subquerys