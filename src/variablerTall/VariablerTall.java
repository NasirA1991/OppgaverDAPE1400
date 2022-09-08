package variablerTall;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class VariablerTall {
    public static void main(String [] args){
        String innStreng1 = showInputDialog("Skriv inn et heltall");
        String innStreng2 = showInputDialog("Skriv inn et heltall til");
        int tall1 = Integer.parseInt(innStreng1);
        int tall2 = Integer.parseInt(innStreng2);
        int sum = tall1+tall2;
        System.out.println(sum);
       // showMessageDialog(null, "Summen til de to tallene er "+sum);
    }
}
