package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    //Wait Wrapper Method  by element located By
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }

    //Click Method by element located By
    public void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    //Is Element located By  Displayed
    public void isElementDisplayed(By elementBy) {
        waitVisibility(elementBy);
        assertTrue(driver.findElement(elementBy).isDisplayed());
    }

    public void waitForFilling(By elementBy){
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    //Write Text in field located By
    public void writeText(By elementBy, String text) {
        waitVisibility(elementBy);
        WebElement element = driver.findElement(elementBy);
        element.clear();
        element.sendKeys(text);
    }

    public void isElementNotDisplayed(By elementBy) {
//        assertFalse(driver.findElements(elementBy).size() > 0);
//        так смотрится луше ;)
        assertTrue(driver.findElements(elementBy).isEmpty());
    }
































//    //Click Method by WebElement
//    public void click(WebElement element) {
//        waitVisibility(element);
//        element.click();
//    }

    //Wait Wrapper Method by WebElement
//    public void waitVisibility(WebElement element) {
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }


//    //Is WebElement Displayed
//    public void isElementDisplayed(WebElement element) {
//        waitVisibility(element);
//        assertTrue(element.isDisplayed());
//    }

//    //Write Text in field located By
//    public void writeText(By elementBy, String text) {
//        waitVisibility(elementBy);
//        WebElement element = driver.findElement(elementBy);
//        element.clear();
//        element.sendKeys(text);
//    }

//    //Write Text in field with help of keyboard keys
//    public void writeText(By elementBy, Keys keys) {
//        waitVisibility(elementBy);
//        driver.findElement(elementBy).sendKeys(keys);
//    }
//
//    //Write Text in WebElement field
//    public void writeText(WebElement element, String text) {
//        waitVisibility(element);
//        element.clear();
//        element.sendKeys(text);
//    }
//
//    //Get List of elements located By
//    public List<WebElement> getListOfElements(By elementBy) {
//        return driver.findElements(elementBy);
//    }
//
//    //Read Text of element located by
//    public String readText(By elementBy) {
//        waitVisibility(elementBy);
//        return driver.findElement(elementBy).getText();
//    }
//
//    //Read Text of element WebElement
//    public String readText(WebElement element) {
//        waitVisibility(element);
//        return element.getText();
//    }
}
