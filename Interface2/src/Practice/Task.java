package Practice;

public class Task {
    public static void main(String[] args) {
        Voenii voenii = new Voenii("F16", 500, 1600, 5000, 14, 2, false, 30);
        Legkovoi legkovoi = new Legkovoi("bmw", 160, 280, 1100, 4, 10, "sedan", 4, 5000, 1);
        Gryzovoi gryzovoi = new Gryzovoi("Kamaz", 300, 120, 3400, 12, 20, 3000, 1000, 1);
        Grazdanski grazdanski = new Grazdanski("Boeing", 400, 1000, 7000, 28, 4, 300, true);
        Transport transport = new Transport("Avto", 24, 220, 1200);
        System.out.println(voenii.getMarka());
        System.out.println(transport.kalk());
        System.out.println(voenii.kalk());
        System.out.println(legkovoi.getMoshnost());
        System.out.println(legkovoi.kalk());
        // System.out.println(gryzovoi.gryz());// когда поменял на метод воид перестала запускаться - закомитил
        System.out.println(legkovoi.getDescription());
        System.out.println(gryzovoi.getDescription());
        System.out.println(grazdanski.getDescription());
        System.out.println(voenii.getDescription());
    }

}
