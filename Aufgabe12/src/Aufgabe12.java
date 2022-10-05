import java.util.Scanner;

public class Aufgabe12 {
    public static void main(String[] args) {
        System.out.println("Zu welcher Zahl soll die Fakultät ausgerechnet werden?");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int ret = 1;
        for (int i = 1; i <= input; i++) {
            ret = ret * i;
        }
        System.out.println(input + "! = " + ret);
    }
}