public class Lesson {
    public static void main(String[] args) {
        Person client = new Client("Pasha");

        Person employee = new Employee("Sasha");

        Person person = new Person("Dima");

        ((Client) client).setBankName("Belarusbank");
        System.out.println(((Client) client).getBankName());

    }
}
