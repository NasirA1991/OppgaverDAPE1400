package bank;

public class Bank {
    public static void main (String[] args) {
        Konto nyKonto1 = new Konto ("Nasir", "Amin", "0557 94885 32", 10000);
        nyKonto1.kontoUtSkrift();
        nyKonto1.utPenger();
        nyKonto1.innPenger();

    }
}