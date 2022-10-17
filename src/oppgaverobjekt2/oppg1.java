package oppgaverobjekt2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Person {
    private String fornavn;
    private String etternavn;
    private String adresse;
    private String tlfnr;

    public Person(String fornavn, String etternavn, String adresse, String tlfnr) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.tlfnr = tlfnr;
    }

    public String getFornavn() {

        return fornavn;
    }

    public void setFornavn(String fornavn) {

        this.fornavn = fornavn;
    }

    public String getEtternavn() {

        return etternavn;
    }

    public void setEtternavn(String etternavn) {

        this.etternavn = etternavn;
    }

    public String getAdresse() {

        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTlfnr() {

        return tlfnr;
    }

    public void setTlfnr(String tlfnr) {

        this.tlfnr = tlfnr;
    }

    public void skrivUt() {
        String utSkriv = "Fornavn: " + getFornavn() + "\n" + "Etternavn: " + getEtternavn() + "\n" + "Adresse: " + getAdresse() + "\n" + "Telefonnummer: " + getTlfnr();
        showMessageDialog(null, utSkriv);
    }
}

public class oppg1 {
    public static void main(String[] args) {
        String innFornavn = showInputDialog("Skriv inn fornavn");
        String innEtternavn = showInputDialog("Skriv inn etternavn");
        String innAdresse = showInputDialog("Skriv inn adresse");
        String innTlfnr = showInputDialog("Skriv inn telefonnummer");

        Person person1 = new Person(innFornavn, innEtternavn, innAdresse, innTlfnr);
        person1.skrivUt();

    }
}
