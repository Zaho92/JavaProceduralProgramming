import java.util.Scanner;

public class Aufgabe8 {

    public static void main(String[] args) {
        String land = getLand();
        String ktoNr = getKontonummer();
        String blz = getBankleitzahl();
        System.out.println("Aus den Angaben");
        System.out.println("Land: " + land);
        System.out.println("Kontonummer: " + ktoNr);
        System.out.println("unf Bankleitzahl: " + blz);
        System.out.println("wurde die IBAN \"" + getIban(land, ktoNr, blz) + "\" errechnet.");
    }

    private static String getLand() {
        System.out.print("Geben Sie bitte ihr Land als Ländercode ein (bsp. \"DE\"): ");
        String input;
        boolean again;
        do {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            if (input.length() == 2) {
                again = false;
                input = input.toUpperCase();
            } else {
                System.out.print("Die Eingabe scheint inkorrekt, noch einmal: ");
                again = true;
            }
        } while (again);
        return input;
    }

    private static String getKontonummer() {
        System.out.print("Geben Sie bitte ihre Kontonummer ein: ");
        String input;
        boolean again;
        do {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            if (isLong(input)) {
                again = false;
                input = padLeft(input, 10, '0');
            } else {
                System.out.print("Die Eingabe scheint inkorrekt, noch einmal: ");
                again = true;
            }
        } while (again);
        return input;
    }

    private static String getBankleitzahl() {
        System.out.print("Geben Sie bitte ihre Bankleitzahl ein: ");
        String input;
        boolean again;
        do {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            if (isLong(input) && input.length() == 8) {
                again = false;
            } else {
                System.out.print("Die Eingabe scheint inkorrekt, noch einmal: ");
                again = true;
            }
        } while (again);
        return input;
    }

    private static boolean isLong(String input) {
        boolean isLong = true;
        try {
            Long.parseLong(input);
        } catch (NumberFormatException e) {
            isLong = false;
        }
        return isLong;
    }

    private static String padLeft(int input, int desiredSize, char padChar) {
        return padLeft(Integer.toString(input), desiredSize, padChar);
    }

    private static String padLeft(String input, int desiredSize, char padChar) {
        int inLength = input.length();
        if (inLength < desiredSize) {
            StringBuilder inputBuilder = new StringBuilder(input);
            for (int i = 0; i < desiredSize - inLength; i++) {
                inputBuilder.insert(0, padChar);
            }
            input = inputBuilder.toString();
        }
        return input;
    }

    private static String getIban(String land, String ktoNr, String blz) {
        String zwischenwert = getZwischenwert(land, ktoNr, blz);
        int firstNine = Integer.parseInt(zwischenwert.substring(0, 9));
        int modFirst = firstNine % 97;
        int secondNine = Integer.parseInt(padLeft(modFirst, 2, '0') + zwischenwert.substring(9, 16));
        int modSecond = secondNine % 97;
        int thirdNine = Integer.parseInt(padLeft(modSecond, 2, '0') + zwischenwert.substring(16, 23));
        int modThird = thirdNine % 97;
        int lastThree = Integer.parseInt(padLeft(modThird, 2, '0') + zwischenwert.charAt(23));
        int modLast = lastThree % 97;
        int pruefsumme = 98 - modLast;
        return land + pruefsumme + ktoNr + blz;
    }

    private static String getZwischenwert(String land, String ktoNr, String blz) {
        String combinedNumberString = blz;
        combinedNumberString += ktoNr;
        combinedNumberString += getNumericLandCode(land);
        combinedNumberString += "00";
        return combinedNumberString;
    }

    private static String getNumericLandCode(String land){
        String first = Integer.toString(Character.getNumericValue(land.charAt(0)));
        String second = Integer.toString(Character.getNumericValue(land.charAt(1)));
        return first + second;
    }
}
