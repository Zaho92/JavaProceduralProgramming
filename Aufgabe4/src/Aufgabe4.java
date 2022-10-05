import java.util.InputMismatchException;
import java.util.Scanner;

public class Aufgabe4 {

    public static double getDoubleSave() {
        double ret = 0;
        System.out.println("Geben Sie bitte eine Dezimalzahl ein. (Dezimaltrenner ist ,)");
        boolean again;
        do {
            try {
                Scanner input = new Scanner(System.in);
                ret = input.nextDouble();
                again = false;
            } catch (InputMismatchException ex) {
                System.out.println("Das ist keine Dezimalzahl. Noch ein Versuch...");
                again = true;
            }
        } while (again);
        return ret;
    }

    public static void outputDecimalFormated(double number){
        System.out.println(number);
        System.out.printf("%(10.3f%n", number);
        System.out.printf("%1$11.0f%1$11.2f%1$11.4e%n", number);
        System.out.printf("%020f%n", number);
    }

    public static void main(String[] args) {
        double number = getDoubleSave();
        outputDecimalFormated(number);
    }
}