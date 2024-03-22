public class Dozierender {

    private String name;
    private String fakultaet;
    private String bueronummer;
    
    public String frageBeantworten(String frage){
        String antwort = frage.substring(1);
        return antwort;
    }

}

