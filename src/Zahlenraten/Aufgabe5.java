package Zahlenraten;

import javax.swing.*;
import java.util.Random;

public class Aufgabe5 {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;

        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max - min + 1) + min;
        int i = 0;

        while (i < 3) {
            int rueckgabe = Integer.parseInt(JOptionPane.showInputDialog(null, "Gib mir eine Ganzzahl, die zwischen 1 und 10 liegt!"));
            if (rueckgabe == zufallszahl) {
                JOptionPane.showMessageDialog(null, "Deine Zahl ist gleich!");
                break;
            } else {
                i++;
                if (i > 2) {
                    JOptionPane.showMessageDialog(null, "Keine Übereinstimmung mit der Zufallszahl:" + zufallszahl + "! Alle Versuche aufgebraucht!");
                } else {
                    JOptionPane.showMessageDialog(null, "Keine Übereinstimmung mit der Zufallszahl.noch " + (3 - i) + " Versuche übrig!");
                }
            }
        }
    }
}
