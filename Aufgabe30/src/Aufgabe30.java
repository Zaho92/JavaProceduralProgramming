import java.awt.*;
import java.util.*;

public class Aufgabe30 {
    public static void main(String[] args) {
        System.out.print("Primzahlenprüfer\nWelche Zahl soll geprüft werden: ");
        int zahl = new Scanner(System.in).nextInt();
        boolean isPrim = true;
        for (int i = 2; i < zahl; i++) {
            if (zahl%i == 0){
                isPrim = false;
            }
        }
        System.out.println(zahl+" ist "+(isPrim?"":"k")+"eine Primzahl.");
    }
}