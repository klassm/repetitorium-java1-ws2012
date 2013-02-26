package repetitorium.kontrollstrukturen;

import java.util.Random;

public class ZahlenRaten {

    public static void main(String[] args) throws Exception{

        int random = (new Random().nextInt(100));
        int tries = 20;

        for(int i = 0; i < tries; i++) {

            int readNumber = 0;
            int currentChar = System.in.read();
            while(currentChar != '\n' && currentChar != '\r')
            {
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

        System.out.println("Anzahl Versuche erschoepft. Ende.");
    }


}
