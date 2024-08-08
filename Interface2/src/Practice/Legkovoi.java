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


    public String getDescription(int time) {

        calculateDistance(10);

        return "За время " + time + " ч, автомобиль " + getMarka() + " двигаясь с максимальной скоростью: " + getMaxskorost() + " км/ч проедет " + calculateDistance() + " км и израсходует " +calculateRashod(4000 )+ " литров топлива.";
    }

    public void calculateDistance(int time) {
        int t = getMaxskorost() * time;

    }

    private int calculateRashod(int distance) {

        int d = (distance / 100) * getRashodTop();

        return d;

    }

}
