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
Gehe danach auf `Bindgs...`. 

![image](https://user-images.githubusercontent.com/125958687/230395994-dcc189e9-f740-41fe-8715-f61aacf5fdfe.png)

