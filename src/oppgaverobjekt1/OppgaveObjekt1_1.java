package oppgaverobjekt1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Bøker{
    public String tittel;
    public String pris;
    public String forfatter;
    public String ISBN;

    public void skrivUt(){
        String resultat = "Tittel: "+tittel+" Pris: "+pris+" Forfatter: "+forfatter+" ISBN: "+ISBN;
        showMessageDialog(null, resultat);
    }
}

public class OppgaveObjekt1_1 {
    public static void main(String [] args){
        Bøker nyBok = new Bøker();
        nyBok.tittel = showInputDialog("Tittel?");
        nyBok.pris = showInputDialog("Pris?");
        nyBok.forfatter = showInputDialog("Forfatter?");
        nyBok.ISBN = showInputDialog("ISBN?");

        nyBok.skrivUt();
    }

}
