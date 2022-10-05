import java.util.Random;

public class Aufgabe37 {
    public static void main(String[] args) {
        int size = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Wie viele Zahlen soll das Array enthalten?"));
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(181) + 20;
        }
        System.out.print("Erzeugtes Array: ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //InsertionSort
        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;
            int temp = array[j];
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
        //SortEnd
        System.out.print("Sortiertes Array: ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Der Median ist " + array[(size / 2) - 1]);
    }
}
