public class Check {
    public Check(){
    }
    public void doCheck(int input) throws MyFormatException {
        if (input<1000){
            throw new MyFormatException();
        }
    }

    public boolean login (String input) throws MyPasswordException {
        if (input == ""){
            throw new MyPasswordException();
        }
        return true;
    }
}
