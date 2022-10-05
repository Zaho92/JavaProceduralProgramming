import java.util.InputMismatchException;
import java.util.Scanner;

public class Aufgabe3 {

    public static double getDoubleSave() {
        double ret = 0;
        System.out.println("Geben Sie bitte eine Dezimalzahl ein. (Dezimaltrenner ist ,)");
        boolean again = false;
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

    public static void main(String[] args) {
        System.out.println("Zahl 1:");
        double a = getDoubleSave();
        System.out.println("Zahl 2:");
        double b = getDoubleSave();
        double produkt = a * b;
        System.out.print("Das Produkt aus " + a + " * " + b + " ist ca. ");
        System.out.printf("%,.2f", produkt);
    }
}