package automatization;

import org.openqa.selenium.WebDriver;

public class WgPage implements Action <WgPage>{

    private WebDriver driver;

    public WgPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public WgPage openUrl(String url) {
        driver.get(url);
        return this;
    }
}
