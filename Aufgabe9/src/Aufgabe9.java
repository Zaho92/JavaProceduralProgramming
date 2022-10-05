import java.util.Random;

public class Aufgabe9 {
    public static void main(String[] args) {
        short[] randArray = new short[100];
        Random rand = new Random();
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = (short)(rand.nextInt(11) - 5);
        }
        short countNegativFives = 0;
        for (int i = 0; i < randArray.length; i++) {
            if (randArray[i] == -5) {
                countNegativFives++;
            }
        }
        System.out.println("In 100 generierten Zufallszahlen zwischen -5 und 5 kam " + countNegativFives + " mal die -5 vor.");
    }
}