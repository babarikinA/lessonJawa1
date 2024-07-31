package Practice;

public class Grazdanski extends Vozdyshni {
    private int KolvoPassazir;
    private boolean biznessClass;

    public Grazdanski(String marka, int moshnost, int maxskorost, int massa, int razmaxKriliev, int minDlinaVPP, int kolvoPassazir, boolean biznessClass) {
        super(marka, moshnost, maxskorost, massa, razmaxKriliev, minDlinaVPP);
        KolvoPassazir = kolvoPassazir;
        this.biznessClass = biznessClass;
    }

    public int getKolvoPassazir() {
        return KolvoPassazir;
    }

    public boolean isBiznessClass() {
        return biznessClass;
    }
}

