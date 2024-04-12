
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class BasicTests {
    
    
    @Test
    void studierenderHinzufuegenTest() {
        
        // Setup
            Lehrveranstaltung mathe1 = new Lehrveranstaltung("Mathe1");
            Studierender student1 = new Studierender("Max", 12345, "Informatik");
            Studierender student2 = new Studierender("Moritz", 56789, "Informatik");

            // Ausführung
            mathe1.studentHinzufuegen(student1);
            mathe1.studentHinzufuegen(student2);
            List<Studierender> angemeldeteStudeneten = mathe1.getStudierende();
            List<Studierender> erwarteteListe = new ArrayList<>(); 
            erwarteteListe.add(student1);
            erwarteteListe.add(student2);
            
        // Überprüfung
            assertEquals(erwarteteListe, angemeldeteStudeneten);
    }

}
