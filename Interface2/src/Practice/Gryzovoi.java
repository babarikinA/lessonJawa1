package Practice;

public class Gryzovoi extends Nazemni {
    private int gryzoPodemnost;

    public Gryzovoi(String marka, int moshnost, int maxskorost, int massa, int kolKoles, int rashodTop, int gryzoPodemnost) {
        super(marka, moshnost, maxskorost, massa, kolKoles, rashodTop);
        this.gryzoPodemnost = gryzoPodemnost;
    }

    public String gryz() {
        if (gryzoPodemnost <= 3500) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
        return "";
    }
}