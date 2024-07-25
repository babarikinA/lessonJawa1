public class Printer implements Printable{
    @Override
    public void print() {
        System.out.println("Printer Exon is printed...");
    }

    @Override
    public void changeColor() {
        System.out.println("Change color to green");
    }
}
