## Aufgabe 1.2 Repetitionsfragen lösen

1. Was ist eine Relationale Datenbank?
   
   Eine relationale Datenbank ist ein Datensystem, dass Informationen in Tabellen speicher und über ein relationales Datenmodell organisiert werden. Komplexe Abfraegn zu erstellen, Daten zu bearbeiten und sie sichern und zu speichern, wird über Verknüpfungen zwischen Tabellen ermöglicht.

   Eigenschaften:
   
   1. Gewisse Tabellen haben PK
   2. FKs haben jede Tabllen
   3. Relationale Datenbanken
   4. Sie stellt die referenzielle Integrität sicher
   5. Datenintegrietät

2. Nennen Sie drei verschiedene relationale Datenbank Management Systeme DBMS?
   
   1. Oracle Database
   2. Microsoft SQL Server
   3. MySQL

3. Welche Aufgaben erfüllt ein DBMS für Sie als Entwickler?
   
   Dass wir als Entwickler nicht alle Daten manuell aufrufen müssen und Daten geordnet dargestellt sind.

4. Wie greifen Benutzer (keine Entwickler) auf eine Datenbank zu?
   
   Über ein GUI, dessen Backend schreibt dann ein SQL-Befehle um die Daten hervorzuheben.

5. Handelt es sich bei SQL um eine Programmiersprache?
   
   Ja und Nein SQL oder ausgeschrieben "Structured Query Language" ist ein Programiersprache für die Bearbeitung von Daten und relationalen Datenbanksystemen. Sie wird nicht zum eigentlichen Programmieren verwendet. Sie wird nur im zusammenhang mit Datenbanken verwendet. 

6. Ist die Sprache SQL auf allen Datenbanken gleich?
   
   Ja aber auch Nein. Obwohl SQL einer der verbreitesten Datenbank Programmiersprachen sind vaarierert die Syntax von Datenbank zu Datenbank, da sich die meisten Datenbanksysteme nicht zu 100% an den SQL-Standard haltet. Wie schon erwähnt vaariert nur die Syntax die Basisbefehle bleiben gleicht

7. Was versteht man unter NoSQL Datenbank?
   
   NoSQL sind **nicht relationale**-Datenbanken, die grosse Mengen an unstrukturierten und semi-strukturierten Daten speichern und abrufen können. Daten in NoSQL Datenbanken werden in Files abgespeichert wohin die in SQL-Datenbanken in Tabllen gespeichert werden. Sie ist für die strukturelle Ablage nicht geignet.

8. Nennen Sie drei NoSQL Datenbanksysteme?
   
   1. MongoDB
   2. CouchDB
   3. Cassandra.9
   4. CockroachDB --> geignet zum synchronisieren von mehreren Servern

9.  Was versteht man unter Datenbank Schema?
    
    Logische Struktur einer Datenbank. Ein Datenbankmodell wie die Datenbank erstellt werden sollte.

10. Wozu dient ein Entity Relationship Model (ERM)?
    
    Man kann die Relationionen sehr einfach anhand einem Modell veranschaulichen. Bei der erstellung bei einem ERM hat man noch keine Datensätze sondern nur die einzelnen Tabellen und die Relationen zueinander. Sehr grob dargestellt

11. Wie sieht ein Enhanced Entity Relationship (EER) Model aus?
    
    Ein Enhanced Entity Relationship (EER) Modell ist ein Datenmodell, das Entitäten, Attribute, Beziehungen und Konzepte verwendet, um eine strukturierte Datenbank darzustellen.

12. Was bedeuten die Begriffe: Entität, Attribut und Tupel?
    
    Tupel ist ein Datensatz.
    Entiät ist eine Tabelle
    Attribut sind die Tabllen spalten. Eigenschaften einer Entität

13. Was versteht man unter Datenkonsistenz?
    
    Richtigkeit und Vollständigkeit der Daten.

14. Was bedeutet Redundanz im Zusammenhang mit einer Datenbank?
    
    Das man die Daten doppelt in einer Datenbank hat, doppelt gesichert.

15. Was versteht man unter Normalform?
    
    Normalformen sind eine Art von Datenmodellen, die in relationalen Datenbanken zur Organisierung und Speicherung von Daten verwendet werden. Es gibt 5 Normalformen

    Normalformen:

    1. 1.NF: Ein Datensatz muss aus einer einzelnen Tabelle bestehen und eindeutig identifizierte Spalten aufweisen.
    2. 2.NF: Alle nicht-schlüsselbezogenen Spalten müssen von allen schlüsselbezogenen Spalten abhängen.
    3. 3.NF: Keine transitive Abhängigkeit zwischen nicht-schlüsselbezogenen Spalten.
    4. BCNF: Keine schlüsselbezogenen Spalten, die von anderen schlüsselbezogenen Spalten abhängen.
    5. 4.NF: Keine nicht-schlüsselbezogenen Spalten, die mehr als eine Funktion vom Schlüssel aus aufweisen.

16. Wie unterscheiden sich die erste, zweite und dritte Normalform?
    
    1.NF erfordert, dass ein Datensatz aus einer einzelnen Tabelle besteht und eindeutig identifizierte Spalten aufweist.
    2.NF erfordert, dass alle nicht-schlüsselbezogenen Spalten von allen schlüsselbezogenen Spalten abhängen.
    3.NF erfordert, dass keine transitive Abhängigkeit zwischen nicht-schlüsselbezogenen Spalten besteht.

17. Was versteht man unter Primär- und Fremdschlüssel?
18. Was ist referentielle Integrität?
    
    **ausgeschrieben**

    Referentielle Integrität ist ein Konzept der Datenbankverarbeitung, das sicherstellt, dass Daten in einer Datenbank korrekt und vollständig vorliegen. Ein Datenbankverarbeitungssystem, das über referenzielle Integrität verfügt, prüft die Beziehungen zwischen den verschiedenen Tabellen in der Datenbank und sorgt dafür, dass alle Daten korrekt und vollständig vorliegen, bevor eine Aktion ausgeführt wird. Referenzielle Integrität kann auch besagen, dass bestimmte Daten nicht verändert werden können. Diese Einschränkungen können in der Datenbank definiert sein, um sicherzustellen, dass Daten nicht versehentlich verändert oder gelöscht werden.

    **zusammengefasst**
    
    Referentielle Integrität ist ein Konzept der Datenbankverarbeitung, das sicherstellt, dass Daten in einer Datenbank korrekt und vollständig vorliegen und dass bestimmte Daten nicht verändert werden können.

19. Was bringt Object-Relational Mapping (ORM)?
    
    **ausgeschrieben**

    Object-Relational Mapping (ORM) ist ein Programmierparadigma, das es Entwicklern ermöglicht, eine Anwendung mit einer relationalen Datenbank zu verbinden, ohne dass sie SQL-Abfragen schreiben müssen. ORM ermöglicht es Entwicklern, Anwendungen zu erstellen, die die Leistung und Skalierbarkeit von relationalen Datenbanken nutzen, ohne dass sie sich mit der Komplexität der Datenbankstruktur befassen müssen. Es vereinfacht den Entwicklungsprozess und ermöglicht es Entwicklern, sich auf die Kernfunktionalität ihrer Anwendung zu konzentrieren, anstatt sich um die Datenbankstruktur kümmern zu müssen.

    **zusammengefasst**

    Object-Relational Mapping (ORM) ermöglicht es Entwicklern, Anwendungen mit relationalen Datenbanken zu verbinden, ohne dass sie SQL-Abfragen schreiben müssen und vereinfacht so den Entwicklungsprozess, indem sie sich auf die Kernfunktionalität ihrer Anwendung konzentrieren können.

20. Wie unterscheiden sich die Datentypen Char und Varchar?
    
    * Char: Muss man die Länge angeben. mindestens 10 Buchstaben. Man kann auch weniger als 10 Buchstaben verwenden, aber es werden trotzdem 10 Charakter angegeben. --> schnellere Rechenzeit in gewissen Situationen.
    * VarChar: Muss man die Länge angeben. Beliebige anzahl an buchstaben --> längere Rechenzeit

21. Was ist ein Character Set und wie unterscheiden sich ASCII, LATIN1 und UTF-8?
    
    * Ein Character Set ist ein Satz von Zeichen, die verwendet werden, um Text auf einem Computer anzuzeigen und zu speichern. 
    * ASCII ist ein 7-Bit-Character Set, das 128 verschiedene Zeichen enthält, die für Englisch und andere westliche Sprachen verwendet werden. 
    * LATIN1 ist ein 8-Bit-Character Set, das die Kombination von ASCII und ISO 8859-1-Zeichen enthält. Es enthält Zeichen für Westeuropa und andere Sprachen. 
    * UTF-8 ist ein variable-length-Character Set, das Zeichen für fast jede Sprache und jeden Schriftstil unterstützt. Es ist ein 8-Bit-Character Set, aber es kann bis zu 32-Bit-Zeichen speichern. Sie ist rückwärtskompatibel.
    
22. Wie unterscheiden sich die Datentypen Integer und Float?
    
    Der Datentyp Integer (oft auch Ganzzahl genannt) bezieht sich auf ganze Zahlen, also Zahlen ohne Nachkommastellen. Float (oder auch Fließkommazahl genannt) bezieht sich auf Zahlen mit Nachkommastellen. Float ist ein breiterer Datentyp als Integer, da er mehr Informationen speichern kann.

23. Wozu verwendet man den Datentyp Decimal?
    
    **ausgeschrieben**

    Der Datentyp Decimal wird verwendet, um Gleitkommazahlen mit einer erhöhten Genauigkeit zu speichern und zu verarbeiten. Decimal ist ein sehr sicheres Datenformat, das eine hohe Genauigkeit beim Speichern von Zahlenwerten gewährleistet, sodass es sich ideal für Finanztransaktionen und andere Anwendungen eignet, in denen eine exakte Berechnung von Werten erforderlich ist.

    **zusammengefasst**

     Der Datentyp Decimal wird verwendet, um Gleitkommazahlen mit höherer Genauigkeit zu speichern und zu verarbeiten, ideal für Finanztransaktionen.

24. Wie unterscheiden sich die Datentypen Timestamp und Datetime?
    
    Timestamp und Datentime sind fast genau gleich, jedoch vaariert bei diesen beiden Datentypen

    * Timestamp - zahlt erst ab 1999 also ab 2000
    * Datetime  - kann bis von Jahr 1000 bis zu Jahr 9999 rechnen

25. Wie unterscheiden sich 0 und NULL?
    
    * 0 ist eine Zahl
    * NULL ist eine Datentyp der nichts angibt oder hat