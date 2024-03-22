public class Dozierender {

    private String name;
    private String fakultaet;
    private String bueronummer;
    
    public String frageBeantworten(String frage){
        String antwort = frage.substring(1);
        return antwort;
    }

}


Klasse Studierender
Datenfelder: name (Der Name des Studierenden), matrikelnummer: (Die Matrikelnummer des
Studierenden.), studiengang: (Der Studiengang des Studierenden.)
Öffentliche Methode: frageStellen (Ermöglicht es den Studierenden, eine Frage an eine*n Dozierende*
n zu stellen.)
Klasse Dozierender
Datenfelder: name (Der Name des Dozierenden), fakultaet (Die Fakultaet zu dem der*die Dozierende
gehört.), bueronummer (Die Büronummer des*der Dozierenden.)
Öffentliche Methode: frageBeantworten (Ermöglicht es d