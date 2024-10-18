import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.Set;

public class Lesson {

    private static ChromeOptions chromeOptions;

    private WebDriver driver;

    @BeforeAll
    static void loadDriver(){
        WebDriverManager.chromedriver().clearDriverCache().setup();
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
    }

    @BeforeEach
    void startBrowser(){
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @AfterEach
    void closeBrowser(){
        driver.quit();
    }

    @Test
    void switchToFrameTest(){
        driver.get("https://demo.guru99.com/test/guru99home/");

        WebElement iFrame = driver.findElement(By.xpath("//iframe[contains(@src, 'https://www.youtube.com/')]"));

        driver.switchTo().frame(iFrame);

        By playLocator = By.xpath("//button[@aria-label='Смотреть']");
        WebElement playBtn = driver.findElement(playLocator);
        Assertions.assertTrue(playBtn.isDisplayed());
    }

    @Test
    void actionsWithWindow(){
        driver.get("https://demo.guru99.com/test/guru99home/");
        String descriptorCurrentWindow = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.WINDOW).get("https://google.com");

        System.out.println(descriptorCurrentWindow);

        Set<String> decriptorList = driver.getWindowHandles();

        Assertions.assertEquals(2, decriptorList.size());

        driver.switchTo().window(descriptorCurrentWindow);

        Assertions.assertEquals("Demo Guru99 Page", driver.getTitle());

        System.out.println();
    }

    @Test
    void findElementsByDifferentWaysTest(){
        driver.navigate().to("https://selenide.org");
        By locator = By.xpath("//div[@class='short wiki']//h3");

        WebElement element = driver.findElement(locator);
        List<WebElement> elements = driver.findElements(locator);
        WebElement elementViaJs =(WebElement) ((JavascriptExecutor) driver).executeScript("return document.querySelector('div.short.wiki > div > h3') ");

        Assertions.assertEquals(element.getText(),"What is Selenide?".toUpperCase());
        Assertions.assertEquals(elements.get(0).getText(),"What is Selenide?".toUpperCase());
        Assertions.assertEquals(elementViaJs.getText(),"What is Selenide?".toUpperCase());
    }

    @Test
    void navigationTest(){
        driver.get("https://google.com");
        driver.navigate().to("https://google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

}
