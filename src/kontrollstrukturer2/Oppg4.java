package kontrollstrukturer2;

public class Oppg4 {
    public static void main (String[] args) {
        int sum = 0;
        int teller = 0;
        for (int i = 0; i < 100; i += 2) {
            teller++;
            sum = sum + i;
            System.out.print(i+" "+"\n");
        }
        double gjsnitt = (double)sum/teller;

        System.out.println("Summen av alle partall mellom 0 og 100 er: "+sum+"\n");
        System.out.println("Gjennomsnittet av alle partallene fra 0 til 99 er: "+gjsnitt);

    }
}
