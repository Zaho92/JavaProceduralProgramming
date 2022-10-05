import java.util.Scanner;

public class Aufgabe21 {
    public static void main(String[] args) {
        System.out.println("Geben Sie zwei Zahlen ein um den GGT zu finden");
        Scanner scanner = new Scanner(System.in);
        int inputA = scanner.nextInt();
        int inputB = scanner.nextInt();
        int ggt = getGGT(inputA, inputB);
        System.out.println("Der GGT von " + inputA + " und " + inputB + " ist " + ggt);
    }

    private static int getGGT(int inputA, int inputB) {
        int lower;
        int higher;
        int rest = 1;
        if (inputA >= inputB) {
            higher = inputA;
            lower = inputB;
        } else {
            higher = inputB;
            lower = inputA;
        }
        while (rest != 0) {
            rest = higher % lower;
            higher = lower;
            lower = rest;
        }
        return higher;
    }
}