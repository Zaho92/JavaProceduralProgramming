import java.util.Locale;
import java.util.Random;

public class Aufgabe36 {
    public static void main(String[] args){
        int durchlaeufe = 1000000;
        double wechlerWin = 0;
        double bleiberWin = 0;
        Random rand = new Random();

        for (int i = 1; i <= durchlaeufe ; i++) {
            System.out.printf(Locale.GERMAN, "Versuch %15s%n", (i + "/" + durchlaeufe));
            int gewinnTor = rand.nextInt(3) + 1;
            int spielerTor = rand.nextInt(3) + 1;
            int morderatorTor = 0;
            do {
                morderatorTor = rand.nextInt(3) + 1;
            } while (morderatorTor == gewinnTor || morderatorTor == spielerTor);
            int wechslerTor = 0;
            do {
                wechslerTor = rand.nextInt(3) + 1;
            } while (wechslerTor == morderatorTor || wechslerTor == spielerTor);
            if (spielerTor == gewinnTor) {
                bleiberWin++;
            } else if (wechslerTor == gewinnTor) {
                wechlerWin++;
            } else return;
        }

        System.out.println("Gewinnchance \"Bleiber\": "+((bleiberWin/durchlaeufe)*100)+"%");
        System.out.println("Gewinnchance \"Wechsler\": "+((wechlerWin/durchlaeufe)*100)+"%");
    }
}
