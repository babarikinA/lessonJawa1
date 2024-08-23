package practice.interf;

public class Chelovek  {

    private Kyrtka kyrtka;
    private Shtani shtani;
    private Obyv obyv;

    AdidasKyrtka kyrtka1 = new AdidasKyrtka();
    PumaShtani shtani1 = new PumaShtani();
    NikeObyv obyv1 = new NikeObyv();

    public Chelovek(AdidasKyrtka kyrtka, PumaShtani shtani, NikeObyv obyv) {
        this.obyv = obyv;
        this.shtani = shtani;
        this.kyrtka = kyrtka;
    }

public String odetsya(){
        kyrtka1.odetsya();
        shtani1.odetsya();
        obyv1.odetsya();
        return "полностью одет";
}

public String razdtsya(){
        kyrtka1.razdetsya();
        shtani1.razdetsya();
        obyv1.razdetsya();
        return "полностью раздет";
    }
}
