package oppgaverobjekt1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Person {

    String navn, adresse, telefonnr;
    int fødselsår, alder;

    public void regneUtAlder() {
        alder = 2022 - fødselsår;
    }

    public void utSkriftAlt() {
        System.out.print(navn+" med adresse "+adresse+" med telefonnummer "+telefonnr+" er "+alder+" år ");
    }






}


public class OppgaveObjekt1_3 {
    public static void main(String [] args ){
        Person p1 = new Person();
        p1.navn = "Nasir Amin";
        p1.adresse = "Nordkappgata 13";
        p1.telefonnr = "22099115";
        p1.fødselsår = 1991;
        p1.regneUtAlder();
        p1.utSkriftAlt();


    }
}
