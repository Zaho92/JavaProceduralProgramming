public class Aufgabe31 {
    public static void main(String[] args) {
        String input = javax.swing.JOptionPane.showInputDialog("Geben Sie einen Satz ein.");
        input = input.replace('.', ' ');
        input = input.replace(',', ' ');
        input = input.replace('!', ' ');
        input = input.replace('?', ' ');
        input = input.replace('"', ' ');
        input = input.replace('=', ' ');
        input = input.replace(':', ' ');
        input = input.replace(';', ' ');
        input = input.replace(')', ' ');
        input = input.replace('(', ' ');
        input = input.replace('/', ' ');
        input = input.replace('&', ' ');
        while (input.contains("  ")) {
            input = input.replace("  ", " ");
        }
        input = input.trim();
        input += " ";
        int maxLen = 0;
        String ret = "";
        String newInput = input;
        while (newInput.contains(" ")) {
            int endIndex = newInput.indexOf(' ');
            int wordLen = endIndex - 0;
            String word = newInput.substring(0, endIndex);
            if (maxLen < wordLen) {
                ret = word;
                maxLen = wordLen;
            } else if (maxLen == wordLen) {
                ret += (ret.length() > 0 ? ", " : "") + word;
            }
            newInput = newInput.substring(endIndex + 1);
        }
        System.out.println((ret.contains(",") ? "Längste Wörter" : "Längstes Wort") + ": " + ret + " |  Länge: " + maxLen);
    }
}