import java.util.Random;

public class Aufgabe33 {
    public static void main(String[] args) {

        Random rand = new Random();
        System.out.println("Seven-Eleven-Test");
        System.out.println("-----------------");
        double won = 0;
        double lost = 0;
        for (int i = 1; i <= 1000000; i++) {
            System.out.print("Versuch " + i + ": ");
            boolean again = false;
            boolean win = false;
            do {
                again=false;
                int w1 = rand.nextInt(6) + 1;
                int w2 = rand.nextInt(6) + 1;
                int sum = w1 + w2;
                if (sum == 7 || sum == 11) {
                    win = true;
                } else if (sum == 2 || sum == 3 || sum == 12) {
                    win = false;
                } else {
                    again = true;
                }
            } while (again);
            if (win) {
                won ++;
                System.out.print("Gewonnen");
            } else {
                lost++;
                System.out.print("Verlohren");
            }
            System.out.println(" | Gewinnchance " + (won/i)*100 + "%");
        }

        System.out.println("-----------------");
        System.out.println("Ergebnis: "+won+" mal gewonnen");
        System.out.println("und "+lost+" mal verlohren");
   }
}
