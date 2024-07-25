package xxx;

public enum DayOffWeek {


    MONDAY("понедельник"),
    TUESDAY("вторник"),
    WEDNESDAY("среда") {
        @Override
        public String getTemperatyra() {
            return "холодно";
        }
    };


    private String rulang;


    DayOffWeek(String rulang) {
        this.rulang = rulang;
    }

    public String getRulang() {
        return rulang;
    }

    public String getTemperatyra() {
        return "Тепло";
    }
}
