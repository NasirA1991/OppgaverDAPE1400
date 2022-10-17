package bank;

import static javax.swing.JOptionPane.showInputDialog;

public class Bank {
    public static void main (String[] args) {
        String kontoFornavn = showInputDialog("Hva er fornavnet ditt?");
        String kontoEtternavn = showInputDialog("Hva er etternavnet ditt?");
        String kontonr = showInputDialog("Hva er kontonr ditt?");
        double saldo = Double.parseDouble(showInputDialog("Hva er saldoen din"));
        Konto nyKonto1 = new Konto(kontoFornavn,kontoEtternavn,kontonr,saldo);
        nyKonto1.utPenger();
        nyKonto1.innPenger();
        nyKonto1.kontoUtSkrift();

    }
}