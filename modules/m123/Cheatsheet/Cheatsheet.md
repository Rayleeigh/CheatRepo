## DHCP Ablauf
1. Der Client versendet ein `DHCPDISCOVER-Paket` per Broadcast an `alle Netzwerkteilnehmer`, um verfügbare `DHCP-Server zu lokalisieiren`. Im Optimalfall gibt es nur einen einzigen Server, sodass es zu keinerlei Komplikationen bei der Zuordnung kommt.
2. Das gelieferte `DHCPDISCOVER-Paket`, dass per `Broadcast` versendet wurde werden von `allen erreichten DHCP-Server`, die auf Port 67 mittels einem Daemon auf solche `DHCPDISCOVER-Pakete` lauscht, beantwortet.
`DHCP-Server` reagieren mit einem `DHCP-Offer-Paket` auf die `DHCPDISCOVER-Pakete`.
3. Der Client wählt, dann aus den erhaltenen Adressdaten die gewünschten aus und informiert den betreffenden Server mittels `DHCPREQUEST`.
4. Wenn der `DHCP-Server` diese `DHCPREQUEST` erhält bestätigt der `DHCP-Server`, diese mit `DHCPACK` was ausgeschrieben `DHCPACKNOWLEDGE` bedeutet.
![Diagramm](/Images/Berufsschule/Module/Modul-123/DORA-DHCP.png)
**alle anfragen werden per broadcast versendet!**
**TCP ist verbindung orientiert!**
**UDP ist geschwindigkeit orientiert!**