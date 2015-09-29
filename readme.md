# HelloWorld Showcase mit Docker & SpringBoot

Dieses Projekt dient zur Presentation von Docker im Zusammenspiel mit Spring Boot Anwendungen.

Es kommen folgende Techniken zum Einsatz:
 
 * Docker
 * Spring Boot
 * Spring Boot Web
 * Maven
 * Java 8
 * Ubuntu
 
## HowTo

### Voraussetzungen

Um das Docker Image zu Bauen benötigt man eine Java JRE. Ich habe in dieser Version das JRE 8 mit Update 60 benutzt (jre-8u60-linux-x64.tar).
Dies kann auf den Oracle Servern heruntergeladen werden. Natürlich kann auch ein anderes JRE verwendet werden. Es sollte mindestens ein JRE der Version 7 sein. Sollte ein anderes JRE genutzt werden ist das „Dockerfile“ in src/non-packaged-resources entsprechend anzupassen.


### Installation

 1. Projekt von GitHub Klonen
 2. mvn clean install
 3. in "target" Ordner wechseln
 4. "docker build ." ausführen
 5. Docker Image starten
 
## ToDo
 * Startskript für Dockerimage erstellen
 * Auslieferungs Dateien Packen
 * ...
