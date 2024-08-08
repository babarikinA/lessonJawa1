package Practice;

public class Nazemni extends Transport {
    private int kolKoles;
    private int rashodTop;

    public Nazemni(String marka, int moshnost, int maxskorost, int massa, int kolKoles, int rashodTop) {
        super(marka, moshnost, maxskorost, massa);
        this.kolKoles = kolKoles;
        this.rashodTop = rashodTop;
    }

    public int getKolKoles() {
        return kolKoles;
    }

    public int getRashodTop() {
        return rashodTop;
    }

}

