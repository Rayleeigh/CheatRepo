# MITM - Man in the middle 

## Wie funktioniert ARP Spoofing und welche Voraussetzungen benötigt ein Angreifer?
![ARP-Spoofing](https://www.networkacademy.io/sites/default/files/inline-images/arp-spoofing.gif)
<legend>Bild von <a href="https://www.networkacademy.io/ccna/ethernet/arp-security">Network-Academy</a></legend>

###### Was ist ARP-Spoofing und wie funktioniert es?
ARP-Spoofing ist eine Angriffsart, die das Address Resolution Protocol (ARP) nutzt, um Daten abzufangen, die zwischen zwei Computern oder Geräten in einem lokalen Netzwerk (LAN) gesendet werden. Dabei werden gefälschte ARP-Antworten an die beiden kommunizierenden Einheiten gesendet, wodurch der von einem Gerät gesendete Datenverkehr auf ein anderes umgeleitet wird. Auf diese Weise kann ein Angreifer alle Daten abfangen und verändern, die über seine LAN-Verbindung laufen, und sich als andere Knoten im Netzwerk ausgeben. ARP-Spoofing kann für eine Vielzahl von böswilligen Aktivitäten wie Man-in-the-Middle-Angriffe und Denial-of-Service-Angriffe genutzt werden.

###### Welche Voraussetzungen braucht der Angreifer?
Um einen erfolgreichen ARP-Spoofing-Angriff durchzuführen, benötigt der Angreifer Zugriff auf das lokale Netzwerk, um die Datenpakete des Opfers abzufangen. Außerdem braucht er eine Software oder ein Werkzeug, mit dem er die falschen ARP-Antworten generieren und die Verbindung zu beiden Kommunikationspartnern herstellen kann. Er muss auch über Kenntnisse im Bereich Netzwerksicherheit verfügen, um den Angriff so effizient wie möglich durchführen zu können.

###### Wie kann man ARP-Spoofing mitigieren/blockieren?
ARP-Spoofing zu verhindern oder zu minimieren ist die beste Vorgehensweise, um sich vor dieser Art von Angriffen zu schützen. Einige der Methoden, mit denen man ARP-Spoofing abwehren kann, sind:

* Verwendung von Static-ARP Entries: Dieses Verfahren erstellt statische Einträge für alle Geräte, die mit dem Netzwerk verbunden sind, sodass nur gültige Pakete akzeptiert werden.
* Implementierung eines Port Security Protocols (PSP): Mit diesem Protokoll werden spezifische Mac-Adressen auf einzelnen LAN Ports autorisiert. Unautorisierte Pakete werden blockiert.
* Implementierung eines Advanced Authentication Algorithmus: Dieser Algorithmus verschlüsselt und authentifiziert jeden Pakettransfer über das Netzwerk.
* Implementierung einer Intrusion Detection System (IDS): Mit diesem System können ungewöhnliche Aktivitäten und potenzielle Angriffe erkannt werden, damit Gegenmaßnahmen getroffen werden können.

###### ARP-Spoofing mit Ettercap
Wie kann man ARP-Spoofing mit Ettercap betreiben unten erfahrst du wie:

```
sudo ettercap -TqM arp:remote /<targetip>// /<routerip>//
```

## Wie funktioniert DNS Spoofing und welche Voraussetzungen benötigt ein Angreifer?
![DNS-Spoofing](https://static.wixstatic.com/media/6a4a49_919a0d3958204178959c72f6eff9c184~mv2.gif)
<legend>Bild von<a href="https://www.hackers-arise.com/post/2017/05/23/hacking-dns-to-re-direct-anyone-on-your-lan-to-your-website">hacker-arise.com</a></legend>

###### Was ist DNS-Spoofing und wie funktioniert es?
DNS-Spoofing ist ein Angriff, bei dem der Angreifer versucht, den Namen einer bestimmten Website oder URL zu fälschen und dabei möglicherweise auf eine andere Webseite zu verweisen. Mithilfe dieses Angriffs kann der Angreifer Benutzern betrügerische Websites vorgaukeln oder die Kommunikation zwischen Benutzern und legitimen Websites unterbrechen.

Der Mechanismus des DNS-Spoofings hängt vom Domain Name System (DNS) ab. Bei jeder Anfrage an einen DNS-Server wird die IP-Adresse des Hosts bzw. Servers gefunden, der die entsprechende Webseite anzeigt. Der Angreifer übermittelt nun seine falschen Antworten über eine spezielle Software an den DNS-Server des Opfers und täuscht vor, dass die IP-Adresse der betrügerischen Webseite statt der legitimen IP-Adresse gehört. Daher fragt der DNS des Opfers den falschen Server nach Informationen, wodurch er schließlich mit Inhalten vom Angreifer statt von seinem ursprünglichen Ziel versorgt wird.

###### Welche Voraussetzungen braucht der Angreifer?
Für einen erfolgreichen DNS-Spoofing müssen ein Angreifer über verschiedene Anforderungen und Voraussetzungen verfügen. Der Angreifer benötigt in der Regel Zugriff auf das Netzwerk des Opfers, damit er seine gefälschten Antworten an den DNS-Server des Opfers senden kann. Darüber hinaus hat der Angreifer eine spezielle Software oder Werkzeug benötigt, welche die falschen Antworten generiert und die Verbindung zur betrügerischen Webseite herstellt. Des Weiteren sollte der Angreifer über grundlegende Kenntnisse im Bereich des Domain Name Systems (DNS) sowie Netzwerkprotokollen und IP-Adressierung verfügen, um sicherzustellen, dass alle Schritte ordnungsgemäß ausgeführt werden.

###### Wie kann man DNS-Spoofing mitigieren/blockieren?

###### DNS-Spoofing mit Ettercap + Vorbereitungen
Um einen DNS-Spoofing angriff durchführen zu könne muss man zuerst ein paar Vorbereitungen treffen.
Unten werde ich dir Zeigen welche Vorbereitungen man durchführen muss um einen DNS-Spoofing Angriff erfolgreich durchführen zu können.

**1. Schritt**<br>
Für den ersten Schitt wäre es von Vorteil wenn man 

sudo ettercap -Q -T -M arp:remote -P dns_spoof /<routerip>// /<clientip>//
