package automatization;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class EmployeeHandler extends DefaultHandler {

    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (qName.equals("employee")) {
            String name = attributes.getValue("name");
            String job = attributes.getValue("job");
            String url = attributes.getValue("companySite");
            employees.add(new Employee(name, job, url));
        }
    }
}
