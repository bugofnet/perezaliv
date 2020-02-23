package dataproviderTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class testLogin {
    WebDriver driver;
    String SITE_URL = "http://127.0.0.1:8080/main.html";

    @BeforeMethod
    public void start(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void finish(){
        driver.quit();
    }

    @DataProvider(name = "LoginDataProvider")
    public Object [][] getData(){
        Object [][] data = {{"login_1","password_1"},{ "login_2","password_2"},{"login_3","password_3"}};
        return data;
    }

    @Test(dataProvider ="LoginDataProvider" )
    public void incorrectLogin(String lg, String ps){
        driver.get(SITE_URL);
        driver.findElement(By.id("username")).sendKeys(lg);
        driver.findElement(By.id("password")).sendKeys(ps);
        driver.findElement(By.id("save")).click();
        assertEquals("Wrong credentials!", driver.switchTo().alert().getText());
    }

    @DataProvider(name = "LoginExcelDataProvider")
    public Object[][] excelData() throws IOException {
        return new ReadXls().readExcel();
    }
    @Test(dataProvider = "LoginExcelDataProvider")
    public void incorrectCredentialsLogin(String lg, String ps){
        driver.get(SITE_URL);

        driver.findElement(By.id("username")).sendKeys(lg);
        driver.findElement(By.id("password")).sendKeys(ps);
        driver.findElement(By.id("save")).click();
        assertEquals("Wrong credentials!", driver.switchTo().alert().getText());
    }

    @Test(dataProvider = "LoginExcelDataProvider2", dataProviderClass = ReadXls.class)
    public void incorrectCredentialsLogin2(String lg, String ps){
        driver.get(SITE_URL);

        driver.findElement(By.id("username")).sendKeys(lg);
        driver.findElement(By.id("password")).sendKeys(ps);
        driver.findElement(By.id("save")).click();
        assertEquals("Wrong credentials!", driver.switchTo().alert().getText());
    }
}
