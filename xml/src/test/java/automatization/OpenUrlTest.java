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
import java.util.List;

public class OpenUrlTest {

    private static final String rootPath = System.getProperty("user.dir");

    private static ChromeOptions options;
    private static List<Employee> employee;
    private WebDriver driver;

    @BeforeAll
    static void downloadDriver() throws ParserConfigurationException, SAXException, IOException {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        File file = new File(rootPath + "/src/test/java/automatization/employee.xml");
        EmployeeHandler handler = new EmployeeHandler();
        parser.parse(file, handler);

        employee = handler.getEmployees();
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
    void openBrowserItTest() {
        String firstUrl = employee.get(0).getUrl();
        ItransPage itransPage = new ItransPage(driver);
        itransPage = itransPage.openUrl(firstUrl);

        Assertions.assertEquals(firstUrl, driver.getCurrentUrl());
        Assertions.assertInstanceOf(ItransPage.class, itransPage);
    }

    @Test
    void openBrowserWgTest() {
        String wgUrl = employee.get(2).getUrl();
        WgPage wgPage = new WgPage(driver);
        wgPage = wgPage.openUrl(wgUrl);

        Assertions.assertEquals(wgUrl, driver.getCurrentUrl());
        Assertions.assertInstanceOf(WgPage.class, wgPage);
    }

    @Test
    void openBrowserEpaTest() {
        String epamUrl = employee.get(1).getUrl();
        EpamPage epPage = new EpamPage(driver);
        epPage = epPage.openUrl(epamUrl);

        Assertions.assertEquals(epamUrl, driver.getCurrentUrl());
        Assertions.assertInstanceOf(EpamPage.class, epPage);
    }
}
