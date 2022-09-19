package bilKlasse.objects91;

class Bil {
    private String farge;

    public void settFarge (String fargen){
        farge = fargen;
    }

    public String hentFarge(){
        return farge;
    }
}

public class Objects91 {
    public static void main(String [] args){
        Bil nyBil = new Bil();
        nyBil.settFarge("blå");
        String bilFargen = nyBil.hentFarge();
        System.out.print("Fargen til bilen er "+bilFargen);
    }
}
