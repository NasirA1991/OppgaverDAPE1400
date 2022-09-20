package oblig1ntnu;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oblig1Ntnu {
    public static void main(String[] args) {
        String innNavn1 = showInputDialog("Skriv inn navn");
        String innTimeLønn1 = showInputDialog("Hva er din timelønn?");
        String innFerieUker1 = showInputDialog("Hvor mange uker ferie har du per år?");

        String innNavn2 = showInputDialog("Skriv inn navn");
        String innTimeLønn2 = showInputDialog("Hva er din timelønn?");
        String innFerieUker2 = showInputDialog("Hvor mange uker ferie har du per år?");

        int lengdeNavn1 = innNavn1.length();
        int lengdeNavn2 = innNavn2.length();

        double ferieuker1 = Integer.parseInt(innFerieUker1);
        double ferieuker2 = Integer.parseInt(innFerieUker2);

        double timelønn1 = Double.parseDouble(innTimeLønn1);
        double timelønn2 = Double.parseDouble(innTimeLønn2);

        double ukelønn1 = timelønn1 * (8 * 5);
        double ukelønn2 = timelønn2 * (8 * 5);

        double månedslønn1 = ukelønn1 * 4.33;
        double månedslønn2 = ukelønn2 * 4.33;

        double ukerjobbår1 = (52 - ferieuker1);
        double ukerjobbår2 = (52 - ferieuker2);

        double årslønn1 = ukelønn1 * ukerjobbår1;
        double årslønn2 = ukelønn2 * ukerjobbår2;

        String utData1 = "Første persons navn: " + innNavn1 + "\n" + "Andre persons navn: " + innNavn2 + "\n" + innNavn1 + " sin timelønn: " + timelønn1 + "\n" + "Antall uker ferie: " + ferieuker1 + "\n" + innNavn2 + " sin timelønn: " + timelønn2 + "\n" + "Antall uker ferie: " + ferieuker2 + "\n";
        showMessageDialog(null, utData1);

        String utData2 = "Navn: " + innNavn1 + "( lengde: " + lengdeNavn1 + ")" + "\n" + "Timelønn: " + timelønn1 + "\n" + "Ferie uker: " + ferieuker1 + "\n" + "Ukelønn: " + ukelønn1 + "\n" + "Månedslønn: " + månedslønn1 + "\n" + "Årslønn: " + årslønn1 + "\n";
        showMessageDialog(null, utData2);

        String utData3 = "Navn: " + innNavn2 + "( lengde: " + lengdeNavn2 + ")" + "\n" + "Timelønn: " + timelønn2 + "\n" + "Ferie uker: " + ferieuker2 + "\n" + "Ukelønn: " + ukelønn2 + "\n" + "Månedslønn: " + månedslønn2 + "\n" + "Årslønn: " + årslønn2;
        showMessageDialog(null, utData3);

        if (innNavn1 == innNavn2) {
            System.out.println("Navnene er identiske");
        } else {
            System.out.println("Navnene er forskjellige");
        }

        if (timelønn1 == timelønn2) {
            System.out.println("Timelønnen er lik");
        } else {
            System.out.println("Timelønnen er forskjellig");
        }


    }
}
