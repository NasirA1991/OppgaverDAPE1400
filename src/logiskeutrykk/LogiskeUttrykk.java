package logiskeutrykk;


import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class LogiskeUttrykk {
    public static void main(String [] args){
        String innString1 = showInputDialog("Skriv inn tall 1");
        String innString2 = showInputDialog("Skriv inn tall 2");

        int tall1 = Integer.parseInt(innString1);
        int tall2 = Integer.parseInt(innString2);

        if (tall1 == tall2) {
            showMessageDialog(null, "Tall1 er lik tall2");
        }

        if (tall1 != tall2) {
            showMessageDialog(null, "Tall1 er ikke lik tall2");
        }

        if (tall1 >= tall2) {
            showMessageDialog(null, "Tall1 er større eller lik enn tall2");
        }

        if (tall1 <= tall2) {
            showMessageDialog(null, "Tall1 er mindre eller lik enn tall2");
        }

        if (tall1 > tall2) {
            showMessageDialog(null, "Tall1 er større enn tall2");
        }

        if (tall1 < tall2) {
            showMessageDialog(null,"Tall1 er mindre enn tall2");
        }

    }
}
