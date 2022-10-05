import java.util.Scanner;

public class Aufgabe20 {
    public static void main(String[] args) {
        System.out.println("Welche Fibonacci-Zahl soll ermittelt werden?");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input < 0) {
            System.out.println("Die Zahl sollte größer gleich 0 sein.");
        } else {
            if (input == 0) {
                System.out.println("fib(0) = 0");
            } else if (input == 1) {
                System.out.println("fib(1) = 1");
            } else {
                long result = 0;
                long nMinus1 = 1;
                long nMinus2 = 0;
                long nMinus3 = 0;
                for (int i = 2; i <= input; i++) {
                    result = nMinus1 + nMinus2;
                    nMinus3 = nMinus2;
                    nMinus2 = nMinus1;
                    nMinus1 = result;
                }
                System.out.println("fib(" + input + ") = fib(" + (input - 2) + ") + fib(" + (input - 1) + ") = " + nMinus3 + " + " + nMinus2 + " = " + result);
            }
        }
    }
}