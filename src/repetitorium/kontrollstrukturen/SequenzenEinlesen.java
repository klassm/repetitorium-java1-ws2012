package repetitorium.kontrollstrukturen;

public class SequenzenEinlesen {
    public static void main(String[] args) throws Exception {
        System.out.print("> ");
        int c = System.in.read();

        if (c >= 'a' && c <= 'z') {
            char bigLetter = (char) (c - 'a' + 'A');
            char smallLetter = (char) c;
            System.out.println(smallLetter + " " + bigLetter);
        } else if (c >= 'A' && c <= 'Z') {
            char bigLetter = (char) c;
            char smallLetter = (char) (c - 'A' + 'a');
            System.out.println(bigLetter + " - " + smallLetter);
        } else if (c >= '0' && c <= '9') {
            int number = c - '0';
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println();
        } else {
            System.out.println("Keine bekannte Anweisung!");
        }
    }
}
