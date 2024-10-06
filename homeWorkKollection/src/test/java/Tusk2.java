import java.util.*;

public class Tusk2 {
    HeavyBox heavyBox = new HeavyBox(45);
    HeavyBox heavyBox2 = new HeavyBox(20);
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

        for (HeavyBox value : box) { //Второй способ получить массив содержпщий ящики из коллекции и вывести на консоль.
            System.out.println(value);
        }

        box.get(0).setWeight(10);

        HeavyBox string = box.get(0);// задаем имя переменной в которой храниться box с индексом 0;

        box.get(1).setWeight(string.getWeight());// присваем box с индексом 1 переменную string, в которой храниться  box с индексом 0;

        int sizeAll = box.size();
        System.out.println(sizeAll);

        int size = box.size() - 1;
        System.out.println(size); // получим индекс 4 - индекс последнего ящика

        int size2 = box.size() - 2;
        System.out.println(size2); // получим индекс 3 - индекс предпоследнего ящика

        box.remove(size2); //Удаляем ящик по 3 индексу// не рпботает т/к стоит в конце вывода

        HeavyBox[] heavyBoxes = box.toArray(new HeavyBox[sizeAll]);//перевели нашу коллекцию в обычный массив!
        System.out.println("Массив: " + Arrays.toString(heavyBoxes));


        // Iterator<HeavyBox> iterator = box.iterator();//Первый способ получить массив содержпщий ящики из коллекции и вывести на консоль.
        //while (iterator.hasNext()) {
        //  HeavyBox value = iterator.next();
        // System.out.println(value);
        // }

        // HeavyBox[] massiv = box.toArray(new HeavyBox[3]);
        //  System.out.println(massiv);

        Set<HeavyBox> set = new LinkedHashSet<>(box);
        System.out.println(set);
        //   }

    }

}
//Код set-treeset не работал - после переопределения метода иквелс хащсет все заработало!
//Нет понимая вывода значения ящиков !!почему идет - 50 - 10 - 30 - 15!есть баг
