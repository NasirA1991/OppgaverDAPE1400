package aritmetikk;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaverAritmetikk {
    public static void main (String [] args){
        String navn = showInputDialog("Hva heter du?");
        String år1 = showInputDialog("Når er du født?");

        int år2 = Integer.parseInt(år1);
        int sum = 2022 - år2;
        int framtid = 2053-år2;

        String skrivUt = navn+" er i dag "+sum+" år. Han er født i "+år1+". I 2053 er han "+framtid+" år og vil da være pensjonist.";

        showMessageDialog(null,skrivUt);

    }
}
