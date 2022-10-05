import java.util.Scanner;

public class Aufgabe24 {
    public static void main(String[] args) {
        System.out.println("Geben Sie zwei Zahlen ein.");
        Scanner scn = new Scanner(System.in);
        System.out.print("Zahl 1: ");
        int z1 = scn.nextInt();
        System.out.print("Zahl 2: ");
        int z2 = scn.nextInt();

        if (z1 > z2) {
            System.out.println(z1 + " ist größer als " + z2);
        } else if (z1 < z2) {
            System.out.println(z2 + " ist größer als " + z1);
        } else {
            System.out.println(z1 + " und " + z2 + " sind gleich groß");
        }

        System.out.println(z1 == z2 ? (z1 + " und " + z2 + " sind gleich groß") : ((z1 > z2 ? z1 : z2) + " ist größer als " + (z1 > z2 ? z2 : z1)));
    }
}