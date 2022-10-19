package kontrollstrukturer1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppg1 {
    public static void main (String[] args) {
        String innAlder = showInputDialog("Hvor gammel er du?");
        int alder = Integer.parseInt(innAlder);

        if (alder >= 18 && alder <= 20) {
            showMessageDialog(null, "Du er myndig, men kan ikke kjøpe alkohol med mer enn 22% på polet.");
        }
        else {
            showMessageDialog(null, "Du er enten umyndig eller så kan du kjøpe hva du vil på polet.");
        }
    }
}
