package page;

import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    String SITE_URL = "http://127.0.0.1:8080/main.html";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage goTo() {
        driver.get(SITE_URL);
        return this;
    }
}
