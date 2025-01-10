import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
    void closeBrowser() {
        driver.close();
    }

    @Test
    void tusk1Test() {
        driver.get("https://www.jenkins.io/");
        By jenkinsPicLocator = By.xpath("//img[@src='/images/logos/jenkins/jenkins.png']");
        WebElement jenkinsView = new WebDriverWait(driver, Duration.ofSeconds(25))
                .until(ExpectedConditions.visibilityOfElementLocated(jenkinsPicLocator));

        String jetKins = jenkinsView.getAttribute("src");
        boolean pngJet = jetKins.contains(".png");

        Assertions.assertTrue(pngJet);
        Assertions.assertTrue(jenkinsView.isDisplayed());
    }

    @Test
    void tusk2Test() {
        driver.get("https://rest-assured.io/");
        By docsLocator = By.xpath("//nav//a[@href='#docs']");
        WebElement clickDocs = driver.findElement(docsLocator);
        clickDocs.click();

        By gettingStartLocator = By.xpath("//li//a[@href='https://github.com/rest-assured/rest-assured/wiki/GettingStarted']");
        WebElement clickStart = driver.findElement(gettingStartLocator);

        String ano = clickStart.getText();
        System.out.println(ano);

        Assertions.assertTrue(clickStart.isDisplayed());

        //String curUrl = driver.getCurrentUrl();
        //Assertions.assertEquals("https://github.com/rest-assured/rest-assured/wiki/GettingStarted", curUrl);

    }

    @Test
    void tusk3Test() {
        driver.get("https://rest-assured.io/");
        By docsLocator = By.xpath("//nav//a[@href='#docs']");
        //a[@href='https://github.com/rest-assured/rest-assured/wiki/Downloads']-- downloads button!!!
    }

}