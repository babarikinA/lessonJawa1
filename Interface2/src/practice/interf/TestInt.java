package practice.interf;

public class TestInt {

    public static void main(String[] args) {
        AdidasKyrtka adidasKyrtka = new AdidasKyrtka();
        PumaShtani pumaShtani = new PumaShtani();
        NikeObyv nikeObyv = new NikeObyv();

        Chelovek chelovek = new Chelovek(adidasKyrtka, pumaShtani, nikeObyv);

        System.out.println(chelovek.odet());
        System.out.println(chelovek.razdet());

    }

}
