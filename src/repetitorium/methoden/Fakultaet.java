package repetitorium.methoden;

public class Fakultaet {
    public static void main(String[] args) {
        System.out.println(fakultaet(5));
    }

    public static int fakultaet(int number) {
        if(number == 1) return 1;
        return number * fakultaet(number - 1);
    }
}
