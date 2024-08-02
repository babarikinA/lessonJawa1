package Practice;

public class Gryzovoi extends Nazemni {
    private int gryzoPodemnost;

    public Gryzovoi(String marka, int moshnost, int maxskorost, int massa, int kolKoles, int rashodTop, int gryzoPodemnost) {
        super(marka, moshnost, maxskorost, massa, kolKoles, rashodTop);
        this.gryzoPodemnost = gryzoPodemnost;
    }

    public int gryzik() {
        return gryz();
    }

    public int getGryzoPodemnost() {
        return gryzoPodemnost;
    }



    public int gryz () {
        if (gryzoPodemnost >= 3500) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
        return 0;
    }

}
