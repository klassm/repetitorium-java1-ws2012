package repetitorium.ausdruecke;

public class FloatOperatoren {

    public static void main(String[] args) {

        float a = 100.0f;
        float b = 0.1f;
        float c = 1.0e10f;

        float y1 = (a * c + b) - a * c;
        float y2 = a * c - a * c + b;

        System.out.println(y1 + " =?= " + y2);

    }

}
