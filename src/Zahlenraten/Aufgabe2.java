package Zahlenraten;

import javax.swing.*;
import java.util.Random;

public class Aufgabe2
{

    public static void main (String []args) {
        int min = 1;
        int max = 10;

        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max - min + 1) + min;
        // System.out.println(zufallszahl);
        /* mit dem Code wird angegeben von welcher Zahl aus der Rechner starten muss und mit welcher Zahl er enden muss
            mit dem rnd.nextInt wird gesagt, dass er es per Zufallsgenerator erledigen soll */

        /* if ((zufallszahl % 2) == 0) {
            JOptionPane.showInputDialog(null, zufallszahl + " ist gerade!");
        } else {
            JOptionPane.showInputDialog(null, zufallszahl + "ist nicht gerade!");
        }*/
        String rueckgabe;
        rueckgabe = JOptionPane.showInputDialog(null, "Gib mir eine Ganzzahl, die zwischen 1 und 10 liegt!");

        if (Integer.parseInt(rueckgabe) == zufallszahl)
        {
            JOptionPane.showMessageDialog(null, "Deine Zahl ist gleich!");
        }

        else if ((Integer.parseInt(rueckgabe)-zufallszahl) >= -2 && (Integer.parseInt(rueckgabe)-zufallszahl)<=2)
        {
            JOptionPane.showMessageDialog (null, "Deine Zahl ist innerhalb der Grenze +2 oder -2!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Deine Zahl ist nicht gleich!");
        }
    }
}

