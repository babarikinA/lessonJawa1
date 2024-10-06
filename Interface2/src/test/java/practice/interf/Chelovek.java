package practice.interf;

public class Chelovek {

    private Kyrtka kyrtka;
    private Shtani shtani;
    private Obyv obyv;

    public Chelovek(Kyrtka kyrtka, Shtani shtani, Obyv obyv) {
        this.obyv = obyv;
        this.shtani = shtani;
        this.kyrtka = kyrtka;
    }

    public void odet() {
        kyrtka.nadet();
        shtani.nadet();
        obyv.nadet();

    }

    public void razdet() {
        kyrtka.snat();
        shtani.snat();
        obyv.snat();

    }

}