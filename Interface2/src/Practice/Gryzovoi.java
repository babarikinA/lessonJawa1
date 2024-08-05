package Practice;

public class Gryzovoi extends Nazemni {
    private int gryzoPodemnost;

    public Gryzovoi(String marka, int moshnost, int maxskorost, int massa, int kolKoles, int rashodTop, int gryzoPodemnost, int distance, int time) {
        super(marka, moshnost, maxskorost, massa, kolKoles, rashodTop, distance, time);
        this.gryzoPodemnost = gryzoPodemnost;
    }

    public void gryz() {
        if (gryzoPodemnost <= 3500) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    public String getDescription() {
        return "За время " + getTime() + " ч, автомобиль " + getMarka() + " двигаясь с максимальной скоростью: " + getMaxskorost() + " км/ч проедет " + getDistance() + " км и израсходует " + getRashodTop() + " литров топлива.";
    }

}
