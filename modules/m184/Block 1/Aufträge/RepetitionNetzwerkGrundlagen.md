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
8. Wie unterscheiden sich TCP und UDP?$
9.  Wie funktioniert der TCP Verbindungsaufbau?
10. Was versteht man unter Well-Known Port?
11. Was ist ein Portscan?
12. Wozu dient das Protokoll DNS?
13. Wofür verwendet man NAT und Masquerading?
14. Wie unterscheiden sich Source und Destination NAT?
15. Wann benötigt man Portforwarding?

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

7.  Wozu wird ICMP verwendet?
8.  Was ist der Unterschied zwischen HTTP und HTTPS?
9.  Wie unterscheiden sich Endpoint- und Perimeter-Security?
10. Wozu dient das Protokoll DHCP?
11. Was ist der Unterschied zwischen symmetrischer und asymmetrischer Verschlüsselung?