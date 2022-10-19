package kontrollstrukturer1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppg5a {
    public static void main (String[] args) {
        String innMåned = showInputDialog("Hvilken måned er det? (kun små bokstaver)");

        if (innMåned.equals("desember")) {
            showMessageDialog(null, "Det er vinter.");
        }
        else if (innMåned.equals("januar")) {
            showMessageDialog(null, "Det er vinter.");
        }
        else if (innMåned.equals("februar")) {
            showMessageDialog(null, "Det er vinter.");
        }
        else if (innMåned.equals("mars")) {
            showMessageDialog(null, "Det er vår.");
        }
        else if (innMåned.equals("april")) {
            showMessageDialog(null, "Det er vår.");
        }
        else if (innMåned.equals("mai")) {
            showMessageDialog(null, "Det er vår.");
        }
        else if (innMåned.equals("juni")) {
            showMessageDialog(null, "Det er sommer.");
        }
        else if (innMåned.equals("juli")) {
            showMessageDialog(null, "Det er sommer.");
        }
        else if (innMåned.equals("august")) {
            showMessageDialog(null, "Det er sommer.");
        }
        else if (innMåned.equals("september")) {
            showMessageDialog(null, "Det er høst.");
        }
        else if (innMåned.equals("oktober")) {
            showMessageDialog(null, "Det er høst.");
        }
        else if (innMåned.equals("november")) {
            showMessageDialog(null, "Det er høst.");
        }

    }
}
