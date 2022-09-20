package oppgaverobjekt1;

class Kalkulator {

    public static double addere(double add1, double add2){
        double addere = add1 + add2;
        return addere;
    }

    public static double subtrahere (double sub1, double sub2){
        double subtrahere = sub1 - sub2;
        return subtrahere;
    }

    public static double multiplisere (double multi1, double multi2){
        double multiplisere = multi1 * multi2;
        return multiplisere;
    }

    public static double divisere (double div1, double div2){
        double divisere = div1 / div2;
        return divisere;
    }
}


public class OppgaverObjekt1_5 {
    public static void main(String []args){
        double addere = Kalkulator.addere(5.5,5.5);
        double subtrahere = Kalkulator.subtrahere(100,50);
        double multiplisere = Kalkulator.multiplisere(5,5);
        double divisere = Kalkulator.divisere(70,10);

        System.out.println("Addisjon svaret er "+addere);
        System.out.println("Divisjon svaret er "+subtrahere);
        System.out.println("Multiplikasjon svaret er "+multiplisere);
        System.out.println("Divisjon svaret er "+divisere);
    }

}
