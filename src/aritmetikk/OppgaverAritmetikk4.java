package aritmetikk;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaverAritmetikk4 {
    public static void main(String [] args){
        String innRadius = showInputDialog("Skriv inn radius til sirkelen");

        double radius = Double.parseDouble(innRadius);

        double diameter = radius*2;
        double omkrets = diameter*3.14;

        String omkretsenMedToDesimaler = String.format("%2f", omkrets);

        String utTekst = "Omkretsen av en sirkel med "+radius+" cm som radius blir "+String.format("%.2f",omkrets)+" cm.";

        showMessageDialog(null,utTekst);

    }
}
