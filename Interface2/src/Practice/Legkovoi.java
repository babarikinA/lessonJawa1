package Practice;

public class Legkovoi extends Nazemni {
    private String tipKyzova;
    private int kolPassazirov;

    public Legkovoi(String marka, int moshnost, int maxskorost, int massa, int kolKoles, int rashodTop, String tipKyzova, int kolPassazirov, int distance, int time) {
        super(marka, moshnost, maxskorost, massa, kolKoles, rashodTop, distance, time);
        this.tipKyzova = tipKyzova;
        this.kolPassazirov = kolPassazirov;
    }

    public String getTipKyzova() {
        return tipKyzova;
    }

    public int getKolPassazirov() {
        return kolPassazirov;
    }

    public String getDescription() {
        return "За время " + getTime() + " ч, автомобиль " + getMarka() + " двигаясь с максимальной скоростью: " + getMaxskorost() + " км/ч проедет " + getDistance() + " км и израсходует " + getRashodTop() + " литров топлива.";
    }

}
