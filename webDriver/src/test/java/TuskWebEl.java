import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TuskWebEl {

    private static ChromeOptions options;
    private static String url = "https://www.jetbrains.com/";
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
    void Tusk1Test() throws InterruptedException {
        By coockieLocator = By.xpath("//button[@data-jetbrains-cookies-banner-action='ACCEPT_ALL']");
        Thread.sleep(5000);
        WebElement cookie = driver.findElement(coockieLocator);
        cookie.click();

        By developerToolsLocator = By.xpath("//button[@aria-label='Developer Tools: Open submenu']");
        WebElement tools = driver.findElement(developerToolsLocator);
        tools.click();

        By writerSideLocator = By.xpath("//div[@class='_mainSubmenu__content_6pz0jp_1']//a[@href='/writerside/']");
        WebElement writerSideButton = driver.findElement(writerSideLocator);
        writerSideButton.click();

        //
        By sdkText = By.xpath("SDK docs");
        Thread.sleep(10000);
        WebElement viewSdkText = driver.findElement(sdkText);
        boolean sdc = viewSdkText.isDisplayed();
        Assertions.assertTrue(sdc);
    }

    @Test
    void Tusk2Test() throws InterruptedException {
        driver.get(url);
        By coockieLocator = By.xpath("//button[@data-jetbrains-cookies-banner-action='ACCEPT_ALL']");
        Thread.sleep(5000);
        WebElement cookie = driver.findElement(coockieLocator);
        cookie.click();

        By developerToolsLocator = By.xpath("//button[@aria-label='Developer Tools: Open submenu']");
        WebElement tools = driver.findElement(developerToolsLocator);
        tools.click();

        By writerSideLocator = By.xpath("//div[@class='_mainSubmenu__content_6pz0jp_1']//a[@href='/writerside/']");
        WebElement writerSideButton = driver.findElement(writerSideLocator);
        writerSideButton.click();

        By ByPlayLocator = By.xpath("//button[@data-test='youtube-player-button']");
        WebElement playButton = driver.findElement(ByPlayLocator);
        playButton.click();

        By youTubeTitleLocator = By.xpath("//a[@data-sessionlink='feature=player-title']");

        WebElement iFrame = driver.findElement(By.xpath("//a[@data-sessionlink='feature=player-title']"));
        driver.switchTo().frame(iFrame);

        WebElement viewTitle = driver.findElement(youTubeTitleLocator);
        String seeTitle = viewTitle.getText();
        System.out.println(seeTitle);

    }

    @Test
    void Tusk3Test() throws InterruptedException {
        driver.get(url);
        By coockieLocator = By.xpath("//button[@data-jetbrains-cookies-banner-action='ACCEPT_ALL']");
        Thread.sleep(5000);
        WebElement cookie = driver.findElement(coockieLocator);
        cookie.click();

        By developerToolsLocator = By.xpath("//button[@aria-label='Developer Tools: Open submenu']");
        WebElement tools = driver.findElement(developerToolsLocator);
        tools.click();

        By writerSideLocator = By.xpath("//a[@href='/pycharm/']//span[@class='rs-text-2 rs-text-2_theme_light _mainSubmenuItem__title_fdawee_1 _mainSubmenuItem__titleWithLogo_fdawee_1']");
        WebElement writerSideButton = driver.findElement(writerSideLocator);
        writerSideButton.click();

        //a[@href='/pycharm/']//span[@class='rs-text-2 rs-text-2_theme_light _mainSubmenuItem__title_fdawee_1 _mainSubmenuItem__titleWithLogo_fdawee_1']


        ////a[@href='/pycharm/download/'] -- knopka ne zadizeiblena >?
    }


}
