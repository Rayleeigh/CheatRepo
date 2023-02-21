## Aufgabe 1.1: Datenbankmodelle und Datenbanktheorie

---

#### Datenbankmodell Beschreibung

**Hierarchische Datenbanken**

1. Können einfache Strukturen verwalten, in denen eine Entität direkt über mehrere Ebenen verwandt sein kann.
2. Speichern Daten in einer **Baumstruktur**, die eine hierarchische Struktur aufweist.
3. Jede Entität hat eine einzigartige Identifikationsnummer, die als Primärschlüssel bezeichnet wird.
4. Mehrere Child und Parent Datensätze.
5. Ermöglicht den Zugriff auf einzelne Datenpunkte, indem die Schlüsselwerte durchlaufen werden.
6. Es ist nicht erforderlich, eine explizite Struktur für die Daten zu definieren.
7. Der Speicherbedarf ist geringer als bei anderen Datenbanken.
8. Es ist schwieriger, Daten zu aktualisieren oder zu löschen.

**Relationale und Objektrelationale Datenbanken**

1. Speichern Daten in einer relationalen Struktur, die in Tabellen organisiert ist.
2. Verwenden eine Abfragesprache, die als SQL (Structured Query Language) bezeichnet wird.
3. Ermöglichen es, Daten zu aktualisieren, zu löschen, neue Spalten hinzuzufügen und bestehende Spalten zu ändern.
4. Ermöglichen Abfragen in mehreren Tabellen gleichzeitig.
5. Objektrelationale Datenbanken ermöglichen es, komplexe Objekte zu speichern und zu abzurufen.
6. Können eine große Anzahl von Anwendungen gleichzeitig unterstützen.
7. Ermöglichen es, Daten zu replizieren und zu sichern.
8. Ermöglichen den Zugriff auf Daten über das Internet.

**Objektorientierte Datenbanken**

1. Können komplexe Objekte speichern, die eine hierarchische Struktur haben.
2. Speichern Daten in einer objektorientierten Sprache, die als OQL (Object Query Language) bezeichnet wird.
3. Ermöglichen es, komplexe Abfragen zu stellen und Daten zu aktualisieren.
4. Können eine große Anzahl von Objekten gleichzeitig unterstützen.
5. Ermöglichen die Speicherung von Informationen in einer hierarchischen Struktur.
6. Ermöglichen den Zugriff auf Daten über das Internet.
7. Ermöglichen es, Daten zu replizieren und zu sichern.
8. Können komplexe Abfragen über mehrere Ebenen ausführen.

**Unterschiede jedes Modells**

**Hierarchische Datenbanken:**

Unterschiede: Hierarchische Datenbanken speichern Daten in einer hierarchischen Struktur, während relationale und objektrelationale Datenbanken Daten in einer relationalen Struktur speichern. Hierarchische Datenbanken speichern alle Daten in einer einzelnen Datei, während relationale und objektrelationale Datenbanken mehrere Tabellen speichern. Hierarchische Datenbanken verwenden einen Primärschlüssel, während relationale und objektrelationale Datenbanken mehrere Fremdschlüssel verwenden.

Beispiel: Ein Beispiel für eine hierarchische Datenbank ist ein Verzeichnisdienst, in dem Informationen über Personen, Unternehmen usw. gespeichert werden.

**Relationale und Objektrelationale Datenbanken:**

Unterschiede: Relationale Datenbanken speichern Daten in Tabellen, während objektrelationale Datenbanken komplexe Objekte speichern können. Relationale Datenbanken verwenden SQL (Structured Query Language), um Daten abzurufen, während objektrelationale Datenbanken OQL (Object Query Language) verwenden.

Beispiel: Ein Beispiel für eine relationale Datenbank ist eine Kundendatenbank, in der Informationen über Kunden (Name, Adresse, Telefonnummer usw.) gespeichert werden. Ein Beispiel für eine objektrelationale Datenbank ist eine Produktdatenbank, in der Produktdetails (Beschreibung, Preis, Bilder usw.) gespeichert werden.

**Objektorientierte Datenbanken**

Unterschiede: Objektorientierte Datenbanken speichern Daten in einer objektorientierten Sprache, die als OQL (Object Query Language) bezeichnet wird, während relationale und objektrelationale Datenbanken Daten in einer relationalen Struktur speichern. Objektorientierte Datenbanken können komplexe Objekte speichern, die eine hierarchische Struktur haben, während relationale und objektrelationale Datenbanken einfache Datenstrukturen speichern.

Beispiel: Ein Beispiel für eine objektorientierte Datenbank ist eine medizinische Datenbank, in der komplexe Informationen über Patienten (Diagnosen, Behandlungen, Medikamente usw.) gespeichert werden.

---
#### Datenbankmodell Beschreibung Vereinfacht

**Hierarchische Datenbanken**

1. Baumstruktur
2. Mehrere Child und Parent Datensätzen
3. Nicht flexibel

**Relationale und Objektrelationale Datenbanken**

1. Informationen werden nach Themen/Entitäten/Tabellen dargestellt
2. Spalten und Zeilen aufgeteilt
3. Man kann SQL verwenden um sie Abzufragen
4. Extrem flexibel
5. Es hat FK (Foreign Keys) und PK (Primary Keys).
6. Datenredundanz vermeiden --> Doppelte Daten werden vermieden

**Objektorientierte Datenbanken**

1. Objekte und Klassen gespeichert
2. Sehr Flexibel
3. Sehr Performant
4. Ähnelt an Objektorientierten Programmieren
5. Objekte können in Hierarchischen form gespeichert werden.

---

#### Datenbank Theorie

**Aufgaben von relationalen Datenbanken:**
1. Organisation und Speicherung großer Datenmengen 
2. Ermöglichung des Zugriffs auf die gespeicherten Daten 
3. Verwaltung von Benutzer- und Datenzugriffsrechten 
4. Gewährleistung der Integrität und Sicherheit der Daten 
5. Verarbeitung von Abfragen und Erstellung von Berichten 
6. Schnelle und effiziente Verarbeitung von Abfragen und Daten

**Eigenschaften von relationalen Datenbanken:**
1. Daten werden in Tabellenform gespeichert 
2. Daten können in verschiedenen Tabellen gespeichert werden 
3. Daten können über Abfragen miteinander verknüpft werden 
4. Daten können in verschiedenen Datenbanken gespeichert und abgerufen werden 
5. Daten können über verschiedene Anwendungen angezeigt und bearbeitet werden 
6. Daten können in verschiedenen Datenbanken synchronisiert werden

---
#### Datenbank Theorie Vereinfacht

**Aufgaben:**
1. Speichern
2. Abrufen
3. Strukturieren
4. Verwalten
5. Sichern
6. Organisieren
7. Analysieren
8. Aktualisieren

**Eigenschaften:**
1. Zuverlässigkeit
2. Geschwindigkeit
3. Skalierbarkeit
4. Datenintegrität
5. Benutzerfreundlichkeit
6. Anpassbarkeit
7. Sicherheit
8. Verfügbarkeit

---

#### Datenbanksprachen SQL

1. DDL (Data Definition Language) ist eine Datenbanksprache, mit der Datenbankobjekte wie Tabellen, Sichten, Abfragen und Einschränkungen erstellt, geändert oder gelöscht werden können.

2. OQL (Object Query Language) ist eine Datenbanksprache, die Abfragen an eine Datenbankobjektkollektion stellt und die Ergebnisse in Form von Objekten zurückgibt.

3. DML (Data Manipulation Language) ist eine Datenbanksprache, die dazu dient, Daten in einer Datenbank zu ändern, einzufügen und zu löschen.

4. DRL (Data Retrieval Language) ist eine Datenbanksprache, die dazu dient, Daten aus einer Datenbank abzurufen.

5. TCL (Transaction Control Language) ist eine Datenbanksprache, die zur Verwaltung und Kontrolle von Transaktionen in Datenbanken verwendet wird.

6. DCL (Data Control Language) ist eine Datenbanksprache, die zur Verwaltung von Nutzerberechtigungen in Datenbanken verwendet wird.

---

#### Datenbanksprachen SQL Vereinfacht

1. DDL - Data Definition Language
2. OQL - Object Query Language
3. DML - Data Manipulation Language
4. DRL - Data Retrieval Language
5. TCL - Transaction Control Language
6. DCL - Data Control Langauge
   
---

&copy; Rayan Lee Bopp