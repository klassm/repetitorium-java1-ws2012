package repetitorium.methoden;

public class WetterstationMethoden {
    public static void main(String[] args) {
        int[] temperatureValues = { 12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12 };

        swapItems(temperatureValues, 6, 8);

        float average = averageTemperatures(temperatureValues);
        System.out.println("Durchschnitt: " + average);

        int min = findMinimalTemperature(temperatureValues);
        int max = findMaximumTemperature(temperatureValues);
        System.out.println("Min: " + min + ", Max: " + max);

        int maxDiff = findMaximumDifference(temperatureValues);
        System.out.println("Größter Temperaturunterschied betraegt: " + maxDiff);

        printTable(temperatureValues);
    }

    private static int findMaximumDifference(int[] temperatureValues) {
        int maxDiff = 0;
        for (int i = 0; i < temperatureValues.length; i++) {
            int temperature = temperatureValues[i];

            if (i == 0) continue;

            int lastDayTemperature = temperatureValues[i - 1];

            int diff = temperature - lastDayTemperature;
            if (diff < 0) diff *= -1;

            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        return maxDiff;
    }

    private static int findMaximumTemperature(int[] temperatureValues) {
        int max = -2147483647;
        for (int i = 0; i < temperatureValues.length; i++) {
            int temperature = temperatureValues[i];

            if (temperature > max) {
                max = temperature;
            }
        }
        return max;
    }

    private static int findMinimalTemperature(int[] temperatureValues) {
        int min = 2147483647;
        for (int i = 0; i < temperatureValues.length; i++) {
            int temperature = temperatureValues[i];

            if (temperature < min) {
                min = temperature;
            }
        }
        return min;
    }

    public static float averageTemperatures(int[] temperatureValues) {
        int sum = 0;
        for (int i = 0; i < temperatureValues.length; i++) {
            int temperature = temperatureValues[i];
            sum += temperature;
        }
        return sum / (float) temperatureValues.length;
    }

    public static void swapItems(int[] temperatureValues, int firstIndex, int secondIndex) {
        int temp = temperatureValues[firstIndex];
        temperatureValues[firstIndex] = temperatureValues[secondIndex];
        temperatureValues[secondIndex] = temp;
    }

    private static void printTable(int[] temperatureValues) {
        System.out.println("Werte:");

        // oberste "-" Zeile
        for (int i = 0; i < temperatureValues.length; i++) {
            System.out.print("-----");
        }
        System.out.println("-");

        // Tage
        System.out.print("|");
        for (int i = 0; i < temperatureValues.length; i++) {
            System.out.print(" ");
            if (i < 10) {
                System.out.print(" ");
            }
            System.out.print(i + " |");
        }

        // Trenner
        System.out.println();
        for (int i = 0; i < temperatureValues.length; i++) {
            System.out.print("-----");
        }
        System.out.println("-");

        // Werte
        System.out.print("|");
        for (int i = 0; i < temperatureValues.length; i++) {
            int temperatureValue = temperatureValues[i];

            System.out.print(" ");
            if (temperatureValue < 10) {
                System.out.print(" ");
            }
            System.out.print(temperatureValue + " |");
        }

        System.out.println();

        // untere Abgrenzung
        for (int i = 0; i < temperatureValues.length; i++) {
            System.out.print("-----");
        }
        System.out.println("-");
    }
}
