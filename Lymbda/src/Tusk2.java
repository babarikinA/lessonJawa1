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

        IBox boxRemover = (ArrayDeque<HeavyBox> b) ->

                b.poll().getWeight();


        System.out.println(boxRemover);




        // heavyBox.poll();


    }

}


