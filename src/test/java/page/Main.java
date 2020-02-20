package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends BasePage {
    String SITE_URL = "http://127.0.0.1:8080/main.html";

    public Main(WebDriver driver) {
        super(driver);
    }

    public Main goTo() {
        driver.get(SITE_URL);
        return this;
    }
}
