package repetitorium.arrays;

public class PatternFinden {
    public static void main(String[] args) {
        char[] inChar = { 'a', 'b', 'c', 'c', 'd', 'e'};
        char[] findMe = {'c', 'd'};

        int findMeIndex = 0;
        int foundIndex = -1;
        for (int i = 0; i < inChar.length; i++) {
            char c = inChar[i];
            if (findMe[findMeIndex] == c) {
                findMeIndex++;
            } else if (findMe[0] == c) {
                findMeIndex = 1;
            } else {
                findMeIndex = 0;
            }

            if (findMeIndex == findMe.length) {
                foundIndex = i - findMe.length  + 1;
                break;
            }
        }

        if (foundIndex == -1) {
            System.out.println("nicht gefunden");
        } else {
            System.out.println("gefunden an Stelle " + foundIndex);
        }

    }
}
