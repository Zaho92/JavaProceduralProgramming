import java.util.Scanner;

public class Aufgabe26 {
    public static void main(String[] args) {
        int minPoints = 0;
        int maxPoints = 70;

        System.out.print("Geben Sie eine Ganzzahlige Punktzahl zwischen " + minPoints + " und " + maxPoints + " ein: ");
        Scanner scn = new Scanner(System.in);
        int points = scn.nextInt();

        if (points < minPoints || points > maxPoints) {
            System.out.println("Die Punktzahl muss zwischen " + minPoints + " und " + maxPoints + " liegen.");
        } else {
            String note = "";
            if (points <= 30) {
                note = "mangelhaft";
            } else if (points <= 40) {
                note = "ausreichend";
            } else if (points <= 50) {
                note = "befriedigend";
            } else if (points <= 60) {
                note = "gut";
            } else {
                note = "sehr gut";
            }
            System.out.println("Bei " + points + " Punkten ist das Ergebnis " + note);
        }
    }
}