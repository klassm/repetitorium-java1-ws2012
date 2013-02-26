package repetitorium.kontrollstrukturen;

public class Fibonacci {
    public static void main(String[] args) throws Exception {

        int first = 0;
        int second = 1;

        System.out.println("1.te Fibonacci Zahl: " + first);
        System.out.println("2.te Fibonacci Zahl: " + second);

        for  (int i = 2; i < 20; i++) {
            int third = first + second;
            System.out.println((i + 1) + ".te Fibonacci Zahl: " + third);

            first = second;
            second = third;
        }
    }
}
