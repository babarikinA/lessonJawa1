import java.util.ArrayList;
import java.util.List;

public class Tusk3Chech{

    public static void main(String[] args) {


        //создать динамический массив потоков - большие проблемы по коллекциям


        Tusk3 tusk3 = new Tusk3();
        Thread thread = new Thread(tusk3, "potok1");

        List<Thread> threads = new ArrayList<>();

        threads.size();

        if (threads.size()> 0){
            threads.get(0).start();
        }

    }

}
