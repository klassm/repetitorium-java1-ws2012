package repetitorium.ausdruecke;

public class Kugelvolumen {
    public static void main(String[] args) {
        float pi = 3.14159f;
        // alternativ:
        // double pi = 3.14159
        // => Unterschied?

        float r = 3f;

        double result = 4f / 3 * pi * r * r * r;
        // warum nicht:
        // double result = 4 / 3 * pi * r * r * r;
        // ??

        System.out.println(result);
        System.out.println("as int: " + (int) result);
    }
}
