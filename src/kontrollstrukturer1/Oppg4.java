package kontrollstrukturer1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppg4 {
    public static void main (String[] args) {
        String innAlder = showInputDialog("Hvor gammel er du?");
        int alder = Integer.parseInt(innAlder);

        if (alder > 70) {
            showMessageDialog(null, "Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker");
        }
        else if (alder >= 18 && alder <= 70) {
            showMessageDialog(null, "Du kan ta førerkort for bil og du trenger ikke årlige legesjekker");
        }
        else {
            showMessageDialog(null, "Du er for ung til å ta førerkort for bil.");
        }
    }
}
