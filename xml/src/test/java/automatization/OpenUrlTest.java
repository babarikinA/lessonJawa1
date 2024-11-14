package automatization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenUrlTest {

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
    void openBrowserMistakeTest() {
        ItransPage itransPage = new ItransPage();
        itransPage = itransPage.openUrl(driver.getCurrentUrl());
        itransPage.openUrl(driver.getCurrentUrl());
        Assertions.assertEquals("https://www.itransition.com/", driver.getCurrentUrl());


      //  ItrasitionPage itransionPage = new ItrasitionPage();
      //  itransionPage = itransionPage .openUrl(сюда передаём спрашеный url сотрудника);
      //   Assertion.assertEquls("https://www.itransition.com/",  driver.getCurrentUrl);
      //   Assertion.assertInstanceOf(ItransitionPage.class, itransionPage)

    }

}
