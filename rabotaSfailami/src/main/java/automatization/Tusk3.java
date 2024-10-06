package automatization;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Tusk3 {

    private static final String basePath = System.getProperty("user.dir");

    public void metod1() {

        Employee employee = new Employee("alex", "babarik", 28);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(new Employee("vova", "popov", 27));
        employees.add(new Employee("dima", "ivanov", 25));

        try (FileOutputStream fileOutputStream = new FileOutputStream(basePath + "/src/");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(employees);
        } catch (IIOException e) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void metod2() {

        List<Employee> resultList = new ArrayList<>();

        try (FileInputStream fileInputStream = new FileInputStream(basePath + "/src/employee.dat");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            resultList = (List<Employee>) objectInputStream.readObject();
        } catch (Exception e) {

        }

        for (int i = 0; i < resultList.size(); i++) {

            char symbol = (char) resultList.size();

            System.out.println(symbol);

        }

    }

}
