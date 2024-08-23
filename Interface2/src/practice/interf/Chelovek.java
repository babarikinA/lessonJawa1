package practice.interf;

public class Chelovek {

    private Kyrtka kyrtka;
    private Shtani shtani;
    private Obyv obyv;

    public Chelovek(AdidasKyrtka kyrtka, PumaShtani shtani, NikeObyv obyv) {
        this.obyv = obyv;
        this.shtani = shtani;
        this.kyrtka = kyrtka;
    }

    public String odet() {
        kyrtka.nadet();
        shtani.nadet();
        obyv.nadet();
        return "Одежда одета";
    }

    public String razdet() {
        kyrtka.snat();
        shtani.snat();
        obyv.snat();
        return "Одежда снята";
    }

}