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

    private static ChromeOptions options;
    private static final String url = "https://www.jetbrains.com/";
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
        WebElement playButton = driver.findElement(ByPlayLocator);
        playButton.click();
        playButton.isEnabled();

        By youTubeTitleLocator = By.xpath("//a[@data-sessionlink='feature=player-title']");


      //  - Нажмите кнопку 'Play' (На скрине img_5 вы под пунктом 1 элемент из этого шага).
      //  - Проверить, что заголовок видео 'Getting Started With Writerside' виден (На скрине img_2 вы найдёте под пунктом 1 элемент из этого шага).

       // WebElement iFrame = driver.findElement(By.xpath("//a[@data-sessionlink='feature=player-title']"));
        //driver.switchTo().frame(iFrame);

       // WebElement viewTitle = driver.findElement(youTubeTitleLocator);
        //String seeTitle = viewTitle.getText();
         //System.out.println(seeTitle);
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
        buttonDizebled.isEnabled();
    }
}