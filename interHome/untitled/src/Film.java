public abstract class Film {
    private String janr;
    private int cost;
    private int year;

    public String getJanr() {
        return janr;
    }
    public int getCost(){return cost; }
    public int getYear(){return year; }

    public Film(String janr, int cost, int year) {
        this.janr = janr;
        this.cost = cost;
        this.year = year;



    }
}
