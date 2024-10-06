package shattle;

public class Kosmodrom {

    public void zapysk(IStart iStart) {
        if (!iStart.pps()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            iStart.startEngine();
            for (int i = 10; i <= 1; i--) {
                System.out.println(i);
            }
            iStart.start();
        }
    }
}



