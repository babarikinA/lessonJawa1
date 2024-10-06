import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Tusk3 {

    // бился пытался - в итоге набросал очень много
    // половину удалил - поэтому буду лепить из этого

    public static void main(String[] args) {

        List<HeavyBox> heavyBoxes = new ArrayList<>();

        HeavyBox heavyBox = new HeavyBox(200);
        HeavyBox heavyBox1 = new HeavyBox(300);
        HeavyBox heavyBox2 = new HeavyBox(400);
        HeavyBox heavyBox3 = new HeavyBox(500);

        heavyBoxes.add(heavyBox);
        heavyBoxes.add(heavyBox1);
        heavyBoxes.add(heavyBox2);
        heavyBoxes.add(heavyBox3);

        Consumer<HeavyBox> consumer2 = heavyBox4 -> System.out.println(heavyBox4.toString());
        Consumer<HeavyBox> consumer = heavyBox4 -> {
            if (heavyBox4.getWeight() > 300) {
                System.out.println("HeavyBox weight is " + heavyBox4.getWeight());
            }

        };
        // спасибо чату gpt за строки ниже
        Consumer<HeavyBox> consumer1 = consumer.andThen(consumer2);
        for (HeavyBox heavyBox4 : heavyBoxes) {
            consumer1.accept(heavyBox4);

        }
    }

}
