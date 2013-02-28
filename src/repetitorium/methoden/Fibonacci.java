package repetitorium.methoden;

public class Fibonacci {
    public static int fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void fibonacci(int n, int first, int second) {
        if(n < 1) return;
        int third = first + second;
        System.out.println(third);

        fibonacci(n-1, second, third);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(15));

        System.out.println(0);
        System.out.println(1);
        fibonacci(20, 0, 1);
    }
}
