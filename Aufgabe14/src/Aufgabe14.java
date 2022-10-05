import java.util.Random;

public class Aufgabe14 {
    public static void main(String[] args) {
        Random rand = new Random();
        int durchlauf = 0;
        short summe = 0;
        do {
            short firstRoll = (short) (rand.nextInt(6) + 1);
            short secondRoll = (short) (rand.nextInt(6) + 1);
            short thirdRoll = (short) (rand.nextInt(6) + 1);
            short fourthRoll = (short) (rand.nextInt(6) + 1);
            summe = (short) (firstRoll + secondRoll + thirdRoll + fourthRoll);
            System.out.printf("%1d%2d%2d%2d%4d%n", firstRoll, secondRoll, thirdRoll, fourthRoll, summe);
            durchlauf++;
        } while (summe < 20);
        System.out.println("------------------------");
        System.out.println("Versuche: " + durchlauf);
    }
}