package kontrollstrukturer1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppg5b {
    public static void main (String[] args) {
        String innMåned = showInputDialog("Hvilken måned er det? (kun små bokstaver)");

       switch (innMåned)  {
           case "desember":
           case "januar":
           case "februar":
               showMessageDialog(null, "Det er vinter.");
               break;
           case "mars":
           case "april":
           case "mai":
               showMessageDialog(null, "Det er vår.");
               break;
           case "juni":
           case "juli":
           case "august":
               showMessageDialog(null, "Det er sommer");
               break;
           case "september":
           case "oktober":
           case "november":
               showMessageDialog(null, "Det er høst.");
               break;
           default:
               showMessageDialog(null, "Ikke gyldig måned.");
               break;
       }

    }
}
