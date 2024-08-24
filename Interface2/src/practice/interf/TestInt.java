package practice.interf;

public class TestInt {

    public static void main(String[] args) {
        Kyrtka adidasKyrtka = new AdidasKyrtka();
        Shtani pumaShtani = new PumaShtani();
        Obyv nikeObyv = new NikeObyv();

        Chelovek chelovek = new Chelovek(adidasKyrtka, pumaShtani, nikeObyv);

        chelovek.odet();

        chelovek.razdet();

    }

}
