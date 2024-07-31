package Practice;

public class Vozdyshni extends Transport {
    private int RazmaxKriliev;
    private int MinDlinaVPP;

    public Vozdyshni(String marka, int moshnost, int maxskorost, int massa, int razmaxKriliev, int minDlinaVPP) {
        super(marka, moshnost, maxskorost, massa);
        RazmaxKriliev = razmaxKriliev;
        MinDlinaVPP = minDlinaVPP;
    }

    public int getRazmaxKriliev() {
        return RazmaxKriliev;
    }

    public int getMinDlinaVPP() {
        return MinDlinaVPP;
    }
}

