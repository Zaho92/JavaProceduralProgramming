public class Kreis {
    final static double PI = 3.14159265359;

    public static void main(String[] args) {
        double radius = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Geben Sie bitte den Radius in cm ein."));
        double umfang = 2 * PI * radius;
        double flaeche = PI * Math.pow(radius, 2);
        System.out.printf("Bei einem Radius von %.2f cm%nbeträgt der Umfang des Kerises %.2f cm%nund die Fläche %.2f cm²", radius, umfang, flaeche);
    }
}