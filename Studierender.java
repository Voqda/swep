

public class Studierender {

    
    private String name;
    private int matrikelnummer;
    private String studiengang;

    public Studierender(String name, int matrikelnummer, String studiengang){
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    public void frageStellen(Dozierender prof, String frage){
       prof.frageBeantworten(this, frage);
    }
}
