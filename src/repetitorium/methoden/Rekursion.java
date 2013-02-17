package repetitorium.methoden;

public class Rekursion {
    public static void main(String[] args) {
        schema(3);
        System.out.println(quersumme(1337));
    }

    static void schema(int nr) {
        if (nr < 0) return;

        schema(nr - 1);

        for (int i = 0; i< nr + 1; i++) {
            System.out.print(nr);
        }

        System.out.println();

        schema(nr - 1);
    }

    static int quersumme(int number) {
        if (number < 10) return number;

        int rest = number % 10;
        return quersumme((number - rest) / 10) + rest;
    }
}
