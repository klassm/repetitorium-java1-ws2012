package repetitorium.ausdruecke;

public class WasKommtRaus {
    static boolean requireClick = true;

    public static void main(String[] args) throws Exception {

        print("5 + 3 / 4", (5 + 3 / 4));

        print("5.0 + 3/4", 5.0 + 3/4);
        print("5 + 3.0 / 4", 5 + 3.0 / 4);
        print("7 / 3 * 5 / 3", 7 / 3 * 5 / 3);
        print("7 / 3 * 5.0 / 3", 7 / 3 * 5.0 / 3);
        print("7 / 3.0 * 5 / 3", 7 / 3.0 * 5 / 3);
        print("7.0 / 3 * 5 / 3", 7.0 / 3 * 5 / 3);
        print("7.0 / 3 * ( 5 / 3 )", 7.0 / 3 * ( 5 / 3 ));

        print("5 / 0", "java.lang.ArithmeticException: / by zero");
        print("5 / 0.0", 5 / 0.0);
        print("-5 / 0.0", -5 / 0.0);
        print("(5 / 0.0) / (5 / 0.0)", (5 / 0.0) / (5 / 0.0));

        print("9 << 2", (9 << 2));
        print("9 >> 2", (9 >> 2));
        print("-1 >> 2", (-1 >> 2));
        print("-1 >>> 31", (-1 >>> 31));

        print("0x10 & 0xFF", (0x10 & 0xFF));
        print("0x10 & 0x00", (0x10 & 0x00));
        print("0x10 | 0xFF", (0x10 | 0xFF));
        print("0x10 | 0x00", (0x10 | 0x00));
        print("0x10 ^ 0x01", (0x10 ^ 0x01));
        print("0x10 ^ 0x11", (0x10 ^ 0x11));
        print("~2", Integer.toBinaryString(~2) + "=" + (~2));

        print("true && false", true && false);
        print("false && false", false && false);
        print("true || false", true || false);
        print("false || false", false || false);
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
