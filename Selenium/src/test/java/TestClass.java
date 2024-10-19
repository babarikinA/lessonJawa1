import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClass {

    private static ChromeOptions options;
    private WebDriver driver;

    @BeforeAll
    static void downloadDriver() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        options = new ChromeOptions();        // этот объект сохдается только 1 раз
        options.addArguments("--remote-allow-origins=*");
    }

    @BeforeEach
    void openBrowser() {
        driver = new ChromeDriver(options);//на каждый тест новое открытие браузера!бест практис!
        driver.manage().window().maximize();
    }

    @AfterEach
    void closeBrowser() {
        driver.close();
    }

    @Test
    void openBrowserTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openUrl("https://ru.selenide.org/index.html");

        driver.get("https://ru.selenide.org/index.html");

        Assertions.assertEquals("https://ru.selenide.org/index.html", driver.getCurrentUrl());

    }
}
