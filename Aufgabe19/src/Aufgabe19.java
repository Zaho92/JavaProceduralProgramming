public class Aufgabe19 {
    public static void main(String[] args) {
        for (int c = 1; c <= 8; c++) {
            for (int r = c; r <= 7+c; r++) {
                    System.out.printf("%6d", r);
            }
            System.out.println();
        }
    }
}