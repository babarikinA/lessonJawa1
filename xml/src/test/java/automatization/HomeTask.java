package automatization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;

public class HomeTask {

    private static final String rootPath = System.getProperty("user.dir");

    @Test
    void task1() throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        File file = new File(rootPath + "/src/test/java/automatization/employee.xml");
        XmlHandler handler = new XmlHandler();
        parser.parse(file, handler);


    }

    @Test
    void example2() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder parser = factory.newDocumentBuilder();

        File file = new File(rootPath + "/src/test/java/automatization/employee.xml");
        Document document = parser.parse(file);

        Element rootElement = document.getDocumentElement();
        System.out.println(rootElement);
    }

}
