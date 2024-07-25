public abstract class Film {
    public String janr;
    public int cost;
    public int year;

    public String getJanr() {
        return janr;
    }

    public Film(String janr, int cost, int year) {
        this.janr = janr;
        this.cost = cost;
        this.year = year;



    }
}
