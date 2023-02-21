Importieren Sie den SQL-Dump (siehe Vorbereitung dieses Blocks) der Datenbank Sakila auf ihren MariaDB Server und analysieren Sie die Datenbank. Beantworten Sie folgende Antworten:

Hinweiss: Verwenden sie dafür die SQL Befehle DESCRIBE und SELECT sowie das Datenbank-Schema (png/mwb) um die Fragen zu beantworten.

1. Welche Tabellen sind in der Datenbank vorhanden und wie sind diese mit Primär- und Fremdschlüssel verbunden?
2. Was wird in dieser Datenbank reps. in den einzelnen Tabellen gespeichert?
3. Was ist der Umfang der in der Datenbank gespeicherten Daten?
4. Welchen Geschäftsprozess bildet die Datenbank Sakila ab?

### Ananlysis of the sakila database

Here we checked which tables are used and which are not getting used.

| actor                      \|    |
|----------------------------------|
| \| actor_info                 \| |
| \| address                    \| |
| \| category                   \| |
| \| city                       \| |
| \| country                    \| |
| \| customer                   \| |
| \| customer_list              \| |
| \| film                       \| |
| \| film_actor                 \| |
| \| film_category              \| |
| \| film_list                  \| |
| \| film_text                  \| |
| \| inventory                  \| |
| \| language                   \| |
| \| nicer_but_slower_film_list \| |
| \| payment                    \| |
| \| rental                     \| |
| \| sales_by_film_category     \| |
| \| sales_by_store             \| |
| \| staff                      \| |
| \| staff_list                 \| |
| \| store                         |

### Foreign Keys and Primary Keys in the Database

as seen in the picture are are being used but not all have attributes inside them.

Here we checked which foreignkeys and primarykeys are linked to eachother and which foreignkeys and primarykeys exist.


| TABLE_NAME    | COLUMN_NAME          | CONSTRAINT_NAME           | REFERENCED_TABLE_NAME | REFERENCED_COLUMN_NAME |
|---------------|----------------------|---------------------------|-----------------------|------------------------|
| customer      | fk_zip_id            | customer_ibfk_1           | zip                   | id                     |
| address       | city_id              | fk_address_city           | city                  | id                     |
| city          | country_id           | fk_city_country           | country               | id                     |
| customer      | address_id           | fk_customer_address       | address               | id                     |
| customer      | store_id             | fk_customer_store         | store                 | id                     |
| film          | language_id          | fk_film_language          | language              | id                     |
| film          | original_language_id | fk_film_language_original | language              | id                     |
| film_actor    | actor_id             | fk_film_actor_actor       | actor                 | id                     |
| film_actor    | film_id              | fk_film_actor_film        | film                  | id                     |
| film_category | category_id          | fk_film_category_category | category              | id                     |
| film_category | film_id              | fk_film_category_film     | film                  | id                     |
| inventory     | store_id             | fk_inventory_store        | store                 | id                     |
| inventory     | film_id              | fk_inventory_film         | film                  | id                     |
| payment       | customer_id          | fk_payment_customer       | customer              | id                     |
| payment       | rental_id            | fk_payment_rental         | rental                | id                     |
| payment       | staff_id             | fk_payment_staff          | staff                 | id                     |
| rental        | customer_id          | fk_rental_customer        | customer              | id                     |
| rental        | inventory_id         | fk_rental_inventory       | inventory             | id                     |
| rental        | staff_id             | fk_rental_staff           | staff                 | id                     |
| staff         | address_id           | fk_staff_address          | address               | id                     |
| staff         | store_id             | fk_staff_store            | store                 | id                     |
| store         | address_id           | fk_store_address          | address               | id                     |
| store         | manager_staff_id     | fk_store_staff            | staff                 | id                     |

I found this out with the following Script:

```` SQL
SELECT    KCU.TABLE_NAME, KCU.COLUMN_NAME, KCU.CONSTRAINT_NAME, KCU.REFERENCED_TABLE_NAME, KCU.REFERENCED_COLUMN_NAME FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE KCU WHERE    KCU.TABLE_NAME IN ('actor', 'actor_info', 'address', 'category', 'city', 'country', 'customer', 'customer_list', 'film', 'film_actor', 'film_category', 'film_list', 'film_text', 'inventory', 'language', 'nicer_but_slower_film_list', 'payment', 'rental', 'sales_by_film_category', 'sales_by_store', 'staff', 'staff_list', 'store')   AND KCU.REFERENCED_TABLE_NAME IS NOT NULL;
````

### attributes in table

Each tables have the following attributes:

| TABLE_NAME                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | COLUMN_NAME                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| customer<br>customer<br>customer<br>customer<br>customer<br>customer<br>category<br>category<br>customer<br>customer<br>customer<br>customer<br>customer<br>customer<br>customer<br>customer<br>actor<br>actor<br>actor<br>actor<br>actor_info<br>actor_info<br>actor_info<br>actor_info<br>address<br>address<br>address<br>address<br>address<br>address<br>address<br>address<br>category<br>category<br>category<br>city<br>city<br>city<br>city<br>country<br>country<br>country<br>customer<br>customer<br>customer<br>customer<br>customer<br>customer<br>customer<br>customer<br>customer<br>customer_list<br>customer_list<br>customer_list<br>customer_list<br>customer_list<br>customer_list<br>customer_list<br>customer_list<br>customer_list<br>film<br>film<br>film<br>film<br>film<br>film<br>film<br>film<br>film<br>film<br>film<br>film<br>film<br>film_actor<br>film_actor<br>film_actor<br>film_category<br>film_category<br>film_category<br>film_list<br>film_list<br>film_list<br>film_list<br>film_list<br>film_list<br>film_list<br>film_list<br>film_text<br>film_text<br>film_text<br>inventory<br>inventory<br>inventory<br>inventory<br>language<br>language<br>language<br>nicer_but_slower_film_list<br>nicer_but_slower_film_list<br>nicer_but_slower_film_list<br>nicer_but_slower_film_list<br>nicer_but_slower_film_list<br>nicer_but_slower_film_list<br>nicer_but_slower_film_list<br>nicer_but_slower_film_list<br>payment<br>payment<br>payment<br>payment<br>payment<br>payment<br>payment<br>rental<br>rental<br>rental<br>rental<br>rental<br>rental<br>rental<br>sales_by_film_category<br>sales_by_film_category<br>sales_by_store<br>sales_by_store<br>sales_by_store<br>staff<br>staff<br>staff<br>staff<br>staff<br>staff<br>staff<br>staff<br>staff<br>staff<br>staff<br>staff_list<br>staff_list<br>staff_list<br>staff_list<br>staff_list<br>staff_list<br>staff_list<br>staff_list<br>store<br>store<br>store<br>store | id<br>name<br>postal_code<br>location<br>email<br>phone<br>id<br>category<br>id<br>fk_zip_id<br>firstname<br>lastname<br>adress<br>email<br>password<br>phone<br>actor_id<br>first_name<br>last_name<br>last_update<br>actor_id<br>first_name<br>last_name<br>film_info<br>address_id<br>address<br>address2<br>district<br>city_id<br>postal_code<br>phone<br>last_update<br>category_id<br>name<br>last_update<br>city_id<br>city<br>country_id<br>last_update<br>country_id<br>country<br>last_update<br>customer_id<br>store_id<br>first_name<br>last_name<br>email<br>address_id<br>active<br>create_date<br>last_update<br>ID<br>name<br>address<br>zip code<br>phone<br>city<br>country<br>notes<br>SID<br>film_id<br>title<br>description<br>release_year<br>language_id<br>original_language_id<br>rental_duration<br>rental_rate<br>length<br>replacement_cost<br>rating<br>special_features<br>last_update<br>actor_id<br>film_id<br>last_update<br>film_id<br>category_id<br>last_update<br>FID<br>title<br>description<br>category<br>price<br>length<br>rating<br>actors<br>film_id<br>title<br>description<br>inventory_id<br>film_id<br>store_id<br>last_update<br>language_id<br>name<br>last_update<br>FID<br>title<br>description<br>category<br>price<br>length<br>rating<br>actors<br>payment_id<br>customer_id<br>staff_id<br>rental_id<br>amount<br>payment_date<br>last_update<br>rental_id<br>rental_date<br>inventory_id<br>customer_id<br>return_date<br>staff_id<br>last_update<br>category<br>total_sales<br>store<br>manager<br>total_sales<br>staff_id<br>first_name<br>last_name<br>address_id<br>picture<br>email<br>store_id<br>active<br>username<br>password<br>last_update<br>ID<br>name<br>address<br>zip code<br>phone<br>city<br>country<br>SID<br>store_id<br>manager_staff_id<br>address_id<br>last_update |

I checked it with the following Script:

```` SQL
SELECT TABLE_NAME, COLUMN_NAME
FROM INFORMATION_SCHEMA.COLUMNS
WHERE TABLE_NAME IN ('actor', 'actor_info', 'address', 'category', 'city', 
'country', 'customer', 'customer_list', 'film', 'film_actor', 'film_category', 
'film_list', 'film_text', 'inventory', 'language', 'nicer_but_slower_film_list', 
'payment', 'rental', 'sales_by_film_category', 'sales_by_store', 'staff', 
'staff_list', 'store');
````


### Size of DB

 Now we checked how big our Databases are.

| sakila                                                                                             | Database Size (MB)                                                                                                                                   |
|----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------|
| information_schema<br>mysql<br>performance_schema<br>pizzakurier<br>pizza_express<br>sakila<br>sys | 0.20312500<br>         2.60156250<br>         0.00000000<br>         0.17187500<br>         0.21875000<br>         6.37500000<br>         0.03125000 |

I checked it with the following Script:

```` SQL
SELECT table_schema "Database Name", sum( data_length + index_length ) / 1024 / 1024 "Database Size (MB)" FROM information_schema.tables GROUP BY table_schema ;
```` 

### Businessplan sakila

The Database sakila shows a businessplan of a cinema or a video-rental-place like blockbuster.