## Repetition Normalisierung

---

#### Was versteht man unter Normalisierung Vereinfacht

Normalisierung ist ein Verfahren zur strukturellen Verbesserung einer Datenbank, das eine Reduzierung von Redundanzen und eine Minimierung von Inkonsistenzen beinhaltet, indem Daten in separate Tabellen ausgelagert werden.

#### Was versteht man unter Normalisierung

Unter Normalisierung versteht man ein Verfahren zur strukturellen Verbesserung einer Datenbank. Es dient der Reduzierung von Redundanzen und der Minimierung von Inkonsistenzen in der Datenbank. Normalisierung beinhaltet die Zerlegung von Tabellen in kleinere Tabellen, die miteinander verknüpft werden. Dabei werden wiederkehrende Datenkombinationen entfernt und in separate Tabellen ausgelagert. Normalisierung sorgt somit für eine strukturierte und effiziente Verwaltung von Daten.

---

#### Wie Normalisiert man?

1. Identifiziere Redundanzen und Inkonsistenzen in der bestehenden Datenbank.
2. Zerlege Tabelle in kleinere Tabellen.
3. Entferne wiederkehrende Datenkombinationen und lagere diese in separate Tabellen aus.
4. Stelle Verbindungen zwischen den Tabellen her.
5. Überprüfe die Normalisierung auf Redundanzen und Inkonsistenzen.
6. Aktualisiere die Datenbank regelmäßig.

---

1. ist dann gegeben wenn alle Attributwerte atomar sind dabei ist ein Attribut, dann atomar wenn es weder aus kleineren Einheiten zusammengesetzt ist, noch mehrwertig ist. 
2. Ist dann gegeben, wenn sie in der ersten Normalform ist und jedes Nichtschlüsselattribut von jedem Schlüssel voll funktional abhängig ist. Konkret heißt das, dass Nichtschlüsselattribute vom gesamten Schlüssel und nicht nur von einem Teil des Schlüssels abhängen.
3. Ist dann gegeben, wenn sie in der ersten und zweiten Normalform vollständig sind und kein Nichtschlüsselattribut von (irgend) einem Schlüssel transitiv anhängt, um eine transitive Abhängigkeit auszuschließen, müssen alle Nichtschlüsselattribute nicht von anderen Nichtschlüsselattributen abhängig sein.


#### Für was sind die Normalisierungsformen da?

Sie dienen dazu, Redundanzen in einer relationalen Datenbank zu vermeiden. Diese Normalisierungsform beinhaltet die folgenden Regeln:

#### Was heisst keine Transitiven Abhängigkeiten? 

Eine transitive Abhängigkeit ist eine Beziehung zwischen drei oder mehr Attributen, die nicht direkt miteinander verbunden sind. In einer Datenbank bedeutet dies, dass ein Attribut abhängig ist von einem anderen Attribut, das wiederum von einem dritten Attribut abhängig ist. Beispielsweise könnte ein Attribut "Adresse" abhängig sein von einem Attribut "Stadt", das wiederum von einem Attribut "Land" abhängig ist. Solche Abhängigkeiten sind in einer normalisierten Datenbank nicht erlaubt.

#### Transitiv für Dummies

In einer Datenbank kann ein Attribut von einem anderen Attribut abhängig sein. Wenn ein Attribut (z.B. Adresse) von einem anderen Attribut (z.B. Stadt) abhängig ist, das wiederum von einem dritten Attribut (z.B. Land) abhängig ist, dann spricht man von einer transitive Abhängigkeit. In einer normalisierten Datenbank sind solche Abhängigkeiten nicht erlaubt.

---

#### 1. Normalisierungsform (1NF)

**Regeln der 1NF**

1. Alle Attribute müssen atomar sein.
2. Jede Tabelle muss einen Primärschlüssel haben.
3. Keine Mehrfachwerte.
4. Keine redundanten Daten.
5. Keine aufgelösten Referenzbeziehungen.

**Für was sorgt die 1NF**

Diese Regeln sorgen dafür, dass alle Daten in der Datenbank konsistent und normalisiert sind und dass keine überflüssigen Daten vorhanden sind. Dies ermöglicht es, dass Änderungen an den Daten leichter vorgenommen werden können, ohne dass andere Daten beeinflusst werden.

**1NF für Dummies erklärt**

Die erste Normalform (1NF) ist erfüllt, wenn die Attribute des Relationstyps atomar sind. Zusammengesetzte Attribute werden in eigene Attribute getrennt, Attribute mit mehreren Werten des gleichen Typs auf mehrere Zeilen aufgeteilt.

---

#### 2. Normalisierungsform (2NF)

**Regeln der 2NF**

1. Alle Attribute müssen atomar sein.
2. Jede Tabelle muss einen Primärschlüssel haben.
3. Alle Nicht-Primärschlüsselattribute müssen vollständig von der Primärschlüsselabhängigkeit abhängig sein.
4. Keine Redundanzen.

**Für was sorgt die 2NF**

Diese Regeln sorgen dafür, dass alle Daten in der Datenbank konsistent und normalisiert sind und dass keine überflüssigen Daten vorhanden sind. Dies ermöglicht es, dass Änderungen an den Daten leichter vorgenommen werden können, ohne dass andere Daten beeinflusst werden.

**2NF für Dummies erklärt**

Ein Relationstyp ist in der 2. Normalform (2NF), wenn er sich in der 1. Normalform (1NF) befindet und jedes Nichtschlüsselattribut voll funktionale Abhängigkeit von jedem Schlüsselkandidaten hat. Um einen Relationstyp in die 2NF zu konvertieren, müssen Entitäten identifiziert, Primärschlüssel definiert, Kardinalitäten zwischen Entitäten identifiziert und Netzwerk-Beziehungen aufgelöst werden. Dies ermöglicht es, FKs hinzuzufügen, was schließlich das Datenmodell abbildet.

---

#### 3. Normalisierungsform (3NF)

**Regeln der 3NF**

1. Alle Attribute müssen atomar sein.
2. Jede Tabelle muss einen Primärschlüssel haben.
3. Alle Nicht-Primärschlüsselattribute müssen vollständig von der Primärschlüsselabhängigkeit abhängig sein.
4. Keine transitive Abhängigkeiten.
5. Keine Redundanzen.

**Für was sorgt die 3NF**

Diese Regeln sorgen dafür, dass alle Daten in der Datenbank konsistent und normalisiert sind und dass keine überflüssigen Daten vorhanden sind. Dies ermöglicht es, dass Änderungen an den Daten leichter vorgenommen werden können, ohne dass andere Daten beeinflusst werden.

**3NF für Dummies erklärt**

Ein Relationstyp ist in der dritten Normalform (3NF), wenn er in der zweiten Normalform (2NF) ist und kein Nichtschlüsselattribut transitiv vom Kandidatenschlüssel abhängt. Um die 3NF zu erfüllen, werden transitiv abhängige Attribute in eigene Entitäten verschoben. Für Datenkonsistenz und -Integrität sorgen sowohl das Datenmodell als auch das DBMS. Das DBMS verhindert z.B. die Einfügung von FKs, wenn kein PK existiert.

---

&copy; Rayan