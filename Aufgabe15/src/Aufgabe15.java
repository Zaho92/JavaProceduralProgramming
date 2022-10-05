import java.util.Random;

public class Aufgabe15 {
    public static void main(String[] args) {
        Random rand = new Random();
        int durchlauf = 0;
        short summe = 0;
        short product = 0;
        do {
            short firstRoll = (short) (rand.nextInt(6) + 1);
            short secondRoll = (short) (rand.nextInt(6) + 1);
            short thirdRoll = (short) (rand.nextInt(6) + 1);
            short fourthRoll = (short) (rand.nextInt(6) + 1);
            short fifthRoll = (short) (rand.nextInt(6) + 1);
            short sixthRoll = (short) (rand.nextInt(6) + 1);
            summe = (short) (firstRoll + secondRoll + thirdRoll + fourthRoll + fifthRoll + sixthRoll);
            product = (short) (firstRoll * secondRoll * thirdRoll * fourthRoll * fifthRoll * sixthRoll);
            System.out.printf("%1d%2d%2d%2d%2d%2d%4d%5d%n", firstRoll, secondRoll, thirdRoll, fourthRoll, fifthRoll, sixthRoll, summe, product);
            durchlauf++;
        } while (!(summe == 22 && product == 540));
        System.out.println("------------------------");
        System.out.println("Versuche: " + durchlauf);
    }
}