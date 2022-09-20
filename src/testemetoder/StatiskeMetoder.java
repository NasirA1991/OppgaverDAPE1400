package testemetoder;
//Kalle på en metode uten å opprette objekt.

class Bil{
    public static double rekkevidde(double tank, double forbruk){
        double rekkevidde = tank / forbruk;
        return rekkevidde;
    }
}

public class StatiskeMetoder {
    public static void main(String [] args){
        double rekkevidde = Bil.rekkevidde(80,0.8);
        System.out.println("Rekkevidden til bilen er "+rekkevidde+" mil.");
    }
}
