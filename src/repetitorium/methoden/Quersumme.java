package repetitorium.methoden;

public class Quersumme {
    public static void main(String[] args) {
        System.out.println(quersummeRekursiv(17));
        System.out.println(quersummeIterativ(17));
    }

    private static int quersummeIterativ(int number) {
        int sum = 0;
        int rest;

        do {
            rest = number % 10;
            sum += rest;

            number = (number - rest) / 10;
        } while (number > 10);

        return sum + number;
    }

    private static int quersummeRekursiv(int number) {
        if (number < 10) return number;

        int rest = number % 10;
        return quersummeRekursiv((number - rest) / 10) + rest;
    }
}
