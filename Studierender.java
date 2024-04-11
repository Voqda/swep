public class Studierender{

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

    public void anmelden(Lehrveranstaltung lehrveranstaltung){
        lehrveranstaltung.studentHinzufuegen(this);
    }

    public void abmelden(Lehrveranstaltung lehrveranstaltung){
        lehrveranstaltung.studentEntfernen(this);
    }

    public void teilnehmen(Vorlesungsstunde vorlesungsstunde){
        vorlesungsstunde.studentHinzufuegen(this);
    }
}
