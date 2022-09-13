package aritmetikk;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppGaverAritmetikk11 {
    public static void main (String [] args) {
        String innData = showInputDialog("Skriv inn et tall mellom 0 og 1000.");

        int tall1 = Integer.parseInt(innData);

        String lastNumberIgnore;

//finner siste siffer i et tall
        int lastNumber = tall1 % 10;


//Finner første og siste siffer i et tall
        int num2 = tall1 / 10;
        int firstNumber = num2/10;
        int middleNumber = num2%10;

//Tverrsummen av tallene
        int sum = firstNumber+middleNumber+lastNumber;


        String utData = "Tverrsummen av " + tall1 + " er " + sum + "(" + firstNumber + " + " + middleNumber + " + " + lastNumber + ").";

        showMessageDialog(null, utData);

    }
}
