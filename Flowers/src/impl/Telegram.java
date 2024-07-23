package impl;

public class Telegram implements Desktop, Mobile {

    @Override
    public void sendMessage(){
        System.out.println("Send message from telegram...");

    }
    @Override
    public void getMessage(){
        System.out.println("Get message from telegram");
    }

}
