public class Aufgabe17 {
    public static void main(String[] args) {
        String input = javax.swing.JOptionPane.showInputDialog("Geben Sie einen beliebigen Text ein.");
        input = input.replace(" ", "");
        input = input.toUpperCase();
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        input = sb.reverse().toString();
        System.out.println(input);
    }
}