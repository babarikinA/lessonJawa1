public class Task extends User {
    void task1() {
        /*
        Как получить доступ к переопределенным методам родительского класса?
        Ответ не должен содержать запись new User().
        Менять любые классы запрещено, можно работать только внутри метода task1

        Ответ запишите ниже
        ....
         */
        super.goTo();
        super.stop();

    }

    public void goTo() {
        System.out.println("goTo method is override");
    }

    public void stop() {
        System.out.println("stop method is override");
    }
}
