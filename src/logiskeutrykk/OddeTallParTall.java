package logiskeutrykk;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OddeTallParTall {
    public static void main(String [] args){
        String innData = showInputDialog("Tast inn et tall for å se om det er et odde eller partall");

        int tall = Integer.parseInt(innData);


        if (tall % 2 == 1) {
            showMessageDialog(null, "Tallet er et oddetall");
        }

        if (tall % 2 == 0) {
            showMessageDialog(null, "Tallet er et partall");
        }
    }
}
