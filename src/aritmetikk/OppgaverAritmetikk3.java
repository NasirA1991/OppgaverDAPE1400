package aritmetikk;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaverAritmetikk3 {
    public static void main(String [] args){
        String innLengde = showInputDialog("Skriv inn lengde på rektangel i cm");
        String innBredde = showInputDialog("Skriv inn bredde på rektangel i cm");

        double lengde = Double.parseDouble(innLengde);
        double bredde = Double.parseDouble(innBredde);
        double regneUt = lengde * bredde;

        String tekstUt = "Et rektangel med bredde "+bredde+" cm og lengde "+lengde+" cm har et areal på "+regneUt+" cm^2.";

        showMessageDialog(null,tekstUt);
    }
}
