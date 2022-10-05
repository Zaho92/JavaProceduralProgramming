import java.util.*;

public class Aufgabe13 {
    public static void main(String[] args) {
        ArrayList<Integer> allInts = new ArrayList<Integer>();
        int input;
        do {
            System.out.print("Geben Sie eine Zahl der Zahlenreihe ein: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();
            if (input != 0) {
                allInts.add(input);
            }
        } while (input != 0);
        String message = "Es wurden " + allInts.size() + " Zahlen eingegeben\n";
        int sum = 0;
        for (int num : allInts) {
            sum += num;
        }
        message += "Die Summe der Zahlen beträgt " + sum + "\n";
        double med = (double)sum / (double)allInts.size();
        message += "Der Mittelwert beträgt " + med;
        javax.swing.JOptionPane.showMessageDialog(null, message);
    }
}