package automatization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverHomeWork {

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
    void sdkDocsTest() {
             /*
        Вам надо разработать 1 тест, сценарий для этого теста я вам уже придумал и запишу ниже.
        Шаги:
         1- Развернуть окно браузера на весь экран
         2- Перейдите на сайт https://www.jetbrains.com/
         3- Кликнуть на выпадающий список 'Developer Tools' в навигационном меню сайта
         4- Кликнуть по пункту меню 'Writerside'
         5- Проверить, что текст 'SDK docs' виден
        */

        //1,2,3 step
        driver.get("https://www.jetbrains.com/");
        By developerToolsLocator = By.xpath("//button[@aria-label='Close main menu']");
        WebElement devToolButton = driver.findElement(developerToolsLocator);
        devToolButton.click();

        //4 step
        By writerSideLocator = By.xpath("");
        WebElement writerSideButton = driver.findElement(writerSideLocator);// //a[@href='/writerside/']
        writerSideButton.click();

        //5 step
        By sdkText = By.xpath("");
        WebElement viewSdkText = driver.findElement(sdkText);
        String seeSdkText = viewSdkText.getAttribute("id");
        boolean iCanSee = seeSdkText.contains("//");
        Assertions.assertTrue(iCanSee);
    }
    //первый тест
    // не сделал шаг 4 так как не смог найти кнокпу! - дописать локацию в 54 строку
    // не сделал шаг 5 не могу понять что искать!(может быть некоректное условие) - дописать локацию в 59 строку

    @Test
    void youTubeButtonTest() {
        /*
        Вам надо разработать 1 тест, сценарий для этого теста я вам уже придумал и запишу ниже.
        Шаги:
         - 1Развернуть окно браузера на весь экран
         - 2Перейдите на сайт https://www.jetbrains.com/
         - 3Кликнуть на выпадающий список 'Developer Tools' в навигационном меню сайта
         - 4Кликнуть по пункту меню 'Writerside'
         - 5Нажмите кнопку 'Play'
         - 6Проверить, что заголовок видео 'Getting Started With Writerside'
         */

        //1,2,3 step
        driver.get("https://www.jetbrains.com/");
        By developerToolsLocator = By.xpath("//button[@aria-label='Close main menu']");
        WebElement devToolButton = driver.findElement(developerToolsLocator);
        devToolButton.click();

        // 4 step
        By writerSideLocator = By.xpath("");
        WebElement writerSideButton = driver.findElement(writerSideLocator);
        writerSideButton.click();


        // 5 step
        By ByPlayLocator = By.xpath("//button[@data-test='youtube-player-button']");
        WebElement playButton = driver.findElement(ByPlayLocator);
        playButton.click();

        //6 step
        By youTubeTitleLocator = By.xpath("//a[@data-sessionlink='feature=player-title']");
        WebElement viewTitle = driver.findElement(youTubeTitleLocator);
        String seeTitle = viewTitle.getAttribute("");//help with evaluate later!
        boolean iCanSee = seeTitle.contains("Getting");
        Assertions.assertTrue(iCanSee);
    }
    //Второй тест
    // не сделал шаг 4 так как не смог найти кнокпу! - дописать локацию в 89 строку
    // не сделал шаг 6 прогнать через Дебаг и вписать атрибут в 102 строку

    @Test
    void pyCharmMenuTest() {
        /*
        Вам надо разработать 1 тест, сценарий для этого теста я вам уже придумал и запишу ниже.
        Шаги:
         - 1 Развернуть окно браузера на весь экран
         - 2 Перейдите на сайт https://www.jetbrains.com/
         - 3 Кликнуть на выпадающий список 'Developer Tools'
         - 4 Кликнуть по пункту меню 'PyCharm'
         - 5 Проверить, что кнопка 'Download' не задизейблена.
         */

        //1,2,3 steps
        driver.get("https://www.jetbrains.com/");
        By developerToolsLocator = By.xpath("//button[@aria-label='Close main menu']");
        WebElement devToolButton = driver.findElement(developerToolsLocator);
        devToolButton.click();

        // 4- Кликнуть по пункту меню 'PyCharm'
        // 5- Проверить, что кнопка 'Download' не задизейблена
    }
}
