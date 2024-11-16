package automatization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeTusk1 {

    private static final String url = String.format("file:///%s/src/test/resources/homeWork.html", System.getProperty("user.dir"));
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
    }

    @AfterEach
    void closeDriver() {
        driver.close();
    }

    @Test
    void getUrlAndWriteAllFieldsTest() {
        driver.get(url);

        By loginLocator = By.xpath("//input[@name='login']");
        By passwordLocator = By.xpath("//input[@name='password']");
        By commentLocator = By.xpath("//input[@name='comment']");
        By notesLocator = By.xpath("//input[@name='notes']");

        WebElement loginField = driver.findElement(loginLocator);
        WebElement passwordField = driver.findElement(passwordLocator);
        WebElement commentField = driver.findElement(commentLocator);
        WebElement notesField = driver.findElement(notesLocator);

        loginField.sendKeys("testing1");
        passwordField.sendKeys("testing2");
        commentField.sendKeys("testing3");
        notesField.sendKeys("testing4");

        String loginActualResult = loginField.getDomProperty("value");
        String passwordActualResult = passwordField.getDomProperty("value");
        String commentActualResult = commentField.getDomProperty("value");
        String notesActualResult = notesField.getDomProperty("value");

        Assertions.assertEquals("testing1", loginActualResult);
        Assertions.assertEquals("testing2", passwordActualResult);
        Assertions.assertEquals("testing3", commentActualResult);
        Assertions.assertEquals("testing4", notesActualResult);
    }

    @Test
    void getUrlWriteAllCheckBoxAndPenultimateFieldTest() {
        driver.get(url);

        By passwordLocator = By.xpath("//input[@name='password']");
        By notesLocator = By.xpath("//input[@name='notes']");
        By checkBoxSmsLocator = By.xpath("//label[@id='1']");

        WebElement passwordField = driver.findElement(passwordLocator);
        WebElement notesField = driver.findElement(notesLocator);
        WebElement smsCheckBox = driver.findElement(checkBoxSmsLocator);

        passwordField.sendKeys("testing2");
        notesField.sendKeys("testing4");

        String passwordActualResult = passwordField.getDomProperty("value");
        String notesActualResult = notesField.getDomProperty("value");
        String smsActualResult = smsCheckBox.getText();
        String currentTitle = driver.getTitle();

        Assertions.assertEquals("testing2", passwordActualResult);
        Assertions.assertEquals("testing4", notesActualResult);
        Assertions.assertEquals("Согласен на смс оповещения", smsActualResult);
        Assertions.assertEquals("Home Work Html Variant1", currentTitle);
    }

    @Test
    void getUrlWriteSecondCheckBoxAndLastFieldTest() {
        driver.get(url);

        By notesLocator = By.xpath("//input[@name='notes']");
        WebElement notesField = driver.findElement(notesLocator);
        notesField.sendKeys("testing4");
        String notesActualResult = notesField.getDomProperty("value");
        Assertions.assertEquals("testing4", notesActualResult);

        By rememberCheckBoxLocator = By.xpath("//input[@name='checkbox2']");
        WebElement rememberBox = driver.findElement(rememberCheckBoxLocator);
        rememberBox.click();
        boolean selected = rememberBox.isSelected();
        Assertions.assertTrue(selected);

        By rememberGoogleLocator = By.xpath("//input[@class]");
        WebElement rememberUrl = driver.findElement(rememberGoogleLocator);
        rememberUrl.click();
        String newUrl = driver.getCurrentUrl();
        Assertions.assertEquals("https://www.google.com/", newUrl);
        //xpected :https://www.google.com/
        //Actual   :https://www.google.com/?login=&password=&comment=&notes=testing4&checkbox2=on
    }
}
