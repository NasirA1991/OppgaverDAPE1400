package variablerDesimalTall;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class VariablerDesimalTall {
    public static void main(String [] args){
        String innStreng1 = showInputDialog("Skriv inn et desimaltall");
        String innStreng2 = showInputDialog("Skriv inn et desimaltall til");
        double tall1 = Double.parseDouble(innStreng1);
        double tall2 = Double.parseDouble(innStreng2);   //NB!!! Skal du dividere HELTALL (integer) må en eller begge av dem være definert som desimaltall (double), hvis ikke får du alltid et heltall som svar tilbake!!!
        double divisjon = tall1/tall2;
        System.out.println(divisjon);
        //showMessageDialog(null, "Divisjonen ble "+divisjon);
    }
}
