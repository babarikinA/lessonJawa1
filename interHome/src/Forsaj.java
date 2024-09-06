public class Forsaj extends Film implements FilmWithout, FilmsSubtat {
    public Forsaj(String janr, int cost, int year) {
        super(janr, cost, year);
    }

    @Override
    public void startMovieWithSubtat() {
    }

    public void startMovieWithout() {
    }

}
