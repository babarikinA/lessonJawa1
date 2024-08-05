package Practice;

public class Task {
    public static void main(String[] args) {
        Voenii voenii = new Voenii("F16", 500,1600, 5000, 14,2, false, 30);
        Legkovoi legkovoi = new Legkovoi("bmw",160,280, 1100, 4, 10, "sedan", 4);
        Gryzovoi gryzovoi = new Gryzovoi("Kamaz", 300, 120, 3400, 12, 20, 3000);
        Transport transport = new Transport("Avto",24,220,1200);
        System.out.println(voenii.getMarka());
        System.out.println(transport.kalk());
        System.out.println(voenii.kalk());
        System.out.println(legkovoi.getMoshnost());
        System.out.println(legkovoi.kalk());
        System.out.println(gryzovoi.gryz());
        System.out.println(legkovoi.getDescription());
    }

}
