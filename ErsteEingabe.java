import static javax.swing.JOptionPane.*;

public class ErsteEingabe
{
  public static void main(String[] args)
  {
    String name = showInputDialog("Name eingeben");
    showMessageDialog(null, "Ich heiﬂe " + name + "\n\nIch bin froh, dass ich an der FOM studieren darf.", "Hallo", INFORMATION_MESSAGE);
  }
}
