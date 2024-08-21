package practice.interf;

public class Chelovek implements Kyrtka, Shtani, Obyv {

    private Kyrtka kyrtka;
    private Shtani shtani;
    private Obyv obyv;

    public Chelovek(Obyv obyv, Shtani shtani, Kyrtka kyrtka) {
        this.obyv = obyv;
        this.shtani = shtani;
        this.kyrtka = kyrtka;
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