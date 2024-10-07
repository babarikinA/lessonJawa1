import java.util.ArrayDeque;

public class Tusk2 {

    public static void main(String[] args) {

        ArrayDeque<HeavyBox> heavyBox = new ArrayDeque<>();
        heavyBox.offer(new HeavyBox(100));
        heavyBox.offer(new HeavyBox(200));
        heavyBox.offer(new HeavyBox(300));
        heavyBox.offer(new HeavyBox(400));
        heavyBox.offer(new HeavyBox(500));

        IBox boxRemover = (boxes) -> {
            for (HeavyBox heavyBox1 : boxes) {
                boxes.poll();
            }
        };
        boxRemover.removeBox(heavyBox);
        System.out.println(heavyBox);
    }

}


