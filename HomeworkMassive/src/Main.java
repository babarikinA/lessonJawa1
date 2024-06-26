//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] data = new int[8];
        int result = data.length;
        for (int index = 0; index < result; index++) {
            System.out.println(index);//внутри цикла сгенерировать случ число от 1 до 10 и присвоить его элементу массива
            int n = 8;
            System.out.println (Math.round(Math.random()*(n*2))-n);
        }//след задача заменить уже в заполненном массиве каждый элемент с нечетным индексом на 0.

    }
}