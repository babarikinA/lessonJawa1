package practice;

public class Voenii extends Vozdyshni {
    private boolean katapult;
    private int rocket;

    public Voenii(String marka, int moshnost, int maxskorost, int massa, int razmaxKriliev, int minDlinaVPP, boolean katapult, int rocket) {
        super(marka, moshnost, maxskorost, massa, razmaxKriliev, minDlinaVPP);
        this.katapult = katapult;
        this.rocket = rocket;
    }

    public boolean isKatapult() {
        return katapult;
    }

    public int getRocket() {
        return rocket;
    }

    public void katapult() {
        if (this.katapult) {
            System.out.println("Катапультрование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    public void shoot(int rocket) {
        if (rocket > 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутсвуют");
        }
    }

    public String getDescription() {
        return "За время" + " ч, самолет " + getMarka() + " двигаясь с максимальной скоростью: " + getMaxskorost() + " км/ч пролетит " + " км и выпустит " + getRocket() + " ракет.";
    }


}

