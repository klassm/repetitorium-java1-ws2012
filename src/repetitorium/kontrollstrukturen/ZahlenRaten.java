package repetitorium.kontrollstrukturen;

import java.util.Random;

public class ZahlenRaten {

    public static void main(String[] args) throws Exception{

        final int tries = 20;
        final int max = 100;
        int random = (new Random().nextInt(max));

        System.out.println("Hallo Spieler! Du hast " + tries + " Versuche! Die Zahl ist maximal " + max + "!");

        for(int i = 0; i < tries; i++) {
            System.out.print("Versuch " + (i + 1) + ": ");

            int readNumber = 0;
            int currentChar = System.in.read();
            while(currentChar != '\n' && currentChar != '\r') {
                int integerValue = currentChar - '0';
                readNumber = readNumber * 10 + integerValue;
                currentChar = System.in.read();
            }

            if(readNumber == random) {
                System.out.println("Richtig!");
                return;

            } else if(readNumber < random) {
                System.out.println("Die eingegebene Zahl ist kleiner als die gesuchte Zahl!");

            } else {
                System.out.println("Die eigegebene Zahl ist groesser als die gesuchte Zahl!");

            }
        }

        System.out.println("Das wars. Verloren :P");
    }


}
