package logiskbool;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class LogiskBool {
    public static void main(String [] args){
        String navn, adresse, alder, postnr, postadresse;
        navn = showInputDialog("Hva heter du?");
        adresse = showInputDialog("Hva er adressen din?");
        alder = showInputDialog("Hvor gammel er du?");
        postnr = showInputDialog("Hva er postnr ditt?");
        postadresse = showInputDialog("Hva er din postadresse?");

        String innData1 = showInputDialog("Skriv inn et heltall");
        String innData2 = showInputDialog("Skriv inn et heltall");
        int tall1 = Integer.parseInt(innData1);
        double tall2 = Double.parseDouble(innData2);
        double divisjon = tall1/tall2;

        boolean myndig = true;
        boolean jomfru = false;

        String ut = "Navn: "+navn+"\n"+"Adresse: "+adresse+"\n"+"Alder: "+alder+"\n"+"Myndig: "+myndig+"\n"+"Virgin: "+jomfru+"\n"+"Postnr: "+postnr+"\n"+"Postadresse: "+postadresse+"\n"+"Summen av divisjonen er :"+divisjon;
        showMessageDialog(null,ut);

    }
}
