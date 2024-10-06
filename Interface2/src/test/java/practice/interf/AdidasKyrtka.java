package practice.interf;

public class AdidasKyrtka implements Kyrtka {

    @Override
    public void snat() {
        System.out.println("Куртка Adidas снята");
    }

    @Override
    public void nadet() {
        System.out.println("Куртка Adidas одета");
    }

}
