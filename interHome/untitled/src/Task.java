public class Task {
    public static void main(String[] args) {
        Forsaj f = new Forsaj("boevik", 10, 1999);
        Drakyla d = new Drakyla("horror", 7, 1995);
        Titanic t = new Titanic("dramma", 15, 1999);
        EastExpress e = new EastExpress("detectiv", 5, 2007);


        Film[] data1 = new Film[4];
        data1[0] = f;
        data1[1] = d;
        data1[2] = t;
        data1[3] = e;

        System.out.println(f);
        System.out.println(d);
        System.out.println(t);
        System.out.println(e);
    }
}
