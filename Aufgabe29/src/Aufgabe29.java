import java.util.Scanner;

public class Aufgabe29 {
    public static void main(String[] args) {
        System.out.print("Geben Sie einen Monat als Zahl ein: ");
        Scanner scn = new Scanner(System.in);
        int monat = scn.nextInt();
        int tage = 0;
        if (monat == 2) {
            tage = 28;
            //Erweiterung
            System.out.print("Geben Sie bitte das Jahr ein (YYYY): ");
            int jahr = scn.nextInt();
            if (jahr%4 == 0){
                tage = 29;
                if (jahr%100 == 0){
                    tage = 28;
                    if (jahr%400 == 0){
                        tage = 29;
                    }
                }
            }
        } else if ((monat % 2 == 1 && monat <= 7) || (monat % 2 == 0 && monat > 7)) {
            tage = 31;
        } else {
            tage = 30;
        }
        System.out.println("Der Monat hat " + tage + " Tage.");
    }
}