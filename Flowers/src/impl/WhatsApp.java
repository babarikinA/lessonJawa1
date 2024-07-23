package impl;

public class WhatsApp implements Desktop {
    @Override
    public void sendMessage() {
        System.out.println("Send message from WhatsApp");
    }

    @Override
    public void getMessage() {
        System.out.println("Get message from WhatsApp");
    }
}
