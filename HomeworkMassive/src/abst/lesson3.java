package abst;

public class lesson3 {

    public static void main(String[] args) {
        Client client = new Client("Ivan","Petrov");
        Employee employee = new Employee("Oleg","Ivanov");
        client.displayInfo();
        employee.displayInfo();
        System.out.println(client.getLastName());
        System.out.println(employee.getLastName());
    }
}
