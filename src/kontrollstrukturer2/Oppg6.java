package kontrollstrukturer2;

public class Oppg6 {
    public static void main (String[] args) {
        int teller = 0;
        int sum = 0;
        while (teller < 10) {
            sum +=teller;
            teller++;
        }
        System.out.println("Summen av tall mellom 0 og 9 er: "+sum);
    }
}
