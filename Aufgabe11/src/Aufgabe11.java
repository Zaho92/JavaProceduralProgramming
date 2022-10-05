import java.util.Scanner;

public class Aufgabe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie bitte die Anzahl der Reihen ein: ");
        int rows = scanner.nextInt();
        System.out.print("Geben Sie bitte die Anzahl der Spalten ein: ");
        int columns = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int x = 0;
        while (x < rows) {
            int y = 0;
            while (y < columns) {
                System.out.print("*");
                y++;
            }
            System.out.println();
            x++;
        }
    }
}