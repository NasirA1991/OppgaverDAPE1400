package oppg6;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Vind {
    private double vindHastighet = 0.0;

    public Vind (double vindHastighet) {
        this.vindHastighet = vindHastighet;
    }

    public double getVindHastighet(){
        return vindHastighet;
    }

    public void setVindHastighet (double vindHastighet){
        this.vindHastighet = vindHastighet;
    }

    public boolean erOrkan() {
        if (vindHastighet >= 120) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean erVindstille() {
        if (vindHastighet <= 2) {
            return true;
        }
        else {
            return false;
        }
    }

    public double getKnop() {
        double sum = vindHastighet/1.852;
        return sum;
    }

    public int getBeaufort() {
        int beaufort = (int)(Math.pow(vindHastighet/3.01, 0.6666)+0.5);
        if (beaufort > 12) {
            beaufort = 12;
        }
        return beaufort;
    }
}

public class Oppg6 {
    public static void main (String[] args){
        String innVind = showInputDialog("Oppgi vindhastigheten: ");
        double vind = Double.parseDouble(innVind);
        Vind sjekkVind = new Vind(vind);
        String ut = "Vindhastigheten er "+sjekkVind.getVindHastighet()+"\n";
        if(sjekkVind.erOrkan()) {
            ut += "Det er orkan." + "\n";
        }
        if (sjekkVind.erVindstille()) {
            ut += "Det er vindstille" + "\n";
        }
        String knop = String.format("%.2f",sjekkVind.getKnop());
        ut += "Det er "+knop+" knop.\n";
        ut+= "Og det tilsvarer "+sjekkVind.getBeaufort()+" på beaufort-skalaen.";
        showMessageDialog(null, ut);
        }
    }
