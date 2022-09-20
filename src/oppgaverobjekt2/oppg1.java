package oppgaverobjekt2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Person {
    private String fornavn;
    private String etternavn;
    private String adresse;
    private int tlfnr;

    public Person(String fornavn, String etternavn, String adresse, int tlfnr) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.tlfnr = tlfnr;
    }

    public String getFornavn(){
        return fornavn;
    }

    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }

    public String getEtternavn(){
        return etternavn;
    }

    public void setEtternavn(String etternavn){
        this.etternavn = etternavn;
    }
    public String getAdresse(){
        return adresse;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public int getTlfnr(){
        return tlfnr;
    }

    public void setTlfnr(int tlfnr){
        this.tlfnr = tlfnr;
    }

    public void skrivUt(){
        String utSkriv = "Fornavn: "+getFornavn()+"\n"+"Etternavn: "+getEtternavn()+"\n"+"Adresse: "+getAdresse()+"\n"+"Telefonnummer: "+getTlfnr();
        showMessageDialog(null, utSkriv);
    }

}

public class oppg1 {
    public static void main(String[] args){
        String innFornavn = showInputDialog("Skriv inn fornavn");
        String innEtternavn = showInputDialog("Skriv inn etternavn");
        String innAdresse = showInputDialog("Skriv inn adresse");
        String innTlfnr = showInputDialog("Skriv inn telefonnummer");
        int tlfNr = Integer.parseInt(innTlfnr);

        Person person1 = new Person(innFornavn,innEtternavn,innAdresse,tlfNr);
        person1.skrivUt();


    }
}
