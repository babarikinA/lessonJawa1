import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TuskCucu {

    private static ChromeOptions options;
    private static WebDriver driver;


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
        void closeBrowser () {
            driver.close();
        }
    }