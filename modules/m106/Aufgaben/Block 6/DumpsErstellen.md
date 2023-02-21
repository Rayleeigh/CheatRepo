## Dumps kreeieren

#### DUMP von DB Sakila

Ich habe einen Dump von der Database `sakila` erstellt. Dieser kann man, dann verwenden wie ein Backup für die Database `sakila`.
Dies habe ich mit dem folgenden command gemacht.

```` SQL
mysqldump.exe -u root -p sakila > C:/SQL/dump/sakila_dump.sql;
````

Versichere dich, dass du **NICHT** mit MariaDB verbunden bist sondern mit MySQL.exe

#### DUMP von allen Datenbanken

Ich habe einen Dump von allen Databases erstellt, dieser kann man wie den oberen dump als Backup für alle Datenbanken verwenden, dies habe ich mit dem untenstehenden Command geschafft.
````
mysqldump.exe -u root -p --all-databases > C:/SQL/dump/alldatabases_dump.sql
````

Versichere dich hier ebenfalls, dass du **NICHT** mit MariaDB verbunden bist sondern mit MySQL.exe