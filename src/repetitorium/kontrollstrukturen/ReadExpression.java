package repetitorium.kontrollstrukturen;

public class ReadExpression {
    public static void main(String[] args) throws Exception {

        System.out.println("Bitte Zeichen der Form [TF][|&^][TF] eingeben und mit <return> abschliessen!");

        int firstOperand = System.in.read();

        // Warum hier die Eingabe validieren?
        // Was passiert, wenn die Eingabe erst nach dem Einlesen der Zeichen validiert wird?
        if (firstOperand == '\r' || firstOperand == '\n') {
            // Warum ist hier die Eingabe zu kurz?
            System.out.println("Eingabe zu kurz!");
            return;
        }

        if (firstOperand != 'T' && firstOperand != 'F') {
            System.out.println("Erster Operand muss T oder F sein!");
            return;
        }


        int sign = System.in.read();

        if (sign == '\r' || sign == '\n') {
            System.out.println("Eingabe zu kurz!");
            return;
        }

        if (sign != '&' && sign != '|' && sign != '^') {
            System.out.println("Rechenzeichen muss |, & oder ^ sein!");
            return;
        }


        int secondOperand = System.in.read();

        if (secondOperand == '\r' || secondOperand == '\n') {
            System.out.println("Eingabe zu kurz!");
            return;
        }

        if (secondOperand != 'T' && secondOperand != 'F') {
            System.out.println("Zweiter Operand muss T oder F sein!");
            return;
        }

        int enter = System.in.read();
        // Warum ist in diesem Fall die Eingabe zu lang?
        if (enter != '\r' && enter != '\n') {
            System.out.println("Eingabe zu lang!");
            return;
        }

        boolean firstOperandIsTrue = firstOperand == 'T';
        boolean secondOperandIsTrue = secondOperand == 'T' ? true : false;

        switch(sign) {
            case '^':
                // Was stimmt hier nicht?
                System.out.println(firstOperand + " ^ " + secondOperand + " = " + (firstOperandIsTrue ^ secondOperandIsTrue));
                // ist break hier wirklich noetig?
                break;

            case '|':
                System.out.println(firstOperand + " | " + secondOperand + " = " + (firstOperandIsTrue | secondOperandIsTrue));
                break;

            default:
                System.out.println(firstOperand + " & " + secondOperand + " = " + (firstOperandIsTrue & secondOperandIsTrue));
                break;
        }
    }
}