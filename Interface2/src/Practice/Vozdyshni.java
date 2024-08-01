package Practice;

public class Vozdyshni extends Transport {
    private int razmaxKriliev;
    private int minDlinaVPP;

    public Vozdyshni(String marka, int moshnost, int maxskorost, int massa, int razmaxKriliev, int minDlinaVPP) {
        super(marka, moshnost, maxskorost, massa);
        this.razmaxKriliev = razmaxKriliev;
        this.minDlinaVPP = minDlinaVPP;
    }

    public int getRazmaxKriliev() {
        return razmaxKriliev;
    }

    public int getMinDlinaVPP() {
        return minDlinaVPP;
    }
}

