import java.util.Scanner;

public class Aufgabe28 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Welche Dezimalzahl soll umgerechnet werden: ");
        int inZahl = scn.nextInt();
        System.out.print("In welches Zahlen-System soll umgerechnet werden (2-16): ");
        int inSystem = scn.nextInt();

        if (inSystem < 2 || inSystem > 16) {
            System.out.println("Das eingegebene Zahlensystem liegt nicht zwischen 2 und 16.");
        } else {
            int rest = 0;
            int wert = inZahl;
            StringBuilder result = new StringBuilder();
            do {
                rest = wert % inSystem;
                wert = wert / inSystem;
                if (rest < 10) {
                    result.append(rest);
                } else {
                    switch (rest) {
                        case 10 -> result.append("A");
                        case 11 -> result.append("B");
                        case 12 -> result.append("C");
                        case 13 -> result.append("D");
                        case 14 -> result.append("E");
                        case 15 -> result.append("F");
                    }
                }
            } while (wert != 0);
            result.reverse();
            System.out.println("Die Zahl " + inZahl + " (10) entspricht " + result + " (" + inSystem + ")");
        }
    }
}