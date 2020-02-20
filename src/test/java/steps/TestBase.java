package steps;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;
import page.Main;
import page.User;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;
    public Main main;
    public User user;


    public void start() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        main = PageFactory.initElements(driver, Main.class);
        user = PageFactory.initElements(driver, User.class);
    }

    public void finish() {
        driver.quit();
    }

}
