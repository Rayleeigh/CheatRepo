## SQL Abfragen Sakila

Unten in diesem Dokument hat es mehrere SQL-Scripts, die verschiedene Tupel 

Mit dem folgendem Command kann man eine 

Anzahl Datensätze in der Tabelle payment

SELECT count(*) as 'Anzahl Datensätze' From payment;

#Anzahl Schauspieler mit dem Namen Julia
SELECT count(*) as 'Anzahl Julias' From actor WHERE first_name LIKE 'Julia';

#Anzahl inaktive Kunden
SELECT count(*) as 'Anzahl inaktive Kunden' from customer WHERE active LIKE '0';

#Durchschnittliche Länge der Filme mit Rating "PG"
SELECT AVG(`length`) FROM film WHERE rating = 'PG';

#Ausleihen, die noch nicht zurück gebracht wurden, sortiert nach Ausleihdatum (Format: dd.mm.YYYY)
SELECT * FROM rental WHERE return_date IS NULL ORDER BY rental_date;

#Berechnen Sie die durchschnittliche Ausleihdauer in Tagen
SELECT AVG(Datediff(return_date, rental_date)) as "Durchschnittliche Ausleihedauer" FROM rental;

#Liste der Vornamen von Schauspielern, deren Vorname nur 3 Buchstaben lang ist. Zeigen Sie keine doppelten Vornamen an
SELECT DISTINCT(first_name) FROM actor WHERE first_name LIKE '___';

#Erstellen Sie eine Liste der Schauspieler, deren Nachname mit 'B' beginnt und an zweitletzter Stelle ein 'e' haben. Zeigen Sie keine doppelten Namen an
SELECT DISTINCT(last_name) FROM actor WHERE last_name LIKE 'B%e_';

#Zählen Sie bei allen Datensätzen der Tabelle "rental" 12 Jahre zu Ausleih- und Rückgabedatum dazu
UPDATE rental SET return_date = DATE_ADD(return_date, INTERVAL 12 YEAR), rental_date = DATE_ADD(rental_date, INTERVAL 12 YEAR);

#Erstellen Sie eine neue Kategorie namens "Art"
INSERT INTO category (name) VALUE ('Art');