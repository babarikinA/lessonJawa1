package shattle;

public class Shattle implements IStart {


    @Override
    public boolean pps() {

        // math random!!! return x > 6 true !!!

        return false;
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
