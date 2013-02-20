package repetitorium.methoden;

public class Quersumme {
    public static void main(String[] args) {
        System.out.println(quersummeRekursiv(1337));
        System.out.println(quersummeIterativ(1337));
    }

    private static int quersummeIterativ(int number) {
        int sum = 0;
        int rest;

        do {
            rest = number % 10;
            sum += rest;

            number = (number - rest) / 10;
        } while (rest > 10);

        return sum + rest;
    }

    private static int quersummeRekursiv(int number) {
        if (number < 10) return number;

        int rest = number % 10;
        return quersummeRekursiv((number - rest) / 10) + rest;
    }
}
