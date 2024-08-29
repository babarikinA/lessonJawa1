package homeWorkKollection;

import java.util.*;

public class Tusk2 {
    HeavyBox heavyBox = new HeavyBox(10);
    HeavyBox heavyBox2 = new HeavyBox(10);
    HeavyBox heavyBox3 = new HeavyBox(15);
    HeavyBox heavyBox4 = new HeavyBox(30);
    HeavyBox heavyBox5 = new HeavyBox(50);

    public void metod1() {

        List<HeavyBox> box = new ArrayList<>();
        box.add(heavyBox);
        box.add(heavyBox2);
        box.add(heavyBox3);
        box.add(heavyBox4);
        box.add(heavyBox5);


        Iterator<HeavyBox> iterator = box.iterator();//Первый способ получить массив содержпщий ящики из коллекции и вывести на консоль.
        while (iterator.hasNext()) {
            HeavyBox value = iterator.next();
            System.out.println(value);
        }

        box.remove(3);
        // box.remove(4);


        for (HeavyBox value : box) { //Второй способ получить массив содержпщий ящики из коллекции и вывести на консоль.
            System.out.println(value);
        }

        //нужно удалить предпоследний ящик lenght?

        int size = box.size() - 1;
        System.out.println(size); // получим индекс 4 - индекс последнего ящика

        int size2 = box.size() - 2;
        System.out.println(size2); // получим индекс 3 - индекс предпоследнего ящика

        // box.remove(3); //Удаляем ящик по 3 индексу// не рпботает т/к стоит в конце вывода

    }

    public void metod2() {

        Set<HeavyBox> box2 = new HashSet<>();
        box2.add(heavyBox);
        box2.add(heavyBox2);
        box2.add(heavyBox3);
        box2.add(heavyBox4);
        box2.add(heavyBox5);

        Iterator<HeavyBox> iterator = box2.iterator();//Первый способ получить массив содержпщий ящики из коллекции и вывести на консоль.
        while (iterator.hasNext()) {
            HeavyBox value = iterator.next();
            System.out.println(value);

        }

        for (HeavyBox value : box2) { //Второй способ получить массив содержпщий ящики из коллекции и вывести на консоль.
            System.out.println(value);
        }

    }
}
//Код set-treeset не работал - после переопределения метода иквелс хащсет все заработало!
//Нет понимая вывода значения ящиков !!почему идет - 50 - 10 - 30 - 15!есть баг
