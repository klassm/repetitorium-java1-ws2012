package repetitorium.arrays;

public class Wetterstation {
    public static void main(String[] args) {
        int[] temperatureValues = { 12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12 };

        int sum = 0;
        for (int i = 0; i < temperatureValues.length; i++) {
            int temperature = temperatureValues[i];
            sum += temperature;
        }
        System.out.println("Durchschnitt: " + sum / (float) temperatureValues.length);


        int min = 2147483647;
        int max = -2147483647;
        for (int i = 0; i < temperatureValues.length; i++) {
            int temperature = temperatureValues[i];

            if (temperature < min) {
                min = temperature;
            }

            if (temperature > max) {
                max = temperature;
            }
        }
        System.out.println("Min: " + min + ", Max: " + max);

        int maxDiff = 0;
        int maxDiffIndex = -1;
        for (int i = 0; i < temperatureValues.length; i++) {
            int temperature = temperatureValues[i];

            if (i == 0) continue;

            int lastDayTemperature = temperatureValues[i - 1];

            int diff = temperature - lastDayTemperature;
            if (diff < 0) diff *= -1;

            if (diff > maxDiff) {
                maxDiff = diff;
                maxDiffIndex = i;
            }
        }

        System.out.println("Größter Temperaturunterschied von Tag " + (maxDiffIndex) + " auf Tag " + (maxDiffIndex + 1) + " : " + maxDiff);


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
