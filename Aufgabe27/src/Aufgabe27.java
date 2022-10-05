import java.util.Scanner;

public class Aufgabe27 {
    public static void main(String[] args) {
        System.out.print("Geben Sie die Kantenlänge des Rechtecks (in *) an: ");
        int len = (new Scanner(System.in).nextInt());
        boolean innen = false;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                String print = "*";
                if (i!=0 && i !=len-1 && j != 0 && j!=len-1){
                    print = " ";
                }
                System.out.print(print);
            }
            System.out.println();
        }
    }
}