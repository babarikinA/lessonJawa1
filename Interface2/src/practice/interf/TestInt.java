package practice.interf;

public class TestInt {

    public static void main(String[] args) {
        AdidasKyrtka adidasKyrtka = new AdidasKyrtka();
        PumaShtani pumaShtani = new PumaShtani();
        NikeObyv nikeObyv = new NikeObyv();

        System.out.println(adidasKyrtka.razdetsya());
        System.out.println(pumaShtani.razdetsya());
        System.out.println(nikeObyv.razdetsya());

Chelovek chelovek = new Chelovek(adidasKyrtka, pumaShtani , nikeObyv);
chelovek.odetsya();
chelovek.razdtsya();
        System.out.println(chelovek.odetsya());
        System.out.println(chelovek.razdtsya());

    }

}
