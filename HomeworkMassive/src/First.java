public class First {
    public static void main(String[] args) {
        tusk1();
        Integer y = tusk2(-10);
        System.out.println(y);

    }

    public static Integer tusk2(Integer value) {
        System.out.println(value);
        int x = value;//
        if (x > 0) {
            x = x - 1;
        } else {
            if (x == 0) {
                x = 20;
            } else {
                x = x + 1;
            }
        }
        return x;
    }

    public static void tusk1() {
        System.out.println("hello java");
    }

}
