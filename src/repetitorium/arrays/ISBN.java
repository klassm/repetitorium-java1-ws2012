package repetitorium.arrays;

public class ISBN {
    public static void main(String[] args) {
        final int[] isbnNumber = {4,3,6,9,6,5,1,3,2};

        int pruefNumber = 0;
        for(int i = 0; i < isbnNumber.length; i++) {
            pruefNumber += isbnNumber[i]*(i+1);
        }
        pruefNumber = pruefNumber % 11;

        System.out.println("Pruefzahl: " + pruefNumber);
    }
}
