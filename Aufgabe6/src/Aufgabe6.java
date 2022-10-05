import static javax.swing.JOptionPane.*;

public class Aufgabe6 {
    final static double Wechselkurs = 1.95583;

    public static void main(String[] args) {
        float euroBetrag = (float) (Math.round(Float.parseFloat(showInputDialog("Geben Sie einen €-Betrag ein")) * 100) / 100d);
        float dmBetrag = (float) (Math.round((euroBetrag * Wechselkurs) * 100) / 100d);
        showMessageDialog(null, euroBetrag + " € entsprechen " + dmBetrag + " DM");
    }
}