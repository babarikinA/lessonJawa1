package practice.interf;

public class Chelovek implements Kyrtka, Shtani, Obyv {

    Kyrtka kyrtka = new Kyrtka() {
        @Override
        public void nadet() {
            System.out.println("Куртка надета");
        }

        @Override
        public void snat() {
            System.out.println("Куртка снята");
        }
    };
    Shtani shtani = new Shtani() {
        @Override
        public void nadet() {
            System.out.println("Штаны надеты");
        }

        @Override
        public void snat() {
            System.out.println("штаны сняты");
        }
    };
    Obyv obyv = new Obyv() {
        @Override
        public void nadet() {
            System.out.println("Обувь надета");
        }

        @Override
        public void snat() {
            System.out.println("Обувь снята");
        }
    };
    private String name;

    public String odetsya() {
        kyrtka.nadet();
        shtani.nadet();
        obyv.nadet();
        return "";
    }

    public String razdetsya() {
        kyrtka.snat();
        shtani.snat();
        obyv.snat();
        return "";
    }


    // Идея заставила меня сделать эти строчки которые находяться ниже!!! не понял зачем !!
    //Не понял значения слова "делаем несколько реализаций каждого интерфейса
    // так же не понял зачем делать поле Имя !
    // ситается ли полем класса следуюзие --- private boolean kyrtka; private boolean shtani; private boolean obyv;???
    @Override
    public void nadet() {

    }

    @Override
    public void snat() {

    }
}
//start interface practice tusk1 - 23:50

//finished interface practice tusk1 - 00:42 - without push