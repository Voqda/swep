public class Dozierender {

    private String name;
    private String fakultaet;
    private String bueronummer;

    public Dozierender(String name, String fakultaet, String bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }
    
    public void frageBeantworten(Studierender student, String frage){
        System.out.println("Die Frage von" + student + " ist" + frage);
    }

    public void studierenderHinzufuegen(Lehrveranstaltung lehrveranstaltung, Studierender studierender){
        lehrveranstaltung.studentHinzufuegen(studierender);
    }

    public void studierenderEntfernen(Lehrveranstaltung lehrveranstaltung, Studierender studierender){
        lehrveranstaltung.studentEntfernen(studierender);
    }

     

}

