## Filesharing mit Samba
###### Ubuntu Server 22.04.1 LTS
###### von Rayan Bopp

#### Installation Samba Pakete

Sambapakete installieren via Paketmanager

````
sudo apt update

sudo apt install samba
````

#### Zu teilenden Ordner erstellen

Sodass man auf dem Windows client auf den geteilten Ordner überhaupt zugreifen kann.
````
sudo mkdir /home/sysadm/sambashare

sudo chmod 777 /home/sysadm/sambashare
````

#### Konfigurationdatei anpassen
Einen neuen Abschnitt in der Konfigurationsdatei von Samba einfügen:
````
[sambashare]
    comment = Samba on Ubuntu
    path = /home/sysadm/sambashare
    read only = no
    browsable = yes
````

#### Benutzer für Samba festlegen
````
Sudo adduser $USER --> erstellt neuen Benutzer mit dem Namen von localuser

sudo smbpasswd $USER --> Fügt User zu Samba hinzu
````

#### Firewall

Erlaube Samba privilegien unter der Firewall
````
sudo ufw allow samba
````

#### Samba neu sstarten

````
sudo systemctl restart smbd --> startet Samba neu
````

#### Windows - Verbinden

Unter Explorer Menuband erweitern und auf "MAP NETWORK DRIVE" klicken füge folgendes hinzu
````
\\[IPADRESS\[GETEILTER ORDNER]]
````
