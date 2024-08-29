package homeWorkKollection;

public class Testing {

    public static void main(String[] args) {
        Tusk1 tusk1 = new Tusk1();//создаем объект класса Tusk1 под именем tusk1

        tusk1.task1();//вызываем метод нащего объекта в котором хранятся ключи

        // У нас выводится одно значение ключа так как метод task удалил второй ключ с таким же названием!

        Tusk2 tusk2 = new Tusk2();

        tusk2.metod1();//В цикле for перебираются ящики УЖЕ без предпоследнего ящика т/к он был удален , после iteratora!

       // tusk2.metod2();//тут я удалил все ящики с одинаковым весом просто через коллекцию Set которая позволяет удалять дубликаты !
    }

}
