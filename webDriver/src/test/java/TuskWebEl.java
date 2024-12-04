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

public class TuskWebEl {

    private static final String url = "https://www.jetbrains.com/";
    private static ChromeOptions options;
    private WebDriver driver;

    @BeforeAll
    static void downloadDriver() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
    }

    @BeforeEach
    void setUpDriver() {
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @AfterEach
    void closeDriver() {
        driver.close();
    }

    @Test
    void sdkViewTest() {
        driver.get(url);
        By coockieLocator = By.xpath("//button[@data-jetbrains-cookies-banner-action='ACCEPT_ALL']");

        WebElement floatButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(coockieLocator));
        floatButton.click();

        By developerToolsLocator = By.xpath("//button[@aria-label='Developer Tools: Open submenu']");
        WebElement tools = driver.findElement(developerToolsLocator);
        tools.click();

        By writerSideLocator = By.xpath("//div[contains(@class, '_mainSubmenu__content_')]//a[@href='/writerside/']");
        WebElement writerSideButton = driver.findElement(writerSideLocator);
        writerSideButton.click();

        By sdkText = By.xpath("//span[@class='animated-list__item animated-list__item_shown']");
        WebDriverWait sdk = new WebDriverWait(driver, Duration.ofSeconds(15));

        Assertions.assertTrue(sdk.until(ExpectedConditions.textToBe(sdkText, "SDK docs")));
    }

    @Test
    void youTubeButtonTest() {
        driver.get(url);
        By coockieLocator = By.xpath("//button[@data-jetbrains-cookies-banner-action='ACCEPT_ALL']");
        WebElement floatButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(coockieLocator));
        floatButton.click();

        By developerToolsLocator = By.xpath("//button[@aria-label='Developer Tools: Open submenu']");
        WebElement tools = driver.findElement(developerToolsLocator);
        tools.click();

        By writerSideLocator = By.xpath("//div[contains(@class, '_mainSubmenu__content_')]//a[@href='/writerside/']");
        WebElement writerSideButton = driver.findElement(writerSideLocator);
        writerSideButton.click();

        By ByPlayLocator = By.xpath("//button[@data-test='youtube-player-button']");
        WebElement playButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(ByPlayLocator));
        playButton.click();
        playButton.isEnabled();

        By iFrameLocator = By.xpath("//iframe [@class='wt-youtube-player__player']");
        By youTubeTitleLocator = By.xpath("//a[text()='Getting Started With Writerside']");
        WebElement iFrameSwitch = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(iFrameLocator));
        driver.switchTo().frame(iFrameSwitch);

        WebElement youTubeText = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(youTubeTitleLocator));
        String title = youTubeText.getText();
        Assertions.assertEquals("Getting Started With Writerside", title);
    }

    @Test
    void pyCharmButtonTest() {
        driver.get(url);
        By coockieLocator = By.xpath("//button[@data-jetbrains-cookies-banner-action='ACCEPT_ALL']");

        WebElement floatButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(coockieLocator));
        floatButton.click();

        By developerToolsLocator = By.xpath("//button[@aria-label='Developer Tools: Open submenu']");
        WebElement tools = driver.findElement(developerToolsLocator);
        tools.click();

        By writerSideLocator = By.xpath("//a[@href='/pycharm/']//span[@class='rs-text-2 rs-text-2_theme_light _mainSubmenuItem__title_fdawee_1 _mainSubmenuItem__titleWithLogo_fdawee_1']");
        WebElement writerSideButton = driver.findElement(writerSideLocator);
        writerSideButton.click();

        By dizebledButton = By.xpath("//a[@href='/pycharm/download/']");
        WebElement buttonDizebled = driver.findElement(dizebledButton);
        boolean buttonOkay = buttonDizebled.isEnabled();
        Assertions.assertTrue(buttonOkay);
    }
}