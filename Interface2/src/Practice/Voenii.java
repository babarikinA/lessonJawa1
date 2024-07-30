package Practice;

public class Voenii extends Vozdyshni {
    private boolean katapult;
    private int rocket;

    public Voenii(String marka, int moshnost, int massa, int maxskorost,boolean katapult, int rocket) {
        super(marka, moshnost, massa, maxskorost);
        this.rocket = rocket;
        this.katapult = katapult;
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

    public void kalk(int moshnost) {

        double result = moshnost * 0.74;

    }

}

