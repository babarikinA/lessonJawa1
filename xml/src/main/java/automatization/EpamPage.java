package automatization;

import org.openqa.selenium.WebDriver;

public class EpamPage implements Action<EpamPage> {

    private WebDriver driver;

    public EpamPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public EpamPage openUrl(String url) {
        driver.get(url);
        return this;
    }
}

