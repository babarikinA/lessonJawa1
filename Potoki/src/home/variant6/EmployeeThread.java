package home.variant6;

public class EmployeeThread extends Thread {

    private static ThreadLocal<String> email = new ThreadLocal<>();

    public EmployeeThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        email.set("test@gmail.com" + Thread.currentThread().getId());
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("current thread with id %s have name %s with value is %s%n", Thread.currentThread().getId(), Thread.currentThread().getName(), email.get());
    }
}
