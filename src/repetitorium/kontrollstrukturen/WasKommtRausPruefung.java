package repetitorium.kontrollstrukturen;

public class WasKommtRausPruefung {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("A:" + i++ + " " + i);

        i = Integer.MAX_VALUE;
        System.out.println("B:" + (i++ - Integer.MAX_VALUE));

        i = 2;
        System.out.println("C:" + (char) ('a' + i ));

        i = 6;
        System.out.println("D:" + ((i<5?0:1) + 1));

        float f = Float.MAX_VALUE;
        System.out.println("E:" + (f+f));
        System.out.println("F:" + (f / 0));

        i = 1;
        System.out.print("G:");
        while (i < 5) {
            i+=1;
            if (i%2 == 0) continue;
            System.out.print(" " + i);
        }
        System.out.println();

        String s1= new String("hallo"); String s2 = new String("hallo");
        System.out.println("H:" + s1 == s2);
    }
}
