import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) { //начинает обрабатывать с 0 массива и до конечного array.length
            array[i] = (int) (Math.random() * 10);// не доконца понял внутри ковычек [i]
            System.out.println((array[i]) + 1);//заработало(от 1 до 10 когда добавил +1)
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
        }
        //нужно вывести массив в строку
        System.out.println(Arrays.toString(array));//теперь массив выводиться в строку 1 раз
        //исправил так как {саут был в теле цикла}
        // не трогать все работает успешно!!!!
        // Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на отдельной строке!!!

        //  System.out.println("sd");
        //  }
    }
}
