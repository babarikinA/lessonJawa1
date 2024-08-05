package Practice;

public class Nazemni extends Transport {
    private int kolKoles;
    private int rashodTop;
    private int distance;
    private int time;

    public Nazemni(String marka, int moshnost, int maxskorost, int massa, int kolKoles, int rashodTop, int distance, int time) {
        super(marka, moshnost, maxskorost, massa);
        this.kolKoles = kolKoles;
        this.rashodTop = rashodTop;
        this.distance = distance;
        this.time = time;
    }

    public int getDistance() {
        return distance;
    }

    public int getKolKoles() {
        return kolKoles;
    }

    public int getRashodTop() {
        return distance / 100;
    }

    public int getTime() {
        return distance / getMaxskorost();
    }

}

