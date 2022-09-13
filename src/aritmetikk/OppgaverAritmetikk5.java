package aritmetikk;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaverAritmetikk5 {
    public static void main(String [] args){
        String innFahrenheit = showInputDialog("Skriv inn ønsket temperatur i Fahrenheit.");

        double fahrenheit = Double.parseDouble(innFahrenheit);

        double utregning = (fahrenheit-32)/1.8;

        String utSkriv = fahrenheit+"F er "+String.format("%.2f",utregning)+" i celsius.";

        showMessageDialog(null,utSkriv);
    }
}
