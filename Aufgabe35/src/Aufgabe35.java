import java.util.Random;
import java.util.Scanner;

public class Aufgabe35 {
    public static void main(String[] args) {
        Random rand = new Random();
        int hoelzerLiegen = rand.nextInt(10) + 21;
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Es leigen noch " + hoelzerLiegen + " Hölzchen auf dem Tisch,\nwie viele willst du wegnehmen? (1, 2 oder 3)");
            int ichZiehe = scn.nextInt();
            hoelzerLiegen -= ichZiehe;
            System.out.print("\nDu nimmst " + ichZiehe + " Hölzchen weg. ");
            if (hoelzerLiegen > 0){
                System.out.println("Es liegen noch " + hoelzerLiegen + " auf dem Tisch.");
            }else{
                System.out.println("Damit hast Du auch das letzte Hölzchen aufgenommen. Leider VERLOREN!");
                break;
            }
            int pcZieht = pcZiehtHoelzer(hoelzerLiegen);
            hoelzerLiegen -= pcZieht;
            System.out.print("\nDer PC nimmt " + pcZieht + " Hölzchen weg. ");
            if (hoelzerLiegen > 0){
                System.out.println("Es liegen noch " + hoelzerLiegen + " auf dem Tisch.");
            }else{
                System.out.println("Damit hat der PC auch das letzte Hölzchen aufgenommen.\n\nDu hast GEWONNEN!");
                break;
            }
        } while (hoelzerLiegen > 0);
    }

    private static int pcZiehtHoelzer(int in_hoelzerLiegen){
        int ret = 3;
        Random rand = new Random();
        if (in_hoelzerLiegen>8 || in_hoelzerLiegen == 5){
            //hier ist egal also Random...
            ret = rand.nextInt(3)+1;
        }else if (in_hoelzerLiegen == 1) {
            //dann ist's verloren ...
            ret = 1;
        }else {
            //Logik...
            if (in_hoelzerLiegen <= 4) {
                ret = in_hoelzerLiegen - 1;
            } else {
                ret = in_hoelzerLiegen - 5;
            }
        }
        return ret;
    }
}
