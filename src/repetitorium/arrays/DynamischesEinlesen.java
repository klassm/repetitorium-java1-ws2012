package repetitorium.arrays;


public class DynamischesEinlesen {
    public static void main(String[] args) throws Exception {
        int[]values = new int[2];

        int current = 0;
        while(true) {
            int readChar = System.in.read();
            if (readChar == '\r' || readChar == '\n') {
                break;
            }

            if (current == values.length - 1) {
                int[] newValues = new int[current + 2];
                for (int i = 0; i < values.length; i++) {
                    newValues[i] = values[i];
                }
                values = newValues;
            }
            values[current++] = readChar;
        }

        for (int i = 0; i < current; i++) {
            int value = values[i];
            System.out.print((char) value);
        }
        System.out.println();
    }
}
