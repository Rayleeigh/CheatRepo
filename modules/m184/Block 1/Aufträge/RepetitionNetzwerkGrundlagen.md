# Repetition Netzwerk grundlagen

1. Was macht ein Router?
2. Was macht eine Bridge?
3. Was macht eine Firewall?
4. Was versteht man unter dem Begriff Broadcast Domain?
![BroadcastDomainFunction](https://www.networkacademy.io/sites/default/files/inline-images/Broadcast%20Domain%20Two%20Switches_0.gif)
**Kurze Zusammenfassung**
Unter dem Begriff Broadcast Domain oder Broadcast Domäne auf deutsch, versteht man einen logischhen Verbund von Netzwerkgeräten in einem lokalen Netzwerk, der sich dadurch auszeichnet, dass ein Broadcast an alle Domänenteilnehmer verschickt und erreichen wird und auch kann.

**Wie funktioniert eine Broadcast Domain**
Eine Broadcast Domain oder auf deutsch Broadcast Domäne funktioniert folgendermassen. In einer Broadcast Domain werden alle Datenpakete, die im Netzwerk gesendet werden, an alle Geräte verteilt. Diese können dann entscheiden, ob sie die Pakete verarbeiten oder nicht. Technologien wie Switches, Router, Bridges oder Hubs können verwendet werden, um die Domäne zu segmentieren. Dadurch wird die Kommunikation innerhalb der Domain effizienter gestaltet.

5. Wozu verwendet man VLANs?
6. Was ist ein ARP Broadcast?
7. Was versteht man unter TCP/IP Stack?
8. Wie unterscheiden sich TCP und UDP?

**Kurze Erfassung:**
Sowohl TCP als auch UDP sind Protokolle, die verwendet werden, um Datenbits, auch Pakete genannt, zu senden. Beide bauen auf dem Internetprotokoll auf. Man kann es auch so ausdrücken: Wenn man ein Paket per TCP oder UDP verschickt, wird es an eine IP-Adresse gesendet. Beide Pakete werden ähnlich behandelt und von Ihrem Computer zum zwischengeschalteten Router bis zum Ziel geleitet.

**Unterschiede:**
TCP garantiert, dass der Empfänger die Daten korrekt empfängt, indem sie durchnummeriert werden. Der Empfänger quittiert den korrekten Empfang der Daten and den Sender zurück. Falls keine Bestätigung kommt, werden die Daten erneut gesendet, außerdem werden sie auf Richtigkeit überprüft.
Bei UDP wird weniger auf die Zuverlässigkeit der Daten geachtet, da die viel Bandbreite frisst. UDP verschickt Daten ohne jegliche überprüfung. Sollte bei dem UDP-Protokoll ein Paket nicht korrekt ankommt hat man Pech gehabt, da UDP die Vollständigkeit der Daten nicht garantiert.
Sprich, TCP achtet auf Vollständigkeit und Richtigkeit der Daten, während UDP auf die Geschwindigkeit der Übertragung ausgelegt ist.

9.  Wie funktioniert der TCP Verbindungsaufbau?

10. Was versteht man unter Well-Known Port?
Well-known Ports sind Port-Nummern, die für bestimmte Dienste im Internet reserviert wurden. Sie werden in der Internet Engineering Task Force (IETF) RFC 1700 definiert und sind in der Regel zwischen 0 und 1023. Beispiele für gängige Ports sind der HTTP-Port 80, der HTTPS-Port 443, der FTP-Port 21 usw.

11.  Was ist ein Portscan?
12.  Wozu dient das Protokoll DNS?

**kurz fassung**
Kurz DNS, DNS ist ausgeschrieben Domain Name System. Dieses System dient zur Auflösung von Computernamen in IP-Adressen und umgekehrt, dazu hat man forward-lookupzones und reverse-lookupzones. Dieses Vorgehen bezeichnet man als Namensauflösung. Möchte man zum Beispielt die Website google.ch besuchen, dann fragt dein Computer/Browser einen DNS-Server, der in der IP-Konfiguration hinterlegt ist, nach der entsprechenden IP-Adresse.

**DNS, Wie funktioniert es?**
![DNSAblauf](https://info.varonis.com/hubfs/Varonis_June2021/Images/how-dns-works@2x.png)

Die Anfrage wird zuerst and den lokalen DNS-Index geschickt, dies findet man unter `C:\Windows\System32\drivers\etc\host`, wenn dort nichts eingetragen ist fragt er denn lokalen DNS-Server an, wenn dort auch nichts ist, fragt der den regionalen/nationalen DNS-Server an und wenn man dort auch nichts findet, fragt er den ROOT-DNS an der hat, dann immer die antwort, dann geht das rekusiv zurück und wird bei sich eingetragen.



13.  Wofür verwendet man NAT und Masquerading?
14.  Wie unterscheiden sich Source und Destination NAT?
15.  Wann benötigt man Portforwarding?

**Wann bemnötigt man es?**
Portforwarding wird insbesondere benötigt, wenn ein bestimmter Computer in einem Netzwerk als Server dienen soll. Bei Serveranwendungen ist es üblich, dass der Server ein Pakter übermittelt bekommt, das er nicht selbst angefordert hat. Das ist etwa der Fall, wenn sich ein neuer Nutzer beim Server anmelden will.

**Use cases für Portforwarding?**
1. Das ein Benutzer von einem enfernten Computer auf ein lokales Netzwerkgerät zugreifen kann.
2. Ermöglicht es einem Benutzer, auf einem Dienst zuzugreifen, der nur im lokalen Netzwerk verfügbar ist.
3. Ermöglicht es eine IP-Kamera zu benutzen und sie aus der ferne zu überwachen.
4. Ermöglicht es Benutzer, einen FTP-Server auf seinem Computer zu hosten.
5. Ermöglicht es einem Benutzer einen VPN-Tunnel zu erstellen, um sichere Kommunikation zwischen zwei Netzwerken herzustellen.
6. Ermöglicht es Nutzer/Player auf einem Minecraft Server zuzugreifen, der im Lokalen Netzwerk gehostet wird.

**Wie Funktioniert Portforwarding?**
Portforwarding ist eine Technik, mit der ein Computer, der sich hinter einem Router befindet, von außen zugreifbar gemacht werden kann. Dies geschieht, indem der Router so konfiguriert wird, dass er ankommende Verbindungsanfragen, die an einen bestimmten Port gerichtet sind, an den Computer im Inneren des Netzwerks weiterleitet. Der Computer kann dann Anfragen an den Port empfangen und auf diese Antworten.

16.  Wozu wird ICMP verwendet?
17.  Was ist der Unterschied zwischen HTTP und HTTPS?
18.  Wie unterscheiden sich Endpoint- und Perimeter-Security?
19. Wozu dient das Protokoll DHCP?
20. Was ist der Unterschied zwischen symmetrischer und asymmetrischer Verschlüsselung?