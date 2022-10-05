import java.util.Scanner;

public class Aufgabe23 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        int zahl = scn.nextInt();
        int absZahl = zahl;
        if (zahl < 0) {
            absZahl = zahl * -1;
        }
        System.out.println("|" + zahl + "| = " + absZahl);
        absZahl = 0;
        System.out.println("|" + zahl + "| = " + (zahl < 0 ? (absZahl = zahl * -1) : (absZahl = zahl)));
        ;
    }
}