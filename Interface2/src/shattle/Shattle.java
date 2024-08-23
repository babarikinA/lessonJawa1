package shattle;

public class Shattle implements IStart {


    @Override
    public boolean pps() {

        // math random!!! return x > 6 true !!!

        int randomInt = (int) (Math.random()*11);

        if (randomInt > 3){
            return true;
        }else {

            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {

        System.out.println("Старт шатла.");

    }
}
