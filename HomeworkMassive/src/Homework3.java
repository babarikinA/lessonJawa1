public class Homework3 {
    public static void main(String[] args) {
        int x = -5;
        if (x <= 0) {
            if (x == 0) {
                x = 10;
            } else {
                x = x-2;
            }
        } else {
            x= x + 1;
        }
        System.out.println(x);
    }
}