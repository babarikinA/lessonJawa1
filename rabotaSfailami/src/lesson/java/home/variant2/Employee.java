package lesson.java.home.variant2;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = -4364626656486808842L;

        private String firstName;
        private String lastName;
        private transient int age;

        public Employee(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
