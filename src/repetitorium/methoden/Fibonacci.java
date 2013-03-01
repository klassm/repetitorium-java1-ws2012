package repetitorium.methoden;

public class Fibonacci {
    public static int fibonacciNthNumber(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibonacciNthNumber(n - 1) + fibonacciNthNumber(n - 2);
    }

    public static void fibonacci(int first, int second, int round) {
        if(round == 0) return;

        int third = first + second;
        System.out.println(third);

        fibonacci(second, third, round - 1);
    }

    public static void fibonacci(int rounds) {
        System.out.println("0");
        System.out.println("1");
        fibonacci(0, 1, rounds - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacciNthNumber(15));
        System.out.println();

        System.out.println(0);
        System.out.println(1);
        fibonacci(20);
    }
}
