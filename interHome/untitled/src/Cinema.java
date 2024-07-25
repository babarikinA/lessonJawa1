public class Cinema implements FilmWithout, FilmsSubtat {

    @Override
    public void startMovieWithSubtat() {
        Forsaj f = new Forsaj("boevik", 10, 1999);
        Drakyla d = new Drakyla("horror", 7, 1995);
        Titanic t = new Titanic("dramma", 15, 1999);
        EastExpress e = new EastExpress("detectiv", 5, 2007);

        Film[] data1 = new Film[4];
        data1[0] = f.year,f.cost,f.janr;
        data1[1] = d.year,d.cost,d.janr;
        data1[2] = t.year,t.cost,t.janr;
        data1[3] = e.year,e.cost,e.janr;
        System.out.println(f);


        Film[] data1 = new Film[4];
        data1[0] = f;
        data1[1] = d;
        data1[2] = t;
        data1[3] = e;
    }

    public void startMovieWithout() {

    }
}
