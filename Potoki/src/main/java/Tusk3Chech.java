import java.util.ArrayList;
import java.util.List;

public class Tusk3Chech {

    public static void main(String[] args) {


        //создать динамический массив потоков - большие проблемы по коллекциям


        Tusk3 tusk3 = new Tusk3();
        Thread thread = new Thread(tusk3, "potok1");
        Thread thread1 = new Thread(tusk3, "potok2");
        Thread thread2 = new Thread(tusk3, "potok3");
        Thread thread3 = new Thread(tusk3, "potok4");
        Thread thread4 = new Thread(tusk3, "potok5");

        List<Thread> threads = new ArrayList<>();
        threads.add(thread);
        threads.add(thread1);
        threads.add(thread2);
        threads.add(thread3);
        threads.add(thread4);

        threads.size();

        if (threads.size() > 0) {
            threads.get(0).start();
            threads.get(threads.size() - 2).start();
        }

    }

}
