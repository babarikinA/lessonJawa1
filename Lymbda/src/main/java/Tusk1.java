public class Tusk1 {

    public static void main(String[] args) {

        IFunction calculator = (x, y) -> x / y;

        int result = calculator.getResult(10, 5);
        System.out.println(result);

    }

}