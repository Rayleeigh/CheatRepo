## Windows Server 2019 (Desktop Experience) DNS Server Setup

#### Wie setzt man einen DNS-Server auf?

1. Öffne deinen Windows Server Manager und klicke auf "add roles und features".
![roles and features](https://www.osradar.com/wp-content/uploads/2020/09/dom4-1-1024x787.png)
2. Klicke einfach auf next bis du zum fenster "Server Roles" ein.
3. Wähle die Rolle "DNS-Server" aus.
![server roles](https://www.osradar.com/wp-content/uploads/2020/09/dns11.png)
4. Öffne den DNS-Manager.
5. Fahre, dann das menu von deinem Server aus bis du "Forward Lookupzone" und "Reverse Lookupzone" siehst.
![DNS-ServerFRZone](../../../../Images/Berufsschule/Module/Modul-162-Daten-analysieren-und-modellieren/DNS-Server1.png)

#### Erstellung der Reverse Lookupzone

1. Kreeiere zuerst in der "Reverse Lookupzone" eine neue Zone, klicke auf next bis du deine Netzwerk-ID festlegen kannst.
2. Füge dann hier deine Netzwerk-ID ein.
![Network-ID](../../../../Images/Berufsschule/Module/Modul-123/DNS-NID.png)
3. Klicke in diesem Fenster einfach auf "Next" es sei den du möchtest den namen nach den Zahlen ändern.
4. In diesem Fenster belasse es bei diesen Einstellungen, da es eigentlich keinen Unterschied macht für diese Übung.
![Dynmic Update](../../../../Images/Berufsschule/Module/Modul-123/DNS-Dynamic.png)
5. Klicke, dann auf finished.

#### Erstellung der Forward Lookupzone

1. Kreeire in dem Ordner Forward-Lookupzone, indem du einen Rechtsklick auf den Ordner machts und auf "New Zone" klickst.
2. Du siehst, dann ein Fenster bei dem du deinen Zonentypen auswählen kannst. Wähle hierbei den Typ "Primary zone".
![ZoneType](../../../../Images/Berufsschule/Module/Modul-123/ZoneType.png)
3. Lege den Namen der neuen Zone fest, wähle hierfür am besten einen einfachen Namen.
![ZoneName](../../../../Images/Berufsschule/Module/Modul-123/ZoneName.png)
4. In diesem Fenster wird die neue DNS-File kreeiert. Man kann auch in diesem Fenster eine schon existierende.
![ZoneFile](../../../../Images/Berufsschule/Module/Modul-123/DNSFile.png)
5. In diesem Fenster kann man wie schon oben erwähnt das Dynamic Update festlegen, dass heisst wenn man etwas ändert im nachhinein, dass sich die anderen Optionen die mit dem veränderten Content im zusammenhang stehen auch mitverändern und nicht bleiben, dies ist jedoch für diese Übung überflüssig, deshalb kann man es hierbei bei "Do not allow dynamic updates" belassen.
![DynamicUpdate](../../../../Images/Berufsschule/Module/Modul-123/DNS-Dynamic.png)
5. Klicke, dann auf "Finish"

#### Hinzufügen des Clients.

1. Öffne die erstellte "Forward-Lookupzone" und rechtsklicke irgendwo auf die weisse Fläche, und klicke dann auf "New Host (A or AAAA)".
![newHost](../../../../Images/Berufsschule/Module/Modul-123/NewHost.png)
2. Trage in diesem Fenster, die IP-Adresse deines Clients ein und den Client Namen ein.
![WS-PC-06](../../../../Images/Berufsschule/Module/Modul-123/Konfigurieren.png)

#### Adapter Settings für den Server

1. Versichere dich, dass dein Windows Server über die richtigen Adpatereinstellungen verfügt.
![Adapteroptionen](../../../../Images/Berufsschule/Module/Modul-123/AdapterOptionen.png)
Falls du nicht über die richtigen Adaptereinstellungen verfügst träge diese hier ein. Deinen "Prefered DNS-Server" wirst du selbst sein also träge hier einfach deine IP-Adresse ein.
2. Klicke, dann auf "Advanced" und klicke auf oben auf den Tab "DNS" füge unten bei "DNS Suffix for this connection" den Namen deiner Forward-Lookupzone ein.
![Adapteroptionen](../../../../Images/Berufsschule/Module/Modul-123/DNSAdapterSettingAdvanced.png)
3. Schliesse, dann alle kürzlich geöffneten Fenster, indem du auf "OK" klickst.
