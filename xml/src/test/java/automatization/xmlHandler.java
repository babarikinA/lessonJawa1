package automatization;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class xmlHandler extends DefaultHandler {

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("open teg is " + qName);

        if (qName.equals("employee")) {
            String url = attributes.getValue("companySite");
            System.out.println(url);
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("Close tag is " + qName);
    }
}
