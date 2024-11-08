package automatization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class HomeTask {

    private static final String rootPath = System.getProperty("user.dir");

    @Test
    void task1() throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        File file = new File(rootPath + "/src/test/java/automatization/employee.xml");
        xmlHandler handler = new xmlHandler();
        parser.parse(file, handler);

        Assertions.assertEquals(6, 0);
    }

}
