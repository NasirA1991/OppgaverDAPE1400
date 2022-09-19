package bilKlasse;

class Bil {
    public String farge;

    public void visFarge(){
        System.out.print("Fargen til bilen er "+farge);
    }
}

public class BilKlasse {
    public static void main (String [] args){
        Bil nyBil = new Bil();
        nyBil.farge = "blå";
        nyBil.visFarge();
    }
}
