package repetitorium.solutions;

public class Politiker {
    private final String vorname;
    private final String nachname;

    public Politiker(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getName() {
        return vorname + " " + nachname;
    }
}
