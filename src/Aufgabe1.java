import javax.swing.*;

public class Aufgabe1
{
    public static void main (String []args)
    {
        String name;
        name = JOptionPane.showInputDialog(null, "Bitte geben Sie Ihren Namen ein!");
        int alter;
        alter = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte gib mir dein Alter ein!"));

        if (alter>=18)
        {
            JOptionPane.showInputDialog(null, name+ " Du bist volljährig!");
        }
        else
            {
               JOptionPane.showMessageDialog(null, name+ " Du bist nicht volljährig!");

             }
    }
}
