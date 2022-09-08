package testetall;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class testeTall {
    public static void main(String [] args){
        String inndata1 = showInputDialog("Skriv inn et heltall");
        String innData2 = showInputDialog("Skriv inn et heltall til");
        String innData3 = showInputDialog("Skriv inn et desimaltall");
        int tall1 = Integer.parseInt(inndata1);
        int tall2 = Integer.parseInt(innData2);
        double tall3 = Double.parseDouble(innData3);
        double sum = tall1+tall2+tall3;
        showMessageDialog(null, "Summen er "+sum);
    }
}
