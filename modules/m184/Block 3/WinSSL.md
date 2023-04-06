# SSL-TLS - Windowsserver

## Windows IIS-Manager
Suche den Internet Information Services (IIS) Manager im Windowsmenu und öffne ihn.
Auf der linken Seite gibt es ein drop-down menu klappe, dies aus und gehe auf dein Windows Webserver.
Wenn man ein bisschen nach unten scrollst siehst du folgendes:

![image](https://user-images.githubusercontent.com/125958687/230393446-0df48de4-d612-4339-92ca-aaf919170524.png)

Doppelklicke, dann auf `Serverzertifikate`. Du solltest, dann eine leeres fenster in der mitte haben, dort werden nachher deine Zertifikate angezeigt.
Klicke hier auf `Selbstsigniertes Zertifikat erstellen...` um ein eingenes Zertifiakt erstellen.

![image](https://user-images.githubusercontent.com/125958687/230394381-99a94008-3731-4b93-a709-98bb0ca9972b.png)

Dann kommt ein Pop-Up und in diesem kannst du, dann dein `selfsigned certificate` erstellen.
Füge ganz einfach den Anzeigename für dein Zertifikat ein und den Zertifikatspeicher in unserem Falle wäre dies `Webhosting`.

![image](https://user-images.githubusercontent.com/125958687/230395105-c6882dfc-832f-4934-82db-2e2686646e5c.png)

Super! Du hasst jetzt dein Selfsigned Certificate erstellt, jetzt musst du dies nur noch mit deiner Website verknüpfen.
Hierfür klappst du deine Ordnerstruktur unter Site auf, dann klickst du auf Default Web Site.
Gehe danach auf `Binidgs...`. 

![image](https://user-images.githubusercontent.com/125958687/230395994-dcc189e9-f740-41fe-8715-f61aacf5fdfe.png)

Nachdem du auf `Bindings...` gedrückt hast, musst du ein neues binding erstellen.
Klicke hierfür in dem Pop-Up auf `Add..`

![image](https://user-images.githubusercontent.com/125958687/230396906-6a14484c-ca51-4510-aa0d-45c61060a295.png)

Konfiguriere es wie folgt:

* Type:	In the drop-down list, select https.
 	
* IP address:	In the drop-down list, select the IP address of the site or select All Unassigned.
 	
* Port:	Type port 443. The port over which traffic is secured by SSL is port 443.

* SSL-Certificate: Your previously created certificate.

dies sollte, dann wie folgend aussehen:

![image](https://user-images.githubusercontent.com/125958687/230397394-7d1cd9ec-a2dd-4ecf-834e-d25b170b6d4b.png)

Am Schluss sollte dies wie folgt aussehen:

![image](https://user-images.githubusercontent.com/125958687/230397490-85ad42ce-92f6-4f5b-b38e-4d3dfb87e3ee.png)

## Auf die Website zugreifen
versuchen wir jetzt einmal von aussen auf die Website zuzugreifen, dies macht man indem man die IP eingibt und, oh das geht ja nicht.
Gehe, dann zu deinem OPNSense Webinterface und erstelle eine neue NAT-Rule.
Sie sollte wie folgt aussehen.

![image](https://user-images.githubusercontent.com/125958687/230398144-7e28ab30-fd68-49d5-8fe3-67b65997a1bd.png)
![image](https://user-images.githubusercontent.com/125958687/230398487-45b03fcb-556c-40f5-94bd-29f544fb978a.png)

Danach solltest du auf deine HTTPS-Website zugreifen können indem du folgendes in der Searchbar eingibst:
```
https://<WAN-INTERFACE-IP>:<DESIGNATED PORT>
```
