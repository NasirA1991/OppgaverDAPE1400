package oppgavevariabel2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveVariabel2 {
    public static void main(String [] args){
        String innData1 = showInputDialog("Skriv inn et desimaltall");
        String innData2 = showInputDialog("Skriv inn et desimaltall");
        String innData3 = showInputDialog("Skriv inn et desimaltall");

        double tall1 = Double.parseDouble(innData1);
        double tall2 = Double.parseDouble(innData2);
        double tall3 = Double.parseDouble(innData3);
        double gjsnitt = (tall1+tall2+tall3)/3;
        String svar = "Gjennomsnittet av tallene "+tall1+", "+tall2+" og "+tall3+" er "+gjsnitt;

        showMessageDialog(null,svar);

        //System.out.println(svar);



    }
}
