# SSL/TLS - Apache2 Server Self Signed Certificate

### x.509 Key erstellen

#### Was ist ein x.509 Schlüssel?
Ein X.509-Schlüssel ist ein digitaler Schlüssel, der verwendet wird, um die Identität des Inhabers zu authentifizieren. Der Schlüssel besteht aus einem öffentlichen Teil und einem privaten Teil. Das öffentliche Key-Pair folgt dem X.509-Standard und wird in der Regel für verschiedene Autorisierungsszenarien verwendet, z.B. bei SSL/TLS-Verbindungen oder beim Signieren digitaler Nachrichten. Der private Teil des Schlüssels muss geheim bleiben, da er dazu verwendet wird, authentische Verbindungen herzustellen und Anfragen zu signieren. Auf diese Weise können Benutzer ihre Identität sicher überprüfen und bestätigen, wodurch die Sicherheit im Internet erhöht wird.

#### Wie funktioniert ein x.509 Schlüssel?
Ein X.509-Schlüssel funktioniert, indem der öffentliche Teil des Schlüssels verwendet wird, um sichere Verbindungen zu authentifizieren oder Nachrichten zu signieren. Der private Teil des Schlüssels kann dann für die Überprüfung der Identität und Authentifizierung von Anfragen verwendet werden. Der öffentliche Teil des Schlüssels muss über eine gesicherte Verbindung bereitgestellt werden, damit er keinem Missbrauch ausgesetzt ist. Der private Teil des Schlüssels muss geheim bleiben und nur vom Inhaber aufbewahrt werden, da er sonst missbraucht werden könnte.