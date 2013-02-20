package repetitorium.methoden;

public class Potenzberechnung {
    public static void main(String[] args) {
        System.out.println(powRekursiv(3, 2));
        System.out.println(powIterativ(3, 2));
    }

    private static int powRekursiv(int base, int exp) {
        if (exp == 0) return 1;
        if (exp < 0) return -1;

        return base * powRekursiv(base, exp - 1);
    }

    private static int powIterativ(int base, int exp) {
        if (exp < 0) return -1;

        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }

        return result;
    }
}
