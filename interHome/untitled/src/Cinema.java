public class Cinema {

    public void start(Film[] films) {
        for (int i = 0; i < films.length; i++) {
            Film film = films[i];
            System.out.println(" Цена - " + film.getCost() + " $");
            System.out.print("Год выпуска: " + film.getYear());
            System.out.print(" Жанр этого фильма: " + film.getJanr());
        }
        //1.создать геттер для каждого параметра класса фильм!!
        //2.внктри метода старт нужно получить информацию о каждом фильме.
        // Для этого массив который мы передаем внутрь этого метода,
        // должен обрабатываться циклом чтобы внутри
        // цикла по средством вызова геттеров получать информацию о каждом фильме и выводить ее в консоль.
    }

    public void startMovieWithout(Film[] films) {
        for (int i = 0; i < films.length; i++) {
            Film film = films[i];
            System.out.println("Цена - " + film.getCost() + " $");
            System.out.println("Год выпуска: " + film.getYear());
            System.out.println("Жанр этого фильма: " + film.getJanr());
        }
    }
}
