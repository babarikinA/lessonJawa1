package Practice;

public class Legkovoi extends Nazemni {
    private String tipKyzova;
    private int kolPassazirov;
    private int time;
    double distance = time * maxspeed;
    double toplivo = distance / getRashodTop();

    public Legkovoi(String marka, int moshnost, int maxskorost, int massa, int kolKoles, int rashodTop, String tipKyzova, int kolPassazirov, int maxspeed, int time) {
        super(marka, moshnost, maxskorost, massa, kolKoles, rashodTop);
        this.tipKyzova = tipKyzova;
        this.kolPassazirov = kolPassazirov;
        this.time = time;
    }

    public String getTipKyzova() {
        return tipKyzova;
    }

    public int getKolPassazirov() {
        return kolPassazirov;
    }

    public int getMaxskorost() {
        return super.maxskorost();
    }

    public int getTime() {
        return time;
    }

    public int getDiscription() {
        return time;
    }


}
