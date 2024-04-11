import java.util.ArrayList;
import java.util.List;

public class Lehrveranstaltung {
    private String titel;
    private List<Dozierender> dozierende;
    private List<Studierender> studierende;

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

public void vorlesungsstundeHinzufuegen(Vorlesungsstunde vorlesungsstunde){
 // to be continued
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