package automatization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
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

}
