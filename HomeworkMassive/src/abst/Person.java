package abst;

public abstract class Person {
private String firtName;
private String lastName;

    public String getFirtName() {
        return firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(String firtName, String lastName){
        this.firtName =firtName;
                this.lastName = lastName;
    }

    public abstract void displeyInfo();
}
