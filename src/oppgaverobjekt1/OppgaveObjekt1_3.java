package oppgaverobjekt1;

import static javax.swing.JOptionPane.*;

class Person {

    String navn, adresse, telefonnr;
    int fødselsår, alder;


    public void regneUtAlder() {
        alder = 2022 - fødselsår;
    }

    public void utSkriftAlt() {
        String utData = "Navn: "+navn+"\n"+"Adresse: "+adresse+"\n"+"Telefonnummer: "+telefonnr+"\n"+"Alder: "+alder;
        showMessageDialog(null, utData);
    }

}

public class OppgaveObjekt1_3 {
    public static void main(String [] args ){
        Person p1 = new Person();
        p1.navn = showInputDialog("Hva heter du?");
        p1.adresse = showInputDialog("Hva er adressen din?");
        p1.telefonnr = showInputDialog("Hva er telefonnummeret ditt?");
        String innFÅr = showInputDialog("Skriv inn fødselsnummeret ditt");
        p1.fødselsår = Integer.parseInt(innFÅr);
        p1.regneUtAlder();
        p1.utSkriftAlt();

        /*Person p2 = new Person();
        p2.navn = "Shoaib Amin";
        p2.adresse = "Nordkappgata 13";
        p2.telefonnr = "40469602";
        p2.fødselsår = 1992;
        p2.regneUtAlder();
        p2.utSkriftAlt();*/


    }
}
