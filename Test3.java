import static javax.swing.JOptionPane.*;

public class Test3
{
  public static void main(String[] args)
  {
    String name = showInputDialog("Name eingeben:");
    showMessageDialog(null, name+"\n\nIch bin froh, dass ich an der FOM studieren darf.", "Hallo", INFORMATION_MESSAGE);
  }
}
