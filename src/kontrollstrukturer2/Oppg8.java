package kontrollstrukturer2;

public class Oppg8 {
    public static void main (String[] args) {
        int sum = 0;
        int teller = 0;
        int i = 0;

        while (i < 100) {
            sum += i;
            i += 2;
            teller++;
        }
        double gjsnitt = (double)sum/teller;
        System.out.println("Summen av alle partall mellom 0 og 99 er: "+sum);
        System.out.println("Gjennomsnittet av alle partall mellom 0 og 99 er: "+gjsnitt);
    }
}
