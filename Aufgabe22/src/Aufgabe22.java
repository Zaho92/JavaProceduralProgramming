import java.util.Scanner;

public class Aufgabe22 {
    public static void main(String[] args) {
        System.out.println("Bestimmen Sie dei Größer der Dreiecke:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String formatString = "%" + size + "s%n";
        String stars = "";
        for (int i = 1; i <= size; i++) {
            stars += "*";
            System.out.println(stars);
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            stars = "";
            for (int j = 0; j < size - i; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            stars = "";
            for (int j = 0; j < size - i; j++) {
                stars += "*";
            }
            System.out.printf(formatString, stars);
        }
        System.out.println();
        stars = "";
        for (int i = 1; i <= size; i++) {
            stars += "*";
            System.out.printf(formatString, stars);
        }
    }
}