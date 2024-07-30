package Practice;

public class Legkovoi extends Nazemni {
    public String tipKyzova;
    public int kolPassazirov;
    private int Maxspeed = 10;
    private int Time = 1;

    public Legkovoi(String marka, int moshnost, int maxskorost, int massa, int kolKoles, int rashodTop, String tipKyzova, int kolPassazirov, int maxspeed, int time) {
        super(marka, moshnost, maxskorost, massa, kolKoles, rashodTop);
        this.tipKyzova = tipKyzova;
        this.kolPassazirov = kolPassazirov;
        Maxspeed = maxspeed;
        Time = time;
    }

    public String getTipKyzova() {
        return tipKyzova;
    }

    public int getKolPassazirov() {
        return kolPassazirov;
    }

    public int getMaxspeed() {
        return Maxspeed;
    }

    public int getTime() {
        return Time;
    }
}
