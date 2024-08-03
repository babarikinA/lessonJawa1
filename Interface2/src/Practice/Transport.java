package Practice;

public class Transport {
    private String marka;
    private int moshnost;
    private int maxskorost;
    private int massa;

    public Transport(String marka, int moshnost, int maxskorost, int massa) {
        this.marka = marka;
        this.moshnost = moshnost;
        this.maxskorost = maxskorost;
        this.massa = massa;
    }

    public String getMarka() {
        return marka;
    }

    public int getMoshnost() {
        return moshnost;
    }

    public int getMaxskorost() {
        return maxskorost;
    }

    public int getMassa() {
        return massa;
    }

    public double kalk() {
        double result = moshnost * 0.74;
        return moshnost;
    }

}
