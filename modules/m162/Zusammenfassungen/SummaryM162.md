# Summary M:162

## Merkmale

## Datenstrukturen

## Datentypen
Was sind eigentlich Datentypen? Datentypen sind speziell für Daten gemachte Merkmale.
#### Ganze Zahlen
Bezeichnung: BIGINT, BIN, BIN FIXED, BINARY, BYTE, COMP, INT, INTEGER, LONG, LONG INT, LONGINT, MEDIUMINT, SHORT, SHORTINT, SMALLINT
Wertebereich: Ganzezahlen keine Kommazahlen
Operationen: +, -, *, <, >, =, Division mit Rest und Modulo

---

#### Natürliche Zahlen
Bezeichnung: BYTE, CARDINAL, NATURAL, UNSIGNED, UNSIGNED CHAR, UNSIGNED INT, UNSIGNED LONG, UNSIGNED SHORT, WORD
Wertebereich: Meist 32 Bit, (0…2^32-1), 8 Bit, 16 Bit, 64 Bit
Operationen: +, -, *, <, >, =, Division mit Rest und Modulo

---

#### Festkommazahlen (Dezimalzahlen)
Bezeichnung: COMP-3, CURRENCY, PACKED DECIMAL, DEC, DECIMAL, NUMERIC
Wertebereich: Wertebereich direkt abhängig von der maximalen Stellenanzahl, die meist vorzugeben ist; CURRENCY (64 Bit): -922'337'203'685'477.5808…922'337'203'685'477.5807
Operationen: +, -, *, <, >, =, Division mit Rest und Modulo

---

#### Aufzählungstypen
Bezeichnung: ENUM, SET oder implizit
Wertebereich: Frei wählbar, beispielsweise (SCHWARZ, ROT, BLAU, GELB)
Operationen: <, >, =

---

#### Boolean (logische Werte)
Bezeichnung: BOOL, BOOLEAN, LOGICAL, oder (implizit ohne Bezeichner)
Wertebereich: (TRUE, FALSE) oder (= 0, ≠ 0) oder (= -1, = 0)
Operationen: NOT, AND, XOR, NOR, NAND, OR, =, ≠

---

#### Zeichen (einzelnes Zeichen)
Bezeichnung: CHAR, CHARACTER
Wertebereich: Alle Elemente des Zeichensatzes (zum Beispiel Buchstaben)Operationen: <, >, =, Konvertierung in INTEGER, …

---

#### Gleitkommazahlen
Bezeichnung: DOUBLE, DOUBLE PRECISION, EXTENDED, FLOAT, HALF, LONGREAL, REAL, SINGLE, SHORTREAL
Wertebereich: Verschiedene Definitionen
Operationen: +, -, *, /, <, >, =

---

#### Zeiger
Bezeichnung: ACCESS, POINTER, IntPtr oder auch nur kurz Stern (*)
Wertebereich: Adresse des Basistyps (oft anonym)
Operationen: Referenz, Dereferenz, in einigen Sprachen: +, -, *, /

---

#### Konstanter Nullzeiger
Bezeichnung: NULL, VOID, None, NIL, Nothing
Wertebereich: keiner
Operationen: =
Bedeutung: Dieser Zeiger ist verschieden von allen Zeigern auf Objekte.

---

#### Zusammengesetzte Datentypen

##### Zeichenkette fester Länge
(Im Grunde sind Zeichenketten selbst nur eine Reihung des Typs Character (Zeichen). Da sie jedoch in vielen Programmiersprachen vordefiniert sind, werden sie hier gesondert aufgelistet.)
Bezeichnung: Array of CHAR, CHAR(n), CHAR[n]
Wertebereich: Alle möglichen Zeichenketten
Operationen: Stringfunktionen (Teilstring, Konkatenation [Zusammensetzung]), <, >, =

---

##### Zeichenkette variabler Länge
Die Länge ist feststellbar, implizit durch ein Metazeichen als String-Endezeichen (ASCII \0), explizit durch eine Variable, oder über eine Standardfunktion. Häufig als Abstrakter Datentyp in einer Standardbibliothek.
Bezeichnung: String, Array of CHAR, VARCHAR, CLOB, Text
Wertebereich: Zeichenketten variabler Länge
Operationen: Stringfunktionen (Teilstring, Länge, Konkatenation [Zusammensetzung]), <, >, =

---

#### Datum & Zeit
Bezeichnung: DATE, TIME, DATETIME, TIMESTAMP
Wertebereich: Verschiedene Definitionen. Oft dient die Anzahl Milisekunden, seit 1900 als Grundlage.
Operationen: Manchmal sind Operatoren wie +, - möglich, normalerweise werden Methoden verwendet. Vergleich möglich mit = oder Methode.
Format: Das Datumsformat wird nomalerweise mit einer Zeichenkette definiert,
z.B. "dd.MM.yyyy - HH:mm:ss" oder "d.M.yy / H:m"

---

#### Binäre Datenobjekte variabler Länge.
Die Länge kann durch eine Variable oder über eine Standardfunktion ermittelt werden.
Bezeichnung: BLOB (Binary Large OBject), Bild, Audo, Video, ...
Wertebereich: binäre Datenobjekte variabler Länge
Operationen: Länge, Konkatenation [Zusammensetzung], =

Verbund, Satz, Struktur, Bereich
Bezeichnung: RECORD, STRUCT, CLASS (erweiterte Bedeutung)
Wertebereich: Ein Verbund enthält eine Folge verschiedener Komponenten, welche verschiedene Datentypen haben können. Als Komponententyp ist jeder Typ zulässig. In einigen objektorientierten Programmiersprachen (zum Beispiel Oberon) können Verbunde zur Beschreibung des Verhaltens der Komponenten des Verbunds mittels Methoden auch typengebundene Prozeduren haben.
Operationen: Vergleich (nur Gleichheit oder Verschiedenheit), Zuweisung mit oder ohne Zuweisungskompatibilität (stark programmiersprachenabhängig)
Beispiel: type Prüfung is RECORD (Fach: STRING, Schueler: STRING, Punkte: INTEGER, Lehrer: STRING, Termin: DATUM)

---

#### Vereinfachtes Memory Management
Folgend wird vereinfacht gezeigt wie die Datentypen im Speicher abgelegt werden. Das vereinfachte Beispiel kommt aus Java, andere Programmiersprachen können anders mit dem Speicher umgehen.
In Java haben sie die beiden Speichertypen Heap und Stack im Hauptspeicher (RAM). Die einfachen Datentypen werden direkt im Stack gespeichert, während die komplexen/zusammengesetzten im Heap gespeichert und im Stack referenziert werden mit einem Pointer.
Hier erkennen sie wieso pointer auch in Java und C# existieren. Während sie in C/C++ direkt mit Pointer arbeiten können, sind diese in Java versteckt, aber im Hintergrund vorhanden.
Den Begriffen Heap und Stack begegnen sie in Kürze wieder.

----