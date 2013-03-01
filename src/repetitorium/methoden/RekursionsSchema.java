package repetitorium.methoden;











public class RekursionsSchema {

    public static void main(String[] args) {
        schema(5);
    }

    public static void schema(int nr) {
        if (nr < 0) return;

        schema(nr - 1);

        for (int i = 0; i< nr + 1; i++) {
            System.out.print(nr);
        }

        System.out.println();

        schema(nr - 1);
    }
}
