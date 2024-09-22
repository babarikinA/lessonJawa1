import home.variant3.IFunction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Tusk1 {

    public static void main(String[] args) {

        IFunction calculator = (x, y) -> x / y;

        int result = calculator.getResult(10, 5);
        System.out.println(result);

    }

}