import java.text.ParseException;

public class Uebung8 {
    public static void main(String[] args) throws MyFormatException, MyPasswordException {

        String Zahl = "57a";
        try {
            Integer.parseInt(Zahl);
            System.out.println("Zahl wurde umgewandelt");
        }
        catch (NumberFormatException parseEx){
            System.out.println("Zahl konnte nicht umgewandelt werden. Sie enhält ungültige Zeichen: "+Zahl);
        }

        int[] intArr = {1,2,3};
        int arrSize = -2;
        try {
            for (int i = 0; i < arrSize; i++) {
                System.out.println(intArr[i]);
            }
        }catch (IndexOutOfBoundsException indexEx){
            System.out.println("Ungültiger Index: "+ indexEx.getMessage());
        }

        Check check = new Check();
        check.doCheck(1251);
        //check.doCheck(532);

        if(check.login("test")){
            System.out.println("Password korrekt");
        }
        //if(check.login("")){
        //    System.out.println("Password korrekt");
        //}
    }
}
