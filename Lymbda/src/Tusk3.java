import home.variant3.HeavyBox;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Tusk3 {

    // бился пытался - в итоге набросал очень много
    // половину удалил - поэтому буду лепить из этого

    public static void main(String[] args) {
        Consumer<String> consumer2 = (HeavyBox) -> System.out.println(HeavyBox.toString());
        Consumer<HeavyBox> consumer = (heavyBox) -> {

            if (heavyBox.getWeight() > 300){
                System.out.println("HeavyBox weight is " + heavyBox.getWeight());
            }else {
                System.out.println("HeavyBox weight is < 300");
            }

        };

        consumer.accept(new HeavyBox(301));

        HeavyBox heavyBox = new HeavyBox(200);
        HeavyBox heavyBox1 = new HeavyBox(300);
        HeavyBox heavyBox2 = new HeavyBox(400);
        HeavyBox heavyBox3 = new HeavyBox(500);

        List<HeavyBox> heavyBoxes = new ArrayList<>();

        heavyBoxes.add(heavyBox);
        heavyBoxes.add(heavyBox1);
        heavyBoxes.add(heavyBox2);
        heavyBoxes.add(heavyBox3);

        Consumer<HeavyBox> consumer1 = () -> {

            if (heavyBoxes.getWeight() > 300){
                System.out.println("HeavyBox weight is " + heavyBoxes.getWeight());
            }else {
                System.out.println("HeavyBox weight is < 300");
            }

        };

    }

}
