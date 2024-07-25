public class Main {
    public static void main(String[] args) {

Anberlin anberlin = new Anberlin();
Apologize apologize = new Apologize();
IGotYou iGotYou = new IGotYou();

Smartphone smartphone = new Smartphone(iGotYou);
    }

    void example1 (){
        Printer printer = new Printer();
        printer.print();
        printer.changeColor();
        Printable.resetSettings();
    }
}