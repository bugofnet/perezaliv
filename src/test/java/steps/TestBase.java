package steps;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;
import page.LoginPage;
import page.MainPage;
import page.UserPage;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;
    public MainPage mainPage;
    public LoginPage loginPage;
    public UserPage userPage;


    public void start() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        mainPage = PageFactory.initElements(driver, MainPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        userPage = PageFactory.initElements(driver, UserPage.class);
    }

    public void finish() {
        driver.quit();
    }



}
