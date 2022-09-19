package oppgaverobjekt1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Bøker{
    public String tittel;
    public String pris;
    public String forfatter;
    public String ISBN;

    public void skrivUt(){
        String resultat = "Tittel: "+tittel+"\n"+"Pris: "+pris+"\n"+"Forfatter: "+forfatter+"\n"+"ISBN: "+ISBN;
        showMessageDialog(null, resultat);
    }
}

public class OppgaveObjekt1_1 {
    public static void main(String [] args){
        Bøker nyBok = new Bøker();
        nyBok.tittel = showInputDialog("Tittel til boken");
        nyBok.pris = showInputDialog("Pris til boken");
        nyBok.forfatter = showInputDialog("Skriv inn forfatter");
        nyBok.ISBN = showInputDialog("ISBN-nummer");

        nyBok.skrivUt();
    }

}
