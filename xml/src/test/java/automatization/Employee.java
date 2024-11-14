package automatization;

public class Employee {

private String name;
private String job;
private String url;

    public String getName() {
        return name;
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

    public Employee(String name, String job, String url) {
        this.name = name;
        this.job = job;
        this.url = url;
    }
}
