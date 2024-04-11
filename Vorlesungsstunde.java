import java.time.LocalTime;
import java.time.LocalDate;

public class Vorlesungsstunde {
    private String thema;
    private LocalDate datum;
    private LocalTime uhrzeit; 
    private String raum;

    //Anm.: es könnte natürlich auch ein String für Datum und Uhrzeit verwendet werden
    //LocalDate und LocalTime können auch ohne .toString() ausgegeben werden
    
public void detailsAusgeben(){
    System.out.println("Die Vorlesungsstunde zum Thema" + thema + "findet am" + datum + "um" + uhrzeit + "im Raum" + raum + "statt");
}

public void studentHinzufuegen(Studierender student){
    System.out.println("Der Student" + student + "ist angemeldet");
}

}