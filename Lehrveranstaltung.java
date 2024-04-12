import java.util.ArrayList;
import java.util.List;

public class Lehrveranstaltung {
    private String titel;
    private List<Dozierender> dozierende;
    private List<Studierender> studierende;
    private List<Praktikumsstunde> praktikumsstunden;
    private List<Vorlesungsstunde> vorlesungsstunden;

public Lehrveranstaltung(String titel){
    this.titel = titel; 
    this.dozierende = new ArrayList<>();
    this.studierende = new ArrayList<>();
}


public void studentHinzufuegen(Studierender student){
    studierende.add(student);
    System.out.println("Der Student" + student + "ist angemeldet");
}
public void studentEntfernen(Studierender student){
    studierende.remove(student);
    System.out.println("Der Student" + student + "ist abgemeldet");
}
public void dozierendenHinzufuegen(Dozierender dozent){
    dozierende.add(dozent);
    System.out.println("Der Dozent" + dozent + "ist hinzugefügt");
}

public void dozierendenEntfernen(Dozierender dozent){
    dozierende.remove(dozent);
    System.out.println("Der Dozent" + dozent + "ist entfernt");
}

public void vorlesungsstundeHinzufuegen(Vorlesungsstunde vorlesungsstunde){
    vorlesungsstunden.add(vorlesungsstunde);
    System.out.println("Die Vorlesungsstunde" + vorlesungsstunde + "ist hinzugefügt");
}

public void praktikumsstundeHinzufuegen(Praktikumsstunde praktikumsstunde){
    praktikumsstunden.add(praktikumsstunde);
    System.out.println("Die Praktikumsstunde" + praktikumsstunde + "ist hinzugefügt");
}

public void praktikumsstundeEntfernen(Praktikumsstunde praktikumsstunde){
    praktikumsstunden.remove(praktikumsstunde);
    System.out.println("Die Praktikumsstunde" + praktikumsstunde + "ist entfernt");
}

public void vorlesungsstundeEntfernen(Vorlesungsstunde vorlesungsstunde){
    vorlesungsstunden.remove(vorlesungsstunde);
    System.out.println("Die Vorlesungsstunde" + vorlesungsstunde + "ist entfernt");
}   

public List<Studierender> getStudierende(){
    return studierende;
}

public void detailsAusgeben(){
    System.out.println("Die Lehrveranstaltung" + titel + "wird von folgenden Dozierenden geleitet:");
    for(Dozierender dozent : dozierende){
        System.out.println(dozent);
    }
    System.out.println("Die Lehrveranstaltung" + titel + "wird von folgenden Studierenden besucht:");
    for(Studierender student : studierende){
        System.out.println(student);
    }


}
}