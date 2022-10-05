import java.util.Random;

public class Aufgabe5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        byte sum = 0;
        for (byte i = 1; i <= 6; i++) {
            byte wurf = (byte) (1 + rnd.nextInt(6));
            sum += wurf;
            System.out.println(i + ". Wurf: " + wurf);
        }
        System.out.println("Gesammtergebnis: " + sum);
    }
}