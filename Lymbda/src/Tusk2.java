import com.sun.jmx.remote.internal.ArrayQueue;
import home.variant3.HeavyBox;
import home.variant3.IFunction;

import java.util.ArrayDeque;
import java.util.function.Consumer;

public class Tusk2 implements IBox {

    public static void main(String[] args) {

        ArrayDeque<HeavyBox> heavyBox = new ArrayDeque<>();
        heavyBox.offer(new HeavyBox(100));
        heavyBox.offer(new HeavyBox(200));
        heavyBox.offer(new HeavyBox(300));
        heavyBox.offer(new HeavyBox(400));
        heavyBox.offer(new HeavyBox(500));

        heavyBox.poll();

        System.out.println(heavyBox);

    }

    @Override
    public double removeBox(ArrayDeque<HeavyBox> heavyBox) {
        // должно быть так ->heavyBox.poll();
        return 0 ;
    }



}

  //  Consumer<HeavyBox> heavyBoxConsumer = heavyBox -> removeBox(removeBox(heavyBox));


