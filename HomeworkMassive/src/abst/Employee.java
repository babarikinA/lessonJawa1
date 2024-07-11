package abst;

public class Employee extends Person {
    private String bank;

    public Employee(String firtName, String lastName) {
        super(firtName, lastName);
    }

    public void displayInfo(){
        System.out.println("Bank is"+ bank);
    }
}
