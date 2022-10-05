import java.util.InputMismatchException;
import java.util.Scanner;

public class Aufgabe2 {

    public static int countDigits(int input) {
        int i = 1;
        while (true) {
            input = input / 10;
            if (input != 0) {
                i++;
            } else {
                break;
            }
        }
        return i;
    }

    public static int getIntSave() {
        return getIntSave(0);
    }

    public static int getIntSave(int digits) {
        int ret = 0;
        String printMessage = "Geben Sie bitte eine ";
        if (digits > 0) {
            printMessage += digits + "-stellige ";
        }
        printMessage += "Ganzzahl ein.";
        System.out.println(printMessage);
        boolean again = false;
        do {
            try {
                Scanner input = new Scanner(System.in);
                ret = input.nextInt();
                again = false;
            } catch (InputMismatchException ex) {
                System.out.println("Das ist keine Ganzzahl. Noch ein Versuch...");
                again = true;
                continue;
            }
            if (digits > 0 && countDigits(ret) != digits) {
                System.out.println("Diese Zahl ist nicht " + digits + "-stellig. Noch ein Versuch...");
                again = true;
            }
        } while (again);
        return ret;
    }

    private static int quersumme(int input) {
        int i = 0;
        while (true) {
            i += input % 10;
            input = input / 10;
            if (input != 0) {
                continue;
            } else {
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int inNum = getIntSave(4);
        System.out.println("Die Quersumme von " + inNum + " ist " + quersumme(inNum) + ".");

        // Aufgabenlösung in simpel
        System.out.print("Geben Sie eine 4 stellige Ganzzahl ein: ");
        Scanner input = new Scanner(System.in);
        int zahl = input.nextInt();
        int quersumme = zahl%10;
        zahl = zahl/10;
        quersumme += zahl%10;
        zahl = zahl/10;
        quersumme += zahl%10;
        zahl = zahl/10;
        quersumme+= zahl;
        System.out.println("Die Quersumme ist " + quersumme + ".");
    }
}
