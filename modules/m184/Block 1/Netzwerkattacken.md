# Mac-Flood
# Syn-Flood
# Teardrop
# Land
Land, Was ist das und was tut sie, die untenstehenden Antworten sollten dies, für dich klären:

**1. Was ist eine Land-Attacke**<br>
LAND oder auch Local Area Network Denial attack ist ein untertyp von einem Denial of Service (DOS) Angriff. Der Angreifer setzt seiner Netzwerk-Einstellungen auf die des Ziel-Systems. Das heisst der Angreiffer verwendet die gleiche destination IP, die gleichen Ports und der gleiche TCP-Segment-Source. Die Attacke gelingt in dem der Computer gezwungen wird mit sich selbst zu reden, sodass der Host, also Ziel-System an sich selbst; SYN-ACK packete zusendet bis der Computer crashed oder einfriert. Dies passiert, da der Computer diese Packete immer und immer wieder an sich selbst schickt. 

Dies führt zum Aufbau einer leeren Verbindung, die so lange bestehen bleibt, bis der Wert für das inaktive Timeout erreicht ist. Wenn ein Server mit solchen leeren Verbindungen überflutet wird, löst dies einen Denial-of-Service (DoS)-Zustand aus, der zu einem LAND-Angriff führt. Der Artikel gibt einen kurzen Überblick über den LAND-Angriff, seinen Zweck und wie man ihn durch rechtzeitige Erkennung verhindern kann.

**2. Welches Ziel verfolgt diese Attacke?**<br>
Das ziel ist es, das Ziel-System mit SYN-ACK paketen, die es sich selbst zusendet lahm zu legen, dies funktionert indem der Angreifer die Netzwerk-Einstellungen des Ziel Systems imitiert und, dann SYN-Anfragen and das Zielsystem sendet und sich als das Zielsystem ausgibt.

**3. Welche Möglichkeiten gibt es, um sich gegen diese Angriffe zu schützen?**<br>
Abwehrtechniken umfassen das Installieren von Patches auf den anfälligen Systemen oder die Verwendung einer Firewall, die so konfiguriert ist, dass sie LAND-Pakete herausfiltert

**4. Ist diese Attacke in heutigen Netzwerken und mit modernen Betriebssystemen noch wirksam?**<br>
Nein, da die meisten Betriebsysteme und Netzwerkgeräte dieses Problem schon längst behoben haben, jedoch ist es noch auf älteren Version wirksam, die diese Schwachstelle noch nicht behoben/gepatcht haben.

**Ablauf einer LAND attacke**
![ablauf einer land attacke](https://t1.daumcdn.net/cfile/tistory/995B573359EB8D3E10)
<legend>source [보안 공부 - 티스토리](https://tar-cvzf-studybackup-tar-gz.tistory.com/43)</legend>