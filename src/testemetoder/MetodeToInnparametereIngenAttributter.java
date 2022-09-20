package testemetoder;

class Bilen {

    public double rekkevidde(double tank, double forbruk){
        double rekkevidde = tank / forbruk;
        return rekkevidde;
    }
}

public class MetodeToInnparametereIngenAttributter {
    public static void main(String [] args){
        Bilen volvo = new Bilen();
        double rekkevidde = volvo.rekkevidde(80,0.8);
        System.out.println("Rekkevidden til bilen er "+rekkevidde+" mil.");
    }
}
