## Commands SQL

```` SQL
SHOW DATABASES; //Zeigt alle Datenbanken an, die eingbunden worden sind.
SHOW TABLES; // Zeigt alle Tabellen in einer Datenbank an.
USE [DATABASE_NAME] //Lässt dich die Datenbank benützen und verändern.
SOURCE [PATH TO SCRIPT].sql //Lässt dich ein SQL-Script in die Datenbank einbinden.
````

## Commands DML

Syntax

```` SQL
INSERT INTO [table name] ([attriubutes], ...) VALUES ("[VALUES]");

or 

INSERT INTO [table name] ([attriubutes], ...) VALUES
("[Value]", "[Value]", "[Value]", "[Value]",),
("[Value]", "[Value]", "[Value]", "[Value]",),
("[Value]", "[Value]", "[Value]", "[Value]",),
("[Value]", "[Value]", "[Value]", "[Value]",),
("[Value]", "[Value]", "[Value]", "[Value]",);

The above shown commands insert new Values inside the table.

--- 

UPDATE <table_name> SET <attribute> = <value>, <attribute> = <value> WHERE <attribute> = <value> AND <attribute> = <value>

The above shown command replaces or Upadates the attribute shown behind WHERE with the attribute behind SET.

---

DELETE FROM [table name] WHERE [attribute]=[attribute_value];

This command deletes values inside a table by giving the attribute and its corresponding value.

example for this command:

DELETE FROM product WHERE product = 'P02';

````

## Commands TCL

```` SQL
BEGIN

...

COMMIT or ROLLBACK;

COMMIT - Saves the changes

ROLLBACK - Discards the changes
````

## Commands DCL

```` SQL
CREATE USER <username> @'<location>' IDENTIFED BY '23456';
GRANT <permission>, ... ON <database>.<table> TO <username>@'<location>';
SET PASSWORD FOR <username>@'<location>' = PASSWORD '12345';
FLUSH PRIVILEGES;
DROP USER <username>@'<location>';
````

## Commands DRL

```` SQL
SELECT [DISTINCT] (* | <attribute, attribute> | <mathematical terms> | <functions>);

The above shown command retrieves the data from all the columns of the table.

FROM -- Is used for selecting table name in database.
WHERE -- it specifies which rows to retrieve.
GROUP BY -- is used to arrange the data into groups.
HAVING -- selects among the groups defined BY the GROUP BY clause.
ORDER BY -- specifies an order in which to return the rows.
LIMIT -- provides an alias which can be used to temporarily rename tables or columns.
````

## COMMANDS 

```` SQL
SELECT wins, COUNT(*) FROM plays GROUP BY wins;
````

