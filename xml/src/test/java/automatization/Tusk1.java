package automatization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;

public class Tusk1 {

    private static final String rootPath = System.getProperty("user.dir");

    @Test
    void example() throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        File file = new File(rootPath + "/src/test/java/automatization/employee.xml");
        EmployeeHandler handler = new EmployeeHandler();
        parser.parse(file, handler);

        int sizeArray = handler.getEmployees().size();
        String jobS = handler.getEmployees().get(sizeArray - 2).getJob();
        String jobF = handler.getEmployees().get(sizeArray - 1).getJob();

        Assertions.assertNotEquals(jobS, jobF);
    }

    @Test
    void example2 () throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        File file = new File(rootPath + "/src/test/java/automatization/employee.xml");
        Document document = builder.parse(file);

        NodeList element = document.getElementsByTagName("employee");
        int lastEmployee = element.getLength()-1;
        int secondEmployee = element.getLength()-2;
        int firstEmployee = element.getLength()-3;

        String job = element.item(lastEmployee).getAttributes().item(1).getNodeValue();
        String name = element.item(lastEmployee).getAttributes().item(2).getNodeValue();
        String url = element.item(lastEmployee).getAttributes().item(0).getNodeValue();
        System.out.println(job);
        System.out.println(name);
        System.out.println(url);

        Assertions.assertEquals("Senior",job);

    }
}
