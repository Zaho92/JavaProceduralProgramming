import java.util.Scanner;

public class Aufgabe32 {
    public static void main(String[] args) {
        int versuche = 0;
        int low = 1;
        int high = 100000;
        boolean hit = false;
        int middle = 0;
        while (!hit){
            versuche++;
            middle = low + (high-low)/2;
            System.out.print("Ist die gesuchte Zahl "+middle+"? (h - höher/t - treffer/n - niedriger)");
            String in = new Scanner(System.in).next();
            if (in.equals("h")){
                low = middle+1;
            }else if( in.equals("n")){
                high = middle-1;
            }else{
                hit = true;
            }
        }
        System.out.println("Wusste ich es doch die Zahl ist "+middle+". Und nur "+versuche+" Versuche gebraucht :)");
    }
}