package abst;

public class Client extends Person {
    private String bank;

    public Client(String firtName, String lastName) {
        super(firtName, lastName);
    }

    public void displayInfo(){
        System.out.println("client bank is"+ bank);
    }
}
