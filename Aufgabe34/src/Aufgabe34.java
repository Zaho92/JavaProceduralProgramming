import java.util.Random;
import java.util.Scanner;

public class Aufgabe34 {
    public static void main(String[] args) {
        System.out.println("Welche Variante soll gespielt werden?");
        System.out.println("1: 4 zufällige Zahlen für je 50€/Runde");
        System.out.println("2: 2 zufällige Kolonnen für je 100€/Runde");
        System.out.println("3: gerade oder ungerade für 200€/Runde");
        System.out.print("(1, 2 oder 3)");
        Scanner scn = new Scanner(System.in);
        int variante = scn.nextInt();

        Random rand = new Random();
        int[] numbers;
        if (variante == 1) {
            numbers = new int[4];
            numbers[0] = rand.nextInt(36) + 1;
            numbers[1] = rand.nextInt(36) + 1;
            numbers[2] = rand.nextInt(36) + 1;
            numbers[3] = rand.nextInt(36) + 1;
        } else if (variante == 2) {
            numbers = new int[24];
            int kolonne1 = rand.nextInt(3) + 1;
            int kolonne2 = kolonne1;
            while (kolonne2 == kolonne1) {
                kolonne2 = rand.nextInt(3) + 1;
            }
            int base = kolonne1;
            for (int i = 0; i <= 23; i++) {
                if (i == 12) {
                    base = kolonne2;
                }
                numbers[i] = base;
                base += 3;
            }

        } else {
            numbers = new int[18];
            int base = rand.nextInt(2) + 1;
            for (int i = 0; i < 17; i++) {
                numbers[i] = base;
                base += 2;
            }
        }
        System.out.print("Ihre Zahlen sind: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Das Spiel beginnt:");
        int gesetzt = 0;
        int gewonnen = 0;
        for (int runde = 1; runde <= 100; runde++) {
            System.out.println("Runde " + runde + ": ");
            System.out.println("Sie Setzen auf die " + numbers.length + " Zahlen ");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i]);
                System.out.print(" ");
            }
            System.out.println();
            if (variante == 1) {
                System.out.println("jeweils 50€");
            } else if (variante == 2) {
                System.out.println("als zwei Kolonnen je 100€");
            } else {
                System.out.println("als " + (numbers[0] == 1 ? "ungerade" : "gerade") + " Zahlen 200€");
            }
            gesetzt += 200;
            System.out.println("Gesammteinsatz bis jetzt " + gesetzt + "€");
            int kugel = rand.nextInt(37);
            System.out.println("Die Kulgel liegt auf " + kugel);
            boolean win = false;
            for (int i = 0; i < numbers.length; i++) {
                win = numbers[i] == kugel;
                if (win) {
                    break;
                }
            }
            if (win) {
                System.out.println("Gwonnen!!!");
                int gewinn = variante == 1 ? 1750 : variante == 2 ? 300 : 400;
                System.out.println("Du bekommst " + gewinn + " gutgeschrieben");
                gewonnen += gewinn;
            } else {
                System.out.println("Leider verloren...");
            }
            System.out.println("Gesammtgewinn bis jetzt " + (gewonnen - gesetzt) + "€");
        }
        System.out.println();
        System.out.println("Gesammtgewinn nach 100 Spielen " + (gewonnen - gesetzt) + "€");
    }


}
