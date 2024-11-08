package automatization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class EpamPage implements Action<EpamPage> {

    private WebDriver driver;

    public EpamPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public EpamPage openUrl(String url) {
        driver.get("https://www.itransition.com/");
        return this;
    }
}

