//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tusk1 tusk1 = new Tusk1();
        Thread thread = new Thread(tusk1, "potok1");
        thread.start();

        try {
            Thread.sleep(2000);
            thread.interrupt();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Program exit");

    }
}