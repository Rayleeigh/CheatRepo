# Modul 188 - Services betreiben, warten und überwachen - Dokumentation

## Vorwort

# Erster Tag Modul 188 - Services betreiben, warten und überwachen

## Einstieg ins ÜK-Modul 188 Services betrieben, warten und überwachen
Der Einstieg in das erste ÜK-Modul war derselbe wie bei dem letzten.
Wir bekammen die standardiesierte Einführung.
Wir Besprachen wann wir die Pausen anlegen möchten und das Programm des ÜKs.
![Kursverlauf](/Images/%C3%9CK/Modul%20188%20-%20Services%20Betreiben%20und%20%C3%9Cberwache/Kursverlauf.png)
### Eintrittstest:
Nach der Einführung bekammen wir einen kleinen Eintrittstest, der dein vorwissen bestimmen sollte.
Diese Eintrittstest wurde, dann im Plenum besprochen.

## Block 1: Informationen / Informieren
### Kursprogramm
![Kursprogramm](/Images/%C3%9CK/Modul%20188%20-%20Services%20Betreiben%20und%20%C3%9Cberwache/Kursprogramm.png)
### Kursziele
* Jeder Lernende hat alle nötigen Informationen zum Kurs.
* Jeder Lernende hat sich über die Infrastruktur informiert.
* Jeder Lernende kennt die Grundlagen einer Projektmanagement Methode.


### IPERKA
1. **I**nformieren:
Was ist der Inhalt und Umfang des Auftrags oder des Projekts?
2. **P**lanen
Welche Möglichkeiten führen zu einer Lösung?
3. **E**ntscheiden
Für welche Lösungen entscheiden wir uns?
4. **R**ealisieren
Was muss alles beachtet werden, damit das Projekt erfolgreich umgesetzt werden kann?
Welches sind unsere Meilensteine in der Umsetzungsphase?
5. **K**ontrollieren
Konnten alle Punkte des Auftrags oder Projektes erfolgreich umgesetzt werden?
6. **A**uswertem
Was wurde gut umgesetzt?
Was hätte besser gemacht werden können?

### Werkstattauftrag 1 - Informieren über die Infrastruktur

**Aufgabenstellung**
- Lesen Sie die Betriebsdokumentation aufmerksam durch.
- Damit die Installation übersichtlicher wird, erstellen Sie eine Checkliste mit dem Windows Server und den Clients für die neuen Mitarbeiter der Firma.
- Wie eine solche aussehen könnte, entnehmen Sie dem Punkt Hilfe.
- Die Firewall/Router und der Linux Server müssen nicht neu erstellt werden.
- Speichern Sie die Checkliste im Arbeitsordner und lassen Sie diese von der Kursleitung kontrollieren.

#### Werkstattauftrag 1 - Informieren über die Infrastruktur - Ablauf
Als erstes las ich den Auftrag genau durch.
Ich befand mich in einer Ausgangslage, bei der ich die Ansprechsperson für den Kunden Herr Della Serra in IT Belangen bin. Ich habe schon eine vorgeferitgte Dokumentation des Betriebs von Herr Della Serra bekommen.
Da es der Auftrag so vorgibt gehe ich nach dem [IPERKA](https://www.phinst.unibe.ch/ueber_uns/lehrlingsausbildung/website_polymechaniker/ausbildung/iperka/index_ger.html#:~:text=Die%20Projektmethode%20IPERKA%20geht%20davon,Projektablauf%2C%20verlangt%20eine%20strukturierte%20Vorgehensweise.) Modell vor.
Als erster Schritt nach der IPERKA-Methode

##### Werkstattauftrag 1 - Informieren über die Infrastruktur - Checkliste

| Checklisten Hotel Vier Winde AG                                                                   |   |   |   |                             |           |        |           |
|---------------------------------------------------------------------------------------------------|---|---|---|-----------------------------|-----------|--------|-----------|
|                                                                                                   |   |   |   |                             |           |        |           |
|                                                                                                   |   |   |   |                             |           |        |           |
| Windows Server                                                                                    |   |   |   |                             |           |        |           |
| Hardware                                                                                          |   |   |   | VM                          | Grösse    | Anzahl | Erledigt? |
| Server: HP ProLiant ML310e Gen8 v2                                                                |   |   |   | unrelevant                  | /         | 1 x    |           |
| HDD: 3.5" SCSI 500 GB einbauen                                                                    |   |   |   | 60 GB                       | 500 GB    | 1 x    |           |
| RAM: DDR4-RAM, 1600 MHz, ECC                                                                      |   |   |   | 4 GB                        | 8 GB      | 4x     |           |
| CPU: Intel® Xeon® x 2 nutzen                                                                      |   |   |   | 2P 2C                       | /         | 2 x    |           |
| NIC: Gb 332i Ethernet-Adapter mit 2 Ports (Host Only)                                             |   |   |   | bleibt                      | 1000 Mbit | 2 x    |           |
| Software                                                                                          |   |   |   |                             |           |        |           |
| Hostname: gogh                                                                                    |   |   |   | bleibt                      | /         | /      |           |
| OS: Windows Server 2019 64Bit Standard Desktop                                                    |   |   |   | Server 2019                 | /         | /      |           |
| Sprache: Deutsch                                                                                  |   |   |   | Englisch                    | /         | /      |           |
| Automatische Partitionen:   Wiederherstellungspartition, ESP, MSR      OS Partition: Restliche GB |   |   |   | bleibt                      | /         | /      |           |
| Features: Druckserver & Windows Serversicherung                                                   |   |   |   | bleibt                      | /         | /      |           |
| Tools: 	7 Zip & Acrobat Reader                                                                     |   |   |   | Winrar, Firefox             | /         | /      |           |
|                                                                                                   |   |   |   |                             |           |        |           |
| Client Nico Berger                                                                                |   |   |   |                             |           |        |           |
| Hardware                                                                                          |   |   |   | VM                          | Grösse    | Anzahl | Erledigt? |
| PC: HP Pavilion                                                                                   |   |   |   | unrelevant                  | /         | 1 x    |           |
| HDD:                                                                                              |   |   |   | 50 GB                       | 250 GB    | 1 x    |           |
| RAM: DDR4-RAM, 1600 MHz, NON ECC                                                                  |   |   |   | 4 GB                        | 4 GB      | 4x     |           |
| CPU: Intel I7 (8 Cores)                                                                           |   |   |   | 2P 2C                       | /         | 1 x    |           |
| NIC: Gigabit-Ethernet (Host Only)                                                                 |   |   |   | unrelevant                  | 1000 Mbit | 1 x    |           |
| Software                                                                                          |   |   |   |                             |           |        |           |
| Hostname: ws-th-003                                                                               |   |   |   | bleibt                      | /         | /      |           |
| OS: Windows 10 Education                                                                          |   |   |   | bleibt                      | /         | /      |           |
| Sprache: Deutsch                                                                                  |   |   |   | bleibt                      | /         | /      |           |
| Automatische Partitionen:   Wiederherstellungspartition, ESP, MSR      OS Partition: Restliche GB |   |   |   | bleibt                      | /         | /      |           |
| Tools: 	7 Zip & Acrobat Reader, Notepad++                                                          |   |   |   | Winrar, Firefox, Notepad ++ | /         | /      |           |
|                                                                                                   |   |   |   |                             |           |        |           |
| Client Nico Berger                                                                                |   |   |   |                             |           |        |           |
| Hardware                                                                                          |   |   |   | VM                          | Grösse    | Anzahl | Erledigt? |
| PC: HP Pavilion                                                                                   |   |   |   | unrelevant                  | /         | 1 x    |           |
| HDD:                                                                                              |   |   |   | 50 GB                       | 250 GB    | 1 x    |           |
| RAM: DDR4-RAM, 1600 MHz, NON ECC                                                                  |   |   |   | 4 GB                        | 4 GB      | 4x     |           |
| CPU: Intel I7 (8 Cores)                                                                           |   |   |   | 2P 2C                       | /         | 1 x    |           |
| NIC: Gigabit-Ethernet (Host Only)                                                                 |   |   |   | unrelevant                  | 1000 Mbit | 1 x    |           |
| Software                                                                                          |   |   |   |                             |           |        |           |
| Hostname: ws-fo-008                                                                               |   |   |   | bleibt                      | /         | /      |           |
| OS: Windows 10 Education                                                                          |   |   |   | bleibt                      | /         | /      |           |
| Sprache: Deutsch                                                                                  |   |   |   | bleibt                      | /         | /      |           |
| Automatische Partitionen:   Wiederherstellungspartition, ESP, MSR      OS Partition: Restliche GB |   |   |   | bleibt                      | /         | /      |           |
| Tools: 	7 Zip & Acrobat Reader, Notepad++                                                          |   |   |   | Winrar, Firefox, Notepad ++ | /         | /      |           |

### Werkstattauftrag 1 - Informieren über die Infrastruktur - Checkliste änderungen

| Was                                               | Wie                                                                                                                                                                                                                                 | Warum                                                                                                                                                          |
|---------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Logische Verteilung der Switches                  | Der Zentrale Switch bekommt   einen Fallback, dieser ist mit einem Patchpanel verbunden. Diese Switches   werden mit den Switches der Abteilung verbunden.                                                                          | Im Falle eines Ausfalles eines   Switches funktionieren die anderen Abteilungen noch. Und der Zentraler Switch   kann auch noch ausfallen deshalb der fallback |
| Nameskonvektion                                   | Die Namenskonvektion ändern auf   ws für Workstation und, dann den Abteilungkürzel mit einer steigender Zahl   001, 002, 003 …                                                                                                      | Wenn ein Mitarbeiter kündigt und   dieser ersetzt wird, dass dieser Mitarbeiter nicht auf der Workstation des   vorherigen Mitarbeiters arbeiten muss.         |
| Subnetzte für Abteilungen                         | In dem man ausrechnet wie viele   Workstation und Geräte in einer Abteilung ist, ausserdem braucht man, dann   pro Abteilung nicht mehr nur ein Switch sondern auch noch einen Router um mit   den anderen Abteilung kommunizieren. | Damit man das Netzwerk nicht so   schwer belastet. Ausserdem kann man einen Unicast benutzen anstatt einen   Broadcast.                                        |
| WLAN für Kunden                                   | Indem man auf jeder Etage einen   Switch mit mehreren Access Points macht.                                                                                                                                                          | Im Netzwerkplan haben die Kunden   keine WLAN-Verbindung                                                                                                       |
| Persönlicher Ordner auf Drive                     | Der Persönliche Ordner der   Mitarbeiter auf eine Seperate Disk draufladen                                                                                                                                                          | Einfach aus konvinience                                                                                                                                        |
| Server Spezifikationen anpassen                   | Die Spezifikationen der Server   upgraden. Anstatt DDR3 RAM auf mindestens DDR4 RAM oder wenn nicht auf DDR5                                                                                                                        | Da die Server Spezifikationen   einer Kartoffel gliechen.                                                                                                      |
| Windowsserver sicherungen                         | Backuptool einrichten das jeden   Tag um 23:59 Uhr ein Backup automatisch kreeiert.                                                                                                                                                 | Wenn ein Server flachliegt ohne   Backup ist der Betrieb für 2 Wochen ausser Betrieb                                                                           |
| Backups Konzept                                   | Backtool für die Clients   allgemein einrichten                                                                                                                                                                                     | Kein Backup bei Datenverlist   Hotel ausser betreib für 2 Wochen                                                                                               |
| Konstant mit den Spezifikationen bleiben          | Die Spezifikationen für die   Workstation sollten immer genau gleich bleiben                                                                                                                                                        | Da dies verwirrend ist.                                                                                                                                        |
| Workstation   von Static-IP zu Dynamic umschalten | Workstations                                                                                                                                                                                                                        |                                                                                                                                                                |
| Initial passwort                                  | In dem man einfach für jeden   Client ein Initial Passwort übers Active Directory zuweisst.                                                                                                                                         | Setup geht viel einfacher.                                                                                                                                     |

## Block 2:

<--> Noch heute abend

## Recap

Am Mittwoch, 23. November 2022 haben wir eine 

## Block 3: Server Funktionalität
### Kursprogramm
![Kursprogramm Block 3](/Images/%C3%9CK/Modul%20188%20-%20Services%20Betreiben%20und%20%C3%9Cberwache/Programm_Block3.png)
### Kursziele
* Jeder Lerndende hat die Modulumgebung vollständig installiert.
* Jeder Lernende kennt verschiedene Zugriffsmöglickeiten.
* Jeder Lernende kennt redundante Hardwarekomponenten und RAID.
* Jeder Lernende kennt versch. Remotemanamgementlösungen und Hardwareebene.

#### Was ist ein Server - Recherche Auftrag
Was ist die Definition eines Servers? Was ist eigentlich ein Server? Was Zeichnet einen Server eigentlich aus? Wie empfängt der Server die Anfragen des Clients? Warum ist ein Client als Server nicht geeignet? Was sind Rack units? Welche Vorkehrung muss man für den Dauerbetrieb treffen? Welche Komponente werden redundant angelegt? Wo werden die Server angelegt? Was ist der Nutzen eines Servers? Wie funktioniert ein Server? und Warum braucht ein Server so viel Leistung?

##### Was ist die Definition eines Servers?
Der Server bekommt seinen Namen aus dem Englischen. Der Begriff "server" aus dem Englischen heisst zu deutsch übersetzt Diener.
Da der Server, einem Client bedient also bedient, deswegen sein Name; Server.

##### Was ist eigentlich ein Server?
Ein Server unterscheidet sich in vielen Dingen von einem Client, jedoch werde ich diese Unterschiede später in der Dokumentation näher erläutern.
Für den Anfang muss man einfach wissen, dass ein Server die Clients(Workstations, Dekstop-PCs, Laptops als auch Smartphones) bedient.
Ein Server muss ausserdem 24/7 365 Tage laufen, sodass der Dienst oder die Firma keine aussetzer hat.

##### Was zeichnet einen Server eigentlich aus?
Was ein Server auszeichnet ist nicht nur allein die Grösse oder die Leistung, die er konstant liefern muss. Sondern die Funktionen, die ein solcher Server besitzt. Ein Server zeichnet sich durch Skalierbarkeit, Erweiterbarkeit und Stabilität aus.
Skalierbarkeit heisst, dass der Server unter 

##### Wie empfängt der Server die Anfragen des Clients?
Wie schon ober erwähnt unterscheidet sich ein Server von einem Client.
Wenn man nämlich beide Namen aus dem Englischen ins Deutsche übersetzt, bekommt man "Diener" für den Server und "Kunde" für Client.
Aber wie bedient der Server den Client bzw. wie empfängt er die Anfragen des Clients?
Ganz einfach, damit man Protokolle benützen kann braucht es einen Port der auf Anfragen für dieses Protokoll hört und diese bedient und ein Port der diese Protokolle herausendet.

##### Warum ist ein Client als Server nicht geeignet?
Ein Punkt ist das ein Client, nicht einmal annähernd and die Hardwarespezifikationen eines Servers herankommt.
Ein Client hat normalerweise oft ein minimum von 16GB RAM und ein maximum von 128GB RAM, 16Cores mit 128 Threads und eine Speicherkapazität von einem minimum von 256 GB zu einem maximum von 64 TB wenn man dazu gewillt ist sehr viel Gelf auszugeben.
Ausserdem ist die Architektur eines Client CPUs nicht annähernd so startk, sodass man mehrere Zugriffe auf einmal unterschützen kann.

##### Was sind Rack Units?
Ein Rack Unit ist eine für Server spezialisierte Masseinheit.
Eine Rack Unit ist für gewöhnlich 4.45cm hoch und 48.26cm breit.

##### Wo sind Server stationiert?
Grosse Firmen haben im Grunde eigentlich immer zwei Rechenezentren an einem Ort.
Damit sie immer ein redundantes Rechenzentrum haben.
Als Beispiel wäre eins im dritten Stock, sodass dies für überflutungen und vor 

### Werkstattauftrag 4: Ausfallsicherheit mit RAID
Ein RAID ist ein Verfahren und steht für Redundant Array of Independent Discs.
Das heisst, dass ein RAID verfahren eine redundante Anordnung von unabhängigen Festplatten ist.

#### RAID 5 - Was ist das?
RAID-5 ist ein Laufwerk-Verband aus 3 oder Mehr Laufwerken.
Die Daten sind mittels striping über den Laufwerken verteilt.

RAID 5 und RAID 50