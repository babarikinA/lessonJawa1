public class JanriiTest {
    public static void main(String[] args) {
        System.out.println(Janrii.ACTION.getDescription());
        System.out.println(Janrii.DETECTIVE.getDescription());
        System.out.println(Janrii.DRAMA.getDescription());//“Биография героя”
        System.out.println(Janrii.TRAGEDY.getDescription());
        System.out.println(Janrii.WESTERN.getDescription());
    }

    static void print(Janrii janrii) {
        System.out.println(janrii);
        System.out.println(janrii.getDescription());
        System.out.println(janrii.getFiletime());
    }

}
