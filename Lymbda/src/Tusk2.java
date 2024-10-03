import home.variant3.HeavyBox;

import java.util.ArrayDeque;
import java.util.function.Consumer;

public class Tusk2 {

    public static void main(String[] args) {

        ArrayDeque<HeavyBox> heavyBox = new ArrayDeque<>();
        heavyBox.offer(new HeavyBox(100));
        heavyBox.offer(new HeavyBox(200));
        heavyBox.offer(new HeavyBox(300));
        heavyBox.offer(new HeavyBox(400));
        heavyBox.offer(new HeavyBox(500));

        IBox removeBox = (HeavyBox) -> HeavyBox.getFirst().getWeight();
        System.out.println(removeBox);

      //  Consumer<IBox> boxConsumer = iBox -> iBox.removeBox(heavyBox.poll().toString());
      //  System.out.println(boxConsumer);

       // heavyBox.poll();

        System.out.println(heavyBox);

    }


}


//  Consumer<HeavyBox> heavyBoxConsumer = heavyBox -> removeBox(removeBox(heavyBox));


