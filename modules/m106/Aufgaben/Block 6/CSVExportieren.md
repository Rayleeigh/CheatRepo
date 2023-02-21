## Exportieren einer CSV Datei

In diesem Auftrag mussten man eine CSV-Datei aus einer Tabelle in einer Datenbank exportieren.

In diesem Falle war die Datenbank `sakila` und die Tabelle aus der man einzelne Attribute rauslesen und speichern musste, die Tabelle customer.

Man musste folgende einzelne Attribute aus der Tabelle herauslesen

customer_id, first_name, last_name, email und create_date.

Das Exportieren in eine CSV-Datei [Commaseperatedvalue-Datei] wird mir folgendem Script möglich.

```` SQL
SELECT customer_id, first_name, last_name, email, create_date
FROM customer INTO OUTFILE 'C:/SQL/csv/customerData.csv'
FIELDS TERMINATED BY ","
ENCLOSED BY "'"
LINES TERMINATED by '\r\n';
````