import java.util.Locale;

public class Aufgabe39 {
    public static void main(String[] args){
        String inputWord = javax.swing.JOptionPane.showInputDialog("Geben Sie ein zu prüfendes Wort ein.");
        inputWord =inputWord.replace(" ","");
        inputWord =inputWord.replace(",","");
        inputWord =inputWord.replace(";","");
        inputWord =inputWord.replace(".","");
        inputWord =inputWord.replace(":","");
        inputWord =inputWord.replace("-","");
        inputWord =inputWord.replace("_","");
        inputWord =inputWord.replace("?","");
        inputWord =inputWord.replace("!","");
        inputWord =inputWord.replace("\"","");
        inputWord =inputWord.replace("/","");
        inputWord =inputWord.replace("\\","");
        char[] buchstaben = inputWord.toUpperCase().toCharArray();
        boolean isPalindrom = true;
        for (int i = 0; i < buchstaben.length/2; i++) {
            if (buchstaben[i]!=buchstaben[buchstaben.length-1-i]){
                isPalindrom=false;
                break;
            }
        }
        javax.swing.JOptionPane.showMessageDialog(null,inputWord+" ist "+(isPalindrom?"":"k")+"ein Palindrom.");
    }
}
