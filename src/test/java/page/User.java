package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class User extends BasePage {
    public User(WebDriver driver) {
        super(driver);
    }

    public User fillInLogin(String login){
        writeText(By.id("username"), login);
        return this;
    }

    public User fillInPassword(String password){
        writeText(By.name("password"), password);
        return this;
    }

    public User loginButtonClick(){
        click(By.xpath("//button[text()='Login']"));
        return this;
    }

    public User isLoginCorrect(){
        isElementDisplayed(By.id("logout"));
        return this;
    }

    public User checkAllElementsOnPagePresent(){
        isElementDisplayed(By.id("username"));
        isElementDisplayed(By.name("password"));
        isElementDisplayed(By.cssSelector(".btn-default.btn"));
        return this;
    }

    public User isLoginWrong(){
        isAlertText("Wrong credentials!");
        return this;
    }
}
