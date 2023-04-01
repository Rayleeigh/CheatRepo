# Wireshark Netzwerkattacken
Auswirkungen der Netzwerkattacken auf Wireshark log

## MACFLOOD
![image](https://user-images.githubusercontent.com/125958687/229298440-bf1abb3d-8b9d-4572-a0a6-d61fe9cce4e0.png)
Wireshark nachdem ein MacFlood durchgeführt wurde
### Was ist ein Macflood?
MAC-Flooding ist eine Angriffstechnik, um die Source Address Table eines Switches mit gefälschten MAC-Adressen zu fluten. Mit einer Denial of Service werden in ein geswitchtes Ethernet massenhaft Datenpakete eingeschleust, welche alle eine andere MAC-Adresse enthalten
### Wie zeichnet sich ein Macflood in Wireshark aus?
Ein Macflood zeichnet sich darin aus, dass er immer die gleiche länge hat. Man kann dies mit dem folgenden Filter machen `eth.len = 72`.

