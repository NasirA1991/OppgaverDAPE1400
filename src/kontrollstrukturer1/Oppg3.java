package kontrollstrukturer1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppg3 {
    public static void main (String[] args) {
        String innAlder = showInputDialog("Hvor gammel er du?");
        int alder = Integer.parseInt(innAlder);

        if (alder >= 18) {
            showMessageDialog(null, "Du kan ta førerkortet da du er gammel nok.");
        }
        else {
            showMessageDialog(null, "Du er for ung til å ta førerkortet for bil.");
        }
    }
}
