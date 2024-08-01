package Practice;

public class Task {
    public static void main(String[] args) {
        Voenii voenii = new Voenii("toyota", 13, 12, 43, 12, 23, false, 42);
        System.out.println(voenii.isKatapult());
        voenii.katapult();
    }


}
