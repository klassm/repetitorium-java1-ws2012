package repetitorium.kontrollstrukturen;

public class Einmaleins {
    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j < 10) {
                System.out.println(i + " * " + j + " = " + (i*j));
                j++;
            }
        }
    }
}
