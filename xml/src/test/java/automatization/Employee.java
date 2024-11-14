package automatization;

public class Employee {

    private final String name;
    private final String job;
    private final String url;

    public Employee(String name, String job, String url) {
        this.name = name;
        this.job = job;
        this.url = url;
    }

    public String getJob() {
        return job;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
