public class Aufgabe40 {
    public static void main(String[] args) {
        boolean[] sieb = new boolean[1001];
        for (int i = 2; i < sieb.length; i++) {
                sieb[i] = true;
        }
        for (int i = 2; i < sieb.length; i++) {
            if (sieb[i]){
                int multi = 2;
                int j = i*multi;
                while (j< sieb.length) {
                    sieb[j]=false;
                    multi++;
                    j = i * multi;
                }
            }
        }
        System.out.println("Primzahlen zwischen 0 und "+(sieb.length-1)+" sind:");
        for (int i = 0; i < sieb.length; i++) {
            if (sieb[i]){
                System.out.print(i+" ");
            }
        }
    }
}