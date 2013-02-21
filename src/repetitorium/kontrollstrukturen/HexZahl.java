package repetitorium.kontrollstrukturen;

public class HexZahl {
    public static void main(String[] args) throws Exception {

        System.out.print("> ");

        int leadingZero = System.in.read();
        if (leadingZero != '0') {
            System.out.println("Hex Literal beginnt mit 0!");
            return;
        }

        int leadingX = System.in.read();
        if  (leadingX != 'x') {
            System.out.println("Hex Literal geht mit x weiter!");
            return;
        }

        int number = 0;
        for (int i = 0; i < 2; i++) {
            int c = System.in.read();

            if (c == '\r' || c == '\n') {
                System.out.println("Zahl zu kurz!");
                return;
            }

            if (c >= 'A' && c <= 'F') {
                c = c - 'A' + 'a';
            }

            if (! (c >= '0' && c <= '9' || c >= 'a' && c <= 'f')) {
                System.out.println("Invalides Hex Zeichen " + (char) c);
                return;
            }

            int decimalValue = -1;
            if (c >= '0' && c <= '9') decimalValue = c - '0';
            if (c >= 'a' && c <= 'z') decimalValue = c - 'a' + 10;

            number = 16 * number + decimalValue;
        }

        int enter = System.in.read();
        if (enter != '\n' && enter != '\r') {
            System.out.println("Eingabe zu lang!");
            return;
        }

        System.out.println("Dezimalzahl ist " + number + ", zugehöriges Ascii Zeichen: " + (char) number);
    }
}
