package Practice;

public class Grazdanski extends Vozdyshni {
    private int kolvoPassazir;
    private boolean biznessClass;

    public Grazdanski(String marka, int moshnost, int maxskorost, int massa, int razmaxKriliev, int minDlinaVPP, int kolvoPassazir, boolean biznessClass) {
        super(marka, moshnost, maxskorost, massa, razmaxKriliev, minDlinaVPP);
        this.kolvoPassazir = kolvoPassazir;
        this.biznessClass = biznessClass;
    }

    public int getkolvoPassazir() {
        return kolvoPassazir;
    }

    public boolean isBiznessClass() {
        return biznessClass;
    }

    public void kolichestvo() {
        if (kolvoPassazir >= 300) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}
