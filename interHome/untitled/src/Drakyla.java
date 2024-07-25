public class Drakyla extends Film implements FilmWithout, FilmsSubtat {

    public Drakyla(String janr, int cost, int year) {
        super(janr, cost, year);
    }

    @Override
    public void startMovieWithSubtat() {
    }

    public void startMovieWithout() {
    }
}
