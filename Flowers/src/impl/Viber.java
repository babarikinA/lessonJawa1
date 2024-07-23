package impl;

public class Viber implements Desktop {
    @Override
    public void sendMessage() {
        System.out.println("Send message from Viber...");
    }

    @Override
    public void getMessage() {
        System.out.println("Get message from Viber");
    }
}
