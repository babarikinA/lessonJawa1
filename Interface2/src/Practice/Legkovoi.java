package Practice;

public class Legkovoi extends Nazemni {
    private String tipKyzova;
    private int kolPassazirov;

    public Legkovoi(String marka, int moshnost, int maxskorost, int massa, int kolKoles, int rashodTop, String tipKyzova, int kolPassazirov) {
        super(marka, moshnost, maxskorost, massa, kolKoles, rashodTop);
        this.tipKyzova = tipKyzova;
        this.kolPassazirov = kolPassazirov;
    }

    public String getTipKyzova() {
        return tipKyzova;
    }

    public int getKolPassazirov() {
        return kolPassazirov;
    }

    public String getDescription(){return "За время" +  " ч, автомобиль " + getMarka() +" двигаясь с максимальной скоростью: " + getMaxskorost() +  " км/ч проедет " + " км и израсходует " + getRashodTop() + " литров топлива.";}

}
