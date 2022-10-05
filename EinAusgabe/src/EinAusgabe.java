import static javax.swing.JOptionPane.*;

public class EinAusgabe {
    public static void main(String[] args) {
        double eingabe = Double.parseDouble(showInputDialog("Geben Sie bitte eine Gleitkomma Zahl ein."));
        double ausgabe = eingabe * 2f;
        System.out.println("Das Doppelte von " + eingabe +" ist " + ausgabe);
    }
}