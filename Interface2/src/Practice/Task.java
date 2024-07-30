package Practice;

public class Task {
    public static void main(String[] args) {
        Voenii voenii = new Voenii("toyota", 13, 12, 43, false, 23);
        System.out.println(voenii.isKatapult());
        voenii.katapult();
    }



}
