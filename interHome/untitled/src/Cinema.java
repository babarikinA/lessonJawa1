public class Cinema {



    public void start(Film[] films) {
         for (Film film: films);
         System.out.println("janr"+ films.getClass());
        System.out.println("cost"+ films.getClass());
        System.out.println("year"+films.getClass());
        //1.создать геттер для каждого параметра класса фильм!!
        //2.внктри метода старт нужно получить информацию о каждом фильме.
        // Для этого массив который мы передаем внутрь этого метода,
        // должен обрабатываться циклом чтобы внутри
        // цикла по средством вызова геттеров получать информацию о каждом фильме и выводить ее в консоль.
    }

    public void startMovieWithout(Film[] films) {

    }
}
