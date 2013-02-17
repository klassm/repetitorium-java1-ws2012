package repetitorium.ausdruecke;

public class ReadChar {
    public static void main(String[] args) throws Exception {

        System.out.println("Bitte Zeichen eingeben und mit <return> abschliessen");

        int i = System.in.read();
        char c = (char) i;

        System.out.println("Gelesenes Zeichen: " + c + ",  Int-Wert: " + i);
    }
}