package repetitorium.solutions;

public class Meldung {
    private int bewertung;
    private final Politiker handeltVon;

    public Meldung(Politiker handeltVon) {
        this.handeltVon = handeltVon;
    }

    public void setBewertung(int bewertung) {
        this.bewertung = bewertung;
    }

    public int getBewertung() {
        return bewertung;
    }

    public Politiker getHandeltVon() {
        return handeltVon;
    }
}
