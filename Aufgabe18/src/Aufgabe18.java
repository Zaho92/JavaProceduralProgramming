public class Aufgabe18 {
    public static void main(String[] args) {
        for (int i = -1; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (i == -1) {
                    if (j==0){
                        System.out.printf("%5s", "");
                    }else{
                        System.out.printf("%6d", j);
                    }
                } else if (i == 0) {
                    System.out.print("------");
                } else if (j == 0) {
                    System.out.printf("%3d |", i);
                } else {
                    System.out.printf("%6d", i * j);
                }
            }
            System.out.println();
        }
    }
}