package automatization;

import org.openqa.selenium.WebDriver;

public class ItransPage implements Action<ItransPage>{

    private WebDriver driver;

    public ItransPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public ItransPage openUrl(String url) {
        driver.get(url);
        return this;
    }
}
