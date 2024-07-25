package xxx;

public class Lesson {
    public static void main(String[] args) {
        DayOffWeek[] dayOffWeeks = DayOffWeek.values();
        for (DayOffWeek dayOffWeek : dayOffWeeks) {
            System.out.println(dayOffWeek);

        }
    }

    static void checkDayOffWeek(DayOffWeek dayOffWeek) {
        System.out.println("En " + dayOffWeek);
        System.out.println("Ru " + dayOffWeek.getRulang());
    }

    void example1() {
        System.out.println(DayOffWeek.MONDAY.getTemperatyra());
        System.out.println(DayOffWeek.TUESDAY.getTemperatyra());
        System.out.println(DayOffWeek.WEDNESDAY.getTemperatyra());
        checkDayOffWeek(DayOffWeek.MONDAY);

    }
}
