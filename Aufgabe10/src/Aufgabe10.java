import java.util.Scanner;

public class Aufgabe10 {
    public static void main(String[] args) {
        System.out.print("Geben Sie bitte eine Zahl ein: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.print("*");
        }
        System.out.println();
        int counter = 0;
        while (counter < input) {
            System.out.print("*");
            counter++;
        }
    }
}