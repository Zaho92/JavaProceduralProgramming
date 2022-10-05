public class FormatierteAusgabe {
    public static void main(String[] args) {
        final double pi = 3.14159265359;
        System.out.printf("Ausgabe: %.3f%n", pi);
        System.out.printf("Ausgabe: %.8f%n", pi);
        System.out.printf("Ausgabe: %e%n", pi * 1000000);
        System.out.printf("Ausgabe: %10.0f%n", pi);
        System.out.printf("Das Doppelte von %1$.1f ist %2$.1f", 3.33, 3.33 * 2);
    }
}