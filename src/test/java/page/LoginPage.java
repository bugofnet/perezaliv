package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage fillInLogin(String login){
        writeText(By.id("username"), login);
        return this;
    }

    public LoginPage fillInPassword(String password){
        writeText(By.name("password"), password);
        return this;
    }

    public LoginPage loginButtonClick(){
        click(By.xpath("//button[text()='Login']"));
        return this;
    }

    public LoginPage isLoginCorrect(){
        isElementDisplayed(By.id("logout"));
        return this;
    }

    public LoginPage checkAllElementsOnPagePresent(){
        isElementDisplayed(By.id("username"));
        isElementDisplayed(By.name("password"));
        isElementDisplayed(By.cssSelector(".btn-default.btn"));
        return this;
    }

    public LoginPage isLoginWrong(){
        isAlertText("Wrong credentials!");
        return this;
    }

    public void correctLogin(){
        fillInLogin("bugofnet");
        fillInPassword("1234Abcd@");
        loginButtonClick();
    }
}
