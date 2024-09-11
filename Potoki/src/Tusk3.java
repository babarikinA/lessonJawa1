public class Tusk3 implements Runnable{


    @Override
    public void run() {
        System.out.println(String.format("Поток %s работает" , Thread.currentThread().getName()));
        try {
            Thread.sleep(1000/2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
