package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends BasePage {
    String SITE_URL = "https://testingcup.pgs-soft.com/";

    public Main(WebDriver driver) {
        super(driver);
    }

    public Main goTo() {
        driver.get(SITE_URL);
        return this;
    }

    public Main chooseTask(String taskNumber) {
        click(By.xpath("//h2[text()='Zadanie " + taskNumber + "']"));
        return this;
    }
}
