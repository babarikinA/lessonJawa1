package shattle;

public class Kosmodrom {

    IStart iStart = new IStart() {
        @Override
        public boolean pps() {

            return false;
        }

        @Override
        public void startEngine() {
            System.out.println("Двигатели Шатла запущены. Все системы в норме.");
        }

        @Override
        public void start() {

            System.out.println("Старт шатла");

        }
    };

    public void zapysk(IStart iStart) {
        if (iStart.pps() == iStart.pps()){
            System.out.println("Предстартовая проверка провалена");

        } else {
            iStart.startEngine();
                for (int i = 10; i <= 1; i--) {
                    System.out.println(i);
                    iStart.start();
                }


        }
    }
}


