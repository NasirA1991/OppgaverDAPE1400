package bank;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Konto {
    private String fornavn;
    private String etternavn;
    private String kontonr;
    private double saldo;

    public Konto (String fornavn, String etternavn, String kontonr, double saldo) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.kontonr = kontonr;
        this.saldo = saldo;

    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn (String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn (String etternavn) {
        this.etternavn = etternavn;
    }

    public  String getKontonr() {
        return kontonr;
    }

    public void setKontonr (String kontonr) {
        this.kontonr = kontonr;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }

    public void kontoUtSkrift() {
        String ut = fornavn+" "+etternavn+" med kontonummer: "+kontonr+"\n"+
                "har "+String.format("%.2f",saldo)+" kroner på konto.";
        showMessageDialog(null, ut);
    }

    public void innPenger() {
        String innPeng = showInputDialog("Hvor mye vil du sette inn?");
        double innPenger = Double.parseDouble(innPeng);
        double innSum = saldo+innPenger;
        setSaldo(innSum);
        String innPengerDialog = "Din nye saldo er "+String.format("%.2f",saldo)+" kr.";
        showMessageDialog(null, innPengerDialog);
    }

    public void utPenger() {
        String utPeng = showInputDialog("Hvor mye vil du ta ut?");
        double utPenger = Double.parseDouble(utPeng);
        double utSum = saldo-utPenger;
        setSaldo(utSum);
        if (saldo >= utPenger) {
            String ut1 = "Din nye saldo er "+String.format("%.2f",saldo);
            showMessageDialog(null, ut1);
        }
        else {
            String ut2 = "Beklager, du er en fattiglus.";
            showMessageDialog(null, ut2);
        }
    }

}
