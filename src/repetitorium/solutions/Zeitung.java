package repetitorium.solutions;

public class Zeitung {
    private Meldung[] meldungen;

    public Zeitung() {
        meldungen = new Meldung[0];
    }

    public void fuegeMeldungHinzu(Meldung meldung) {
        Meldung[] newMeldungen = new Meldung[meldungen.length + 1];

        for (int i = 0; i < meldungen.length; i++) {
            newMeldungen[i] = meldungen[i];
        }

        newMeldungen[newMeldungen.length - 1] = meldung;

        meldungen = newMeldungen;
    }

    public Politiker politikerMitBesterMeldung() {
        int maximum = Integer.MIN_VALUE;
        Politiker politiker = null;

        for (int i = 0; i < meldungen.length; i++) {
            Meldung meldung = meldungen[i];

            if (meldung.getBewertung() > maximum) {
                maximum = meldung.getBewertung();
                politiker = meldung.getHandeltVon();
            }
        }

        return politiker;
    }

    public static void main(String[] args) {
        Politiker p = new Zeitung().politikerMitBesterMeldung();
        if (p != null) {
            System.out.println(p.getName());
        }
    }
}
