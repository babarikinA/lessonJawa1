public class Flowers {
    public static int total;
    private String country;
    private double price;
    private Integer expired;

    public Flowers(String country, double price, Integer expired) {
        this.price = price;
        this.country = country;
        this.expired = expired;
        total = total + 1;
    }
}
