

public class Studierender {
    private String name;
    private int matrikelnummer;
    private String studiengang;

    public void frageStellen(Dozierender prof, String frage){
       prof.frageBeantworten(frage);
    }
}
