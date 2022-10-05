import java.io.Console;
public class Aufgabe41 {
    public static void main(String[] args){
        String input = javax.swing.JOptionPane.showInputDialog("Geben Sie einen beliebigen Text ein.");
        String output = "";
        if (input.startsWith("E-")){
            System.out.println("ENTSCHLÜSSELT:");
            input = input.substring(2);
            int stellen = Integer.parseInt(input.substring(0,1));
            input = input.substring(1);
            int countSpace = 0;
            int[] spacePos = new int[countSpace];
            while (Character.isDigit(input.charAt(0))) {

                input = input.substring(stellen);
            }
        }else {
            System.out.println("VERSCHLÜSSELT:");
            output += "E-";
            int countSpace = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    countSpace++;
                }
            }
            int posIndex = 0;
            int[] spacePos = new int[countSpace];
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    spacePos[posIndex] = i;
                    posIndex++;
                }
            }
            int stellen = (spacePos.length > 999 ? 4 : (spacePos.length > 99 ? 3 : (spacePos.length > 9 ? 2 : 1)));
            output += stellen;
            String printfCode = "%0" + stellen + "d";
            output += String.format(printfCode, countSpace);
            for (int pos : spacePos) {
                output += String.format(printfCode, pos);
            }
            input = input.replace(" ", "");
            input = input.toUpperCase();
            StringBuilder sb = new StringBuilder();
            sb.append(input);
            output += sb.reverse().toString();
        }
        System.out.println(output);
    }
}
