package aritmetikk;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaverAritmetikk6 {
    public static void main (String [] args) {
        String innUSD = showInputDialog("Skriv inn beløp i USD");

        double usd = Double.parseDouble(innUSD);

        double konverterUSDtilNOK = usd*9.84;

        String utTekst = String.format("%.2f",usd)+" USD"+"\n"+String.format("%.2f",konverterUSDtilNOK)+" NOK.";

        showMessageDialog(null,utTekst);
    }
}
