package repetitorium.ausdruecke;

public class WasKommtRausCasten {
    private static boolean requireClick = true;

    public static void main(String[] args) throws Exception {

        print("(int) 'a'", (int) 'a');
        print("(char) 65", (char) 65);
        print("(char) 65.14156", (char) 65.14156);

        print("(float) 42", (float) 42);
        print("(double) 42", (double) 42);

        print("(int) 3.49", (int) 3.49);
        print("(int) 3.51", (int) 3.51);


    }

    static void print(String text, Object erg) throws Exception {
        System.out.println();
        System.out.println();
        System.out.print(text);

        if (requireClick) {
            System.in.read();
            for(int i = 0; i < System.in.available(); i++) {
                System.in.read();
            }
        } else {
            System.out.println();
        }

        System.out.println(text + " = " + erg);
    }
}
