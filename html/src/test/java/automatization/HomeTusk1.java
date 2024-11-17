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

    private static final By locatorNotes = By.xpath("//input[@name='notes']");
    private static final By commentLocator = By.xpath("//input[@name='comment']");
    private static final By passwordLocator = By.xpath("//input[@name='password']");
    private static final By loginLocator = By.xpath("//input[@name='login']");



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

        WebElement loginField = driver.findElement(loginLocator);
        WebElement passwordField = driver.findElement(passwordLocator);
        WebElement commentField = driver.findElement(commentLocator);
        WebElement notesField = driver.findElement(locatorNotes);

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

        By checkBoxSmsLocator = By.xpath("//label[@id='1']");

        WebElement passwordField = driver.findElement(passwordLocator);
        WebElement notesField = driver.findElement(locatorNotes);
        WebElement smsCheckBox = driver.findElement(checkBoxSmsLocator);

        String passwordActualResult = passwordField.getText();
        String notesActualResult = notesField.getText();
        String smsActualResult = smsCheckBox.getText();
        String currentTitle = driver.getTitle();

        Assertions.assertEquals("Поле для пароля", passwordActualResult);
        Assertions.assertEquals("Поле для комментария", notesActualResult);
        Assertions.assertEquals("Согласен на смс оповещения", smsActualResult);
        Assertions.assertEquals("Home Work Html Variant1", currentTitle);
    }

    @Test
    void getUrlWriteSecondCheckBoxAndLastFieldTest() {
        driver.get(url);

        WebElement notesField = driver.findElement(locatorNotes);
        WebElement loginField = driver.findElement(loginLocator);
        WebElement passwordField = driver.findElement(passwordLocator);
        WebElement commentField = driver.findElement(commentLocator);

        notesField.sendKeys("testing4");

        String notesActualResult = notesField.getDomProperty("value");
        String loginActualResult = loginField.getDomProperty("value");
        String passwordActualResult = passwordField.getDomProperty("value");
        String commentActualResult = commentField.getDomProperty("value");

        Assertions.assertEquals("testing4", notesActualResult);
        Assertions.assertEquals("", loginActualResult);
        Assertions.assertEquals("", passwordActualResult);
        Assertions.assertEquals("", commentActualResult);

        By rememberCheckBoxLocator = By.xpath("//input[@name='checkbox2']");
        WebElement rememberBox = driver.findElement(rememberCheckBoxLocator);
        rememberBox.click();
        boolean selected = rememberBox.isSelected();

        By rememberCheckBoxLocator1 = By.xpath("//input[@name='checkbox1']");
        WebElement rememberBox1 = driver.findElement(rememberCheckBoxLocator1);
        boolean selected1 = rememberBox1.isSelected();

        Assertions.assertTrue(selected);
        Assertions.assertFalse(selected1);

        By rememberGoogleLocator = By.xpath("//input[@class]");
        WebElement rememberUrl = driver.findElement(rememberGoogleLocator);
        rememberUrl.click();
        String newUrl = driver.getCurrentUrl();
        Assertions.assertEquals("https://www.google.com/", newUrl);
    }
}
