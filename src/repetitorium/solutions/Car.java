package repetitorium.solutions;





public class Car {

    private static final int NUMBER_OF_TIRES = 4;

    public void printNumberOfTires() {
        System.out.println(NUMBER_OF_TIRES);
    }

    public static void main(String[] args) {
        Car car = new Car();
        int num = Car.NUMBER_OF_TIRES;
        System.out.println(car);

        car.printNumberOfTires();
    }
}

class ABC {
    public static void main(String[] args) {

        Colour red = Colour.RED;
        switch(red) {
            case RED:
                break;
            case BLUE:
                break;
        }

        Colour[] values = Colour.values();
        for (int i = 0; i < values.length; i++) {
            Colour value = values[i];
            System.out.println(value);
        }

        String a  = "abc";
        String b = "ab";
        b += "c";

        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println("abc" + "def" + 1 + 2);
        System.out.println("abc" + "def" + (1 + 2));
    }
}
