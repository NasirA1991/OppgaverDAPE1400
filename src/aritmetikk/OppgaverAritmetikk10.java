package aritmetikk;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaverAritmetikk10 {
    public static void main(String [] args){
        String innAlder = showInputDialog("Hvor gammel er du?");

        int alder = Integer.parseInt(innAlder);

        int resultat = (2022-alder);

        System.out.println(resultat);

        if (resultat <= 2004) {
            showMessageDialog(null,"Du kan ta førerkortet for bil da du er gammel nok.");
        }
         if (resultat > 2004) {
            showMessageDialog(null, "Du er for ung til å ta førerkort.");
        }
    }
}
