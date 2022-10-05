import java.util.Locale;
import java.util.Random;

public class Aufgabe38 {
    public static void main(String[] args) {
        int[] noten = new int[100];
        int[] notenSpiegel = new int[5];
        double sumNoten = 0;
        Random rand = new Random();
        for (int i = 0; i < noten.length; i++) {
            noten[i] = rand.nextInt(5) + 1;
            notenSpiegel[noten[i] - 1]++;
            sumNoten += noten[i];
        }
        System.out.printf(Locale.GERMAN, "Notenschnitt: %1.1f%n", sumNoten / noten.length);
        for (int i = 0; i < notenSpiegel.length; i++) {
            String bar = "";
            for (int j = 0; j < notenSpiegel[i]; j++) {
                bar += "*";
            }
            System.out.printf("Note %s: %s%n", i + 1, bar);
        }
    }
}
