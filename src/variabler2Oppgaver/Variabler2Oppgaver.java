package variabler2Oppgaver;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Variabler2Oppgaver {
    public static void main(String [] args){
        String innFornavn = showInputDialog("Skriv inn fornavnet ditt");
        String innEtternavn = showInputDialog("Skriv inn etternavnet ditt");
        String innAlder = showInputDialog("Hvor gammel er du?");
        String innAdresse = showInputDialog("Hva er adressen din?");
        String innPoststed = showInputDialog("Hva er posttedet ditt?");
        String innPostnr = showInputDialog("Hva er postnr ditt?");
        String ut = "Navn: "+innFornavn+" "+innEtternavn+"\n"+"Adresse: "+innAdresse+"\n"+"Postnummer: "+innPostnr+"\n"+"Poststed: "+innPoststed+"\n"+"Alder: "+innAlder+" år";

        System.out.println(ut);
        //showMessageDialog(null,ut);

    }
}

}
