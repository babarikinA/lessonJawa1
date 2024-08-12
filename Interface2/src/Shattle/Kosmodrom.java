package Shattle;

public class Kosmodrom {

    IStart iStart = new IStart() {
        @Override
        public boolean pps(boolean a) {
            return a;
        }

        @Override
        public void startEngine() {
            for (int i = 10; i <= 1; i--) {
                System.out.println(i);
            }
        }

        @Override
        public void start() {


        }
    };

    public void zapysk(IStart iStart) {
        if (iStart.pps(false)) == false; {
            System.out.println("Предстартовая проверка провалена");

        } else {
            iStart.startEngine();
        }

    }

}