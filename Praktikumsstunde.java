import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Praktikumsstunde {
    private String thema;
    private LocalDate datum;
    private LocalTime uhrzeit; 
    private String raum;
    private List<String> aufgaben;
    //Anm.: es könnte natürlich auch ein String für Datum und Uhrzeit verwendet werden
    //LocalDate und LocalTime können auch ohne .toString() ausgegeben werden

public Praktikumsstunde(String thema, LocalDate datum, LocalTime uhrzeit, String raum){
    this.thema = thema;
    this.datum = datum;
    this.uhrzeit = uhrzeit;
    this.raum = raum;
    this.aufgaben = new ArrayList<String>(); 
}
    
public void detailsAusgeben(){
    System.out.println("Die Praktikumsstunde zum Thema" + thema + "findet am" + datum + "um" + uhrzeit + "im Raum" + raum + "statt");
    System.out.println("Es werden folgende Aufgaben behandelnt:" + aufgaben);
    for(String aufgabe : aufgaben){
        System.out.println(aufgabe);
    }
}
}
