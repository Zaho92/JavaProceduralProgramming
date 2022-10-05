public class Aufgabe7 {
    public static void main(String[] args) {
        String input = javax.swing.JOptionPane.showInputDialog("Geben Sie bitte einen Text/Wort ein.");
        System.out.printf("%-51s%s%n", "Eingegebener Text:", input);
        System.out.printf("%-51s%S%n", "Nur in Großbuchstaben:", input);
        System.out.printf("%-51s%s%n", "Nur in Kleinbuchstaben:", input.toLowerCase());
        System.out.printf("%-51s%s%n", "Die ersten 10 Zeichen:", input.substring(0, input.length() > 9 ? 10 : input.length()));
        System.out.printf("%-55s%s%n", "Vom Zeichen 5 bis zum Zeichen 10 (einschließlich):", (input.length() > 4 ? (input.substring(4, input.length() > 9 ? 10 : input.length())) : "Text ist keine 5 Zeichen lang"));
        System.out.printf("%-60s%s%n", "Alle Zeichen ab dem 10. Zeichen (einschließlich):", (input.length() > 9 ? (input.substring(9)) : "Text ist keine 10 Zeichen lang"));
        System.out.printf("%-51s%s%n", "Die Länge des gesamten Textes:", input.length());
        String search = javax.swing.JOptionPane.showInputDialog("Geben Sie bitte einen zu suchenden Text ein.");
        System.out.printf("%-51s%s%n","Suchtext ist im ursprünglichen Text enthalten:" , (input.contains(search) ? "Ja" : "Nein"));
    }
}