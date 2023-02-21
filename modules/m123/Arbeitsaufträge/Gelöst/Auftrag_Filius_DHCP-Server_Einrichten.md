## Auftrag DHCP Server in Filius Einrichten

![Abbildung Filius Landschaft](/Images/Berufsschule/Module/Modul-162-Daten-analysieren-und-modellieren/DHCP-Filius_Anfang.png)


### Matrix

| Name of Network component | IP-Address            | MAC-Address       | Subnetmask    | Uses DHCP |
|---------------------------|-----------------------|-------------------|---------------|-----------|
| DHCP-Server               | 192.168.0.10 /24      | 9C:89:FC:5D:D9:FB | 255.255.255.0 | Negative  |
| Client-1                  | 192.168.0.150 -> DHCP | 22:15:94:7A:CC:2E | 255.255.255.0 | Positive  |
| Client-2                  | 192.168.0.151 -> DHCP | D5:9D:B0:A0:07:7B | 255.255.255.0 | Positive  |
| Client-3                  | 192.168.0.50          | 49:11:5C:DA:77:23 | 255.255.255.0 | Negative  |

### Vorwort
Als erstes vergewisserte ich mich, dass ich den Auftrag verstanden hatte. Nachdem ich die Aufgabenstellung sorgfältig durchgelesen hatte, machte ich mich an die Arbeit mit Filius. Dann lud ich die vorgefertigte filius-Datei für die Aufgabe herunter. Nachdem der Download der filius-Datei abgeschlossen war, öffnete ich die Datei in filius.
Dann begutachtete ich die Situation und erstellte einen Plan in meinem Kopf

### Erster Schritt: Verkabelung
![Abbildung Filius Landschaft Start](/Images/Berufsschule/Module/Modul-162-Daten-analysieren-und-modellieren/DHCP_Filius.png)
Das erste, was ich für diese Aufgabe tat, war, jeden Client und den Server mit dem Switch zu verbinden. Dadurch können sie miteinander kommunizieren und auch der Server kann seine Arbeit erledigen. Aber ich werde die Aufgabe des Servers später in der Dokumentation erklären.
### Konfigurieren der Clients
![Abbildung Auftrag](/Images/Berufsschule/Module/Modul-162-Daten-analysieren-und-modellieren/DHCP_Auftrag_Clients-Konfigurieren.png)






server port 67
