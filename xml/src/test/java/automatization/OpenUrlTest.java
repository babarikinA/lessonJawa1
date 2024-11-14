package automatization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class OpenUrlTest {

    private static final String rootPath = System.getProperty("user.dir");

    private static ChromeOptions options;
    private WebDriver driver;

    @BeforeAll
    static void downloadDriver() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
    }

    @BeforeEach
    void openBrowser() {
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @AfterEach
    void closeBrowser() {
        driver.close();
    }

    @Test
    void openBrowserItTest() throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        File file = new File(rootPath + "/src/test/java/automatization/employee.xml");
        EmployeeHandler handler = new EmployeeHandler();
        parser.parse(file, handler);

        String firstUrl = handler.getEmployees().get(0).getUrl();
        driver.get(firstUrl);

        ItransPage itransPage = new ItransPage(driver);
        itransPage = itransPage.openUrl(firstUrl);

        Assertions.assertEquals(firstUrl, driver.getCurrentUrl());
        Assertions.assertInstanceOf(ItransPage.class, itransPage);
    }

    @Test
    void openBrowserWgTest() throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        File file = new File(rootPath + "/src/test/java/automatization/employee.xml");
        EmployeeHandler handler = new EmployeeHandler();
        parser.parse(file, handler);

        String wgUrl = handler.getEmployees().get(2).getUrl();
        driver.get(wgUrl);

        WgPage wgPage = new WgPage(driver);
        wgPage = wgPage.openUrl(wgUrl);

        Assertions.assertEquals(wgUrl, driver.getCurrentUrl());
        Assertions.assertInstanceOf(WgPage.class, wgPage);
    }

    @Test
    void openBrowserEpaTest() throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        File file = new File(rootPath + "/src/test/java/automatization/employee.xml");
        EmployeeHandler handler = new EmployeeHandler();
        parser.parse(file, handler);

        String epamUrl = handler.getEmployees().get(1).getUrl();
        driver.get(epamUrl);

        EpamPage epPage = new EpamPage(driver);
        epPage = epPage.openUrl(epamUrl);

        Assertions.assertEquals(epamUrl, driver.getCurrentUrl());
        Assertions.assertInstanceOf(EpamPage.class, epPage);
    }
}
