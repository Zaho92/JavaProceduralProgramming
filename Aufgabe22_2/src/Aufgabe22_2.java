import java.util.Scanner;

public class Aufgabe22_2 {
    public static void main(String[] args) {
        System.out.println("Bestimmen Sie die Größer der Dreiecke:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String formatString = "%-" + size + "s %-" + size + "s %" + size + "s %" + size + "s%n";
        for (int i = 0; i < size; i++) {
            String outerStars = "";
            String innerStars = "";
            for (int j = 0; j < size - i; j++) {
                innerStars += "*";
            }
            for (int j = 0; j <= size - (size - i); j++) {
                outerStars += "*";
            }
            System.out.printf(formatString, outerStars, innerStars, innerStars, outerStars);
        }
    }
}