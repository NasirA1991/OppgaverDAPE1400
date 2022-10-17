package oppgaverobjekt2;

class Bensinkjøp {
    private String bensinstasjonsted;
    private String bensin;
    private double antLiterFylt;
    private double prisPerLiter;
    private String tidspunktFylt;

    public Bensinkjøp (String bensinstasjonsted, String bensin, double antLiterFylt, double prisPerLiter, String tidspunktFylt) {
        this.bensinstasjonsted = bensinstasjonsted;
        this.bensin = bensin;
        this.antLiterFylt = antLiterFylt;
        this.prisPerLiter = prisPerLiter;
        this.tidspunktFylt = tidspunktFylt;
    }

    public String getBensinstasjonsted() {
        return bensinstasjonsted;
    }

    public void setBensinstasjonsted(String bensinstasjonsted) {
        this.bensinstasjonsted = bensinstasjonsted;
    }

    public String getBensin() {
        return bensin;
    }

    public void setBensin(String bensin) {
        this.bensin = bensin;
    }

    public double getAntLiterFylt() {
        return antLiterFylt;
    }

    public void setAntLiterFylt(double antLiterFylt){
        this.antLiterFylt = antLiterFylt;
    }

    public double getPrisPerLiter() {
        return prisPerLiter;
    }

    public void setPrisPerLiter(double prisPerLiter) {
        this.prisPerLiter = prisPerLiter;
    }

    public String getTidspunktFylt() {
        return tidspunktFylt;
    }

    public void setTidspunktFylt (String tidspunktFylt) {
        this.tidspunktFylt = tidspunktFylt;
    }

    public double finnTotalPrisen() {
        return antLiterFylt * prisPerLiter;
    }

}

public class oppg3 {
    public static void main(String[] args) {
        Bensinkjøp dag1Bensin = new Bensinkjøp("Oslo", "oktan", 15.53, 29.54, "20:09");
        double pris = dag1Bensin.finnTotalPrisen();
        String prisToDesimaler = String.format("%.2f",pris);
        String ut = "Det kostet totalt "+prisToDesimaler+" kr i "+dag1Bensin.getBensinstasjonsted()+
                " kl "+dag1Bensin.getTidspunktFylt();
        System.out.println(ut);

    }
}
