public class Tusk1 implements Runnable{

    public Tusk1 () {
        on = true;
    }

    //Невозможно сделать так как у нас интерфейс и в нем нету конструктора - выводить в поток имя текущего потока
    @Override
    public void run() {
        System.out.println(String.format("Поток %s работает" , Thread.currentThread().getName()));

        while (!Thread.currentThread().isInterrupted()){
            System.out.println("sasha");
        }

        System.out.println(String.format("Поток %s не работает.", Thread.currentThread().getName()));

    }
}
