package automatization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
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
    void example2() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        File file = new File(rootPath + "/src/test/java/automatization/employee.xml");
        Document document = builder.parse(file);

        NodeList element = document.getElementsByTagName("employee");
        int lastEmployee = element.getLength() - 1;

        String job = element.item(lastEmployee).getAttributes().item(1).getNodeValue();
        Assertions.assertEquals("Senior", job);
    }

    @Test
    void example3() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        File file = new File(rootPath + "/src/test/java/automatization/employee.xml");
        Document document = builder.parse(file);

        NodeList element = document.getElementsByTagName("employee");

        Node lastEmployee = element.item(element.getLength() - 1);
        NamedNodeMap attributes = lastEmployee.getAttributes();

        for (int i = 0; i < attributes.getLength(); i++) {
            if (attributes.item(i).getNodeName().equals("job")) {
                String nameEmployee = attributes.item(i).getNodeValue();

                Assertions.assertEquals("Senior", nameEmployee);
                break;
            }
        }
    }
}
