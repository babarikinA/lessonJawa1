public enum Janrii {

    ACTION(90),
    WESTERN(123),
    TRAGEDY(150),
    DETECTIVE(98),
    DRAMA(140) {
        @Override
        public String getDescription() {
            return "Биография героя";
        }
    };

    private int filetime;

    Janrii(int filetime) {
        this.filetime = filetime;
    }

    public int getFiletime() {
        return filetime;
    }

    public String getDescription() {
        return "Художественный фильм";

    }
}
