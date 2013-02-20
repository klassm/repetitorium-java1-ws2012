package repetitorium.kontrollstrukturen;

public class Fibonacci {
    public static void main(String[] args) throws Exception {

        int first = 0;
        int second = 1;

        for  (int i = 0; i < 20; i++) {
            int third = first + second;
            System.out.println((i + 1) + ".te Fibonacci Zahl: " + third);

            first = second;
            second = third;
        }
    }
}
