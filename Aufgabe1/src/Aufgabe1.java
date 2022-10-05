import static javax.swing.JOptionPane.*;

public class Aufgabe1 {
    public static int getNumber(String numberName) {
        boolean again = false;
        int ret = 0;
        do {
            try {
                again = false;
                ret = Integer.parseInt(showInputDialog("Geben Sie die Seitenlänge \"" + numberName + "\" an"));
            } catch (NumberFormatException ex) {
                again = true;
                showMessageDialog(null, "Das scheint keine Zahl gewesen zu sein\n\nNoch ein Versuch", "Fehler", ERROR_MESSAGE);
            }
        } while (again);
        return ret;
    }

    public static void main(String[] args) {
        int a = getNumber("Länge");
        int b = getNumber("Breite");
        int c = getNumber("Höhe");
        int oberflaeche = 2 * a * b + 2 * a * c + 2 * b * c;
        int volumen = a * b * c;
        System.out.println("Ein Qarder mit der Länge " + a + " cm, der Breite " + b + " cm und der Höhe " + c + " cm\n"
                + "besitzt eine Oberfläche von " + oberflaeche + "cm² und ein Volumen von " + volumen + "cm³.");
    }

}