package automatization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HomeTusk {

    private static final String url = "https://selenide.org/";
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
    void openBrowserItTest() {
        driver.get(url);
        By imageLocator = By.xpath("//img[@src='/images/selenide-logo-big.png']");
        WebElement kartinka = driver.findElement(imageLocator);
        String src = kartinka.getAttribute("src");

        boolean isPng = src.contains(".png");

        Assertions.assertTrue(isPng);
    }

    @Test
    void tuskOpen2() {
        driver.get(url);
        By docsLocator = By.xpath("//header//a[@href='/documentation.html']");
        WebElement pressDocs = driver.findElement(docsLocator);
        pressDocs.click();

        By splitterLocator = By.xpath("//h2[@id='use-the-power-of-ide']");
        WebElement splitterLoc = driver.findElement(splitterLocator);
        Actions actions = new Actions(driver);
        actions.moveToElement(splitterLoc);
        actions.perform();

        By link = By.xpath("//a[@href='/documentation/selenide-vs-selenium.html']");
        WebElement pressLink = driver.findElement(link);
        pressLink.click();

        By motivationLocator = By.xpath("//h2[@id='motivation']");
        WebElement viewMotivation = driver.findElement(motivationLocator);
        Assertions.assertTrue(viewMotivation.isDisplayed());

        String curUrl = driver.getCurrentUrl();
        Assertions.assertEquals("https://selenide.org/documentation/selenide-vs-selenium.html", curUrl);
    }

    @Test
    void tusk3() {
        driver.get(url);
        By docsLocator = By.xpath("//header//a[@href='/documentation.html']");
        WebElement pressDocs = driver.findElement(docsLocator);
        pressDocs.click();

        By splitterLocator = By.xpath("//h2[@id='use-the-power-of-ide']");
        WebElement splitterLoc = driver.findElement(splitterLocator);
        Actions actions = new Actions(driver);
        actions.moveToElement(splitterLoc);
        actions.perform();

        By methodAndToolsLocator = By.xpath("//a[@href='https://www.methodsandtools.com/tools/selenide.php']");
        WebElement pressMethodAndTools = driver.findElement(methodAndToolsLocator);
        pressMethodAndTools.click();
        switchToTab(driver);

        By locatorNavBarMenu = By.xpath("//div[@id='styletwo']//li");
        List<WebElement> elements = driver.findElements(locatorNavBarMenu);
        int pynkts = elements.size();
        Assertions.assertEquals(11, pynkts);

        String curUrl = driver.getCurrentUrl();
        Assertions.assertEquals("https://www.methodsandtools.com/tools/selenide.php", curUrl);
    }

    private void switchToTab(WebDriver driver) {
        for (String hendles : driver.getWindowHandles()) {
            driver.switchTo().window(hendles);
            if (driver.getCurrentUrl().equals("https://www.methodsandtools.com/tools/selenide.php")) {
                break;
            }
        }
    }
}