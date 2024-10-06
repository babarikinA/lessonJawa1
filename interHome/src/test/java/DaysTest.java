public class DaysTest {

    public static void main(String[] args) {
        Days[] days = Days.values(); //смотрел урок -- краснел с моих тупых вопросов , аналогия!
        String zapyataya = ", "; //создал по приколу -- получилось
        for (int i = days.length - 1; i >= 0; i--) { //по поводу цикла перебрал много всего, нуждаюсь в повторении!
            System.out.print(days[i] + zapyataya);//Сохраняю мой хороший код, будет вопрос
            // о том как перенести понедельник на новую строку
        }

    }

    static void checkDays(Days days) {
        System.out.println(days);
    }

    public void example1() {
        checkDays(Days.Mon);   // не должен быть тут, но повторял с урока !!
        checkDays(Days.Tue);
        checkDays(Days.Wed);
        checkDays(Days.Thu);
        checkDays(Days.Fri);
        checkDays(Days.Sat);
        checkDays(Days.Sun);

    }

    public void example2() {


    }
}
