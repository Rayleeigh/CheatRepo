## JSON Analyse
Der Auftrag lautete eine JSON-Datei zu analysieren, sodass wir diese verstehen können.

### Was ist eigentlich JSON?
JSON, ist ein Akronym. JSON steht für JavaScript Object Notation.
JSON ist ein kompaktes Datenformat in einer einfachen lesbaren Textform.
Es wird zum Austausch von Daten zwischen Programmen benötigt
JSON ist ausserdem ein komplett unabhängiges Datenformat ohne anbindung an die JavaScript Programmiersprache.

### Wie ist die Datei json-example.json strukturiert.
```
{
	"Owner": "Yves Nussle",
	"Created": "2021-04-12T23:00:00",
	"Player": "Spotify",
	"Playlists": [
		{
			"Name": "Pop",
			"Randomize": false,
			"Tags": ["cool", "hip", "pop"],
			"Songs": [
				{"Name": "Popsong Number 1",
				"File": "pop1.mp3",
				"Length": 4.3,
				"Genre": "Pop"},
				{"Name": "Popsong Number 2",
				"File": "pop2.mp3",
				"Length": 5.3,
				"Genre": "Rap"},
				{"Name": "Popsong Number 3",
				"File": "pop3.mp3",
				"Length": 3.8,
				"Genre": "Pop"}
			]
		}
```
Hier in diesem Beispiel sieht man wie das json strukturiert ist.
Ich werde folgende dinge unten genauer erklären.
```
"Owner": "Yves Nussle" // Dies ist ein JSON-Object mit dem Namen "Owner" und dem Wert "Yves Nussle".
                       // Die Datentypen, die in diesem Objekt verwendet wird, heissen Sting.
```
Oben habe ich ein JSON-Object erwähnt.
Auch in JSON gibt es Arrays.
Unten ein Beispiel mit erklärung.
```
"Songs": [                                  // Hierbei ist "Songs"
		{"Name": "Popsong Number 1", 
		"File": "pop1.mp3",
		"Length": 4.3,
		"Genre": "Pop"},

		{"Name": "Popsong Number 2",
		"File": "pop2.mp3",
		"Length": 5.3,
		"Genre": "Rap"},

		{"Name": "Popsong Number 3",
		"File": "pop3.mp3",
		"Length": 3.8,
		"Genre": "Pop"}
			]
```