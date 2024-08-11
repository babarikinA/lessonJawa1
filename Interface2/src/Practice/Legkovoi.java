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

        int distance = calculateDistance(time);

        return "За время " + time + " ч, автомобиль " + getMarka() + " двигаясь с максимальной скоростью: " + getMaxskorost() + " км/ч проедет " + distance + " км и израсходует " + calculateRashod(distance) + " литров топлива.";
    }

    public int calculateDistance(int time) {
        int t = getMaxskorost() * time;
        return t;
    }

    private double calculateRashod(double distance) {

        double d = (distance / 100) * getRashodTop();

        return d;

    }

}
