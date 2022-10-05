import java.util.Random;

public class Aufgabe25 {
    public static void main(String[] args) {
        Random rand = new Random();
        int wuerfe = 100000;
        System.out.println("Würfele "+wuerfe+" mal...");
        int oneCount =0;
        int twoCount = 0;
        int threeCount =0;
        int fourCount =0;
        int fiveCount =0;
        int sixCount =0;
        for (int i = 0; i < wuerfe; i++) {
            int wurf = rand.nextInt(6)+1;
            switch(wurf){
                case 1:
                    oneCount++;
                    break;
                case 2:
                    twoCount++;
                    break;
                case 3:
                    threeCount++;
                    break;
                case 4:
                    fourCount++;
                    break;
                case 5:
                    fiveCount++;
                    break;
                case 6:
                    sixCount++;
                    break;
            }
        }
        System.out.println("Ergebnis: ");
        System.out.println("Einser: "+oneCount+"  "+oneCount/1000f+"%");
        System.out.println("Zweier: "+twoCount+"  "+twoCount/1000f+"%");
        System.out.println("Dreier: "+threeCount+"  "+threeCount/1000f+"%");
        System.out.println("Vierer: "+fourCount+"  "+fourCount/1000f+"%");
        System.out.println("Fünfer: "+fiveCount+"  "+fiveCount/1000f+"%");
        System.out.println("Sechser: "+sixCount+"  "+sixCount/1000f+"%");
    }
}