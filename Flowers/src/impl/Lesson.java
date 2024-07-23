package impl;

public class Lesson {
    public static void main(String[] args) {
        System.out.println( Printable.url );

        Desktop desktop = new Telegram();
        Client  client = new Client(desktop);

        Mobile mobile = new Telegram();

        Printer printer = new Printer();
        printer.print();

        Printable printable1 = new PrintForFabric();
        printable1.print();

        Printable printable2 = new Printer();
        printable2.print();
    }
}
