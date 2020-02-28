package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage {

    public UserPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "edit")
    private WebElement editButton;

    public void editButtonClick(){
        click(editButton);
    }
}
