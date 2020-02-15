package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskOne extends BasePage {
    public TaskOne(WebDriver driver) {
        super(driver);
    }

    public void checkPageIsCorrect() {
        isElementDisplayed(By.xpath("//li[text()='Zadanie 1']"));
    }

    public void scrollToElement(String element) {
//        WebElement webElement = driver.findElement(By.xpath("//h4[text()='" + element + "']"));
////        WebElement element = driver.findElement(By.id("my-id"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(webElement);
//        actions.perform();

//        this.executeJavaScriptFunction("arguments[0].scrollIntoView(true);", elementToBeViewable);
//        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
//        wait.until(ExpectedConditions.visibilityOf(elementToBeViewable));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
////        WebElement element = driver.findElement(By.xpath("xpath_Of_Element"));
//        js.executeScript("arguments[0].click();", webElement);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)", "");
    }
}


//    private List<String> productsList = Arrays.asList("Okulary", "Piłka", "Kubek", "Kabel", "Słuchawki",
//            "Kamera", "Aparat", "Poduszka", "Monitor", "Klawiatura", "Zeszyt", "Kostka");

//    @FindBy(xpath = "//li[text()='Zadanie 1']")
//    private WebElement pageHeaderTitle;

//    public TaskOne checkPageIsCorrect() {
//        isElementDisplayed(By.xpath("//li[text()='Zadanie 1']"));
//        isElementDisplayed(By.xpath("//h1[.='Wybierz produkt']"));
//        checkHowManyProductsOnPage();
//        return this;
//    }

//    public void checkPageIsCorrect(){
//        isElementDisplayed(pageHeaderTitle);
//    }

//    public TaskOne fieldAmountForProductEnterValue(String productName, String amount) {
//        writeText(By.xpath("//button[@data-product-name='" + productName + "']/../following-sibling::input"), amount);
//        return this;
//    }

//    public TaskOne fieldAmountForProductEnterValue(String productName, String amount, Keys key) {
//        for (int i = 1; i <= Integer.parseInt(amount); i++) {
//            writeText(By.xpath("//button[@data-product-name='" + productName + "']/../following-sibling::input"),
//            key);
//        }
//        return this;
//    }
//
//    public void checkHowManyProductsOnPage() {
//        List<String> products = new ArrayList<>();
//        for (int i = 1; i <= getListOfElements(By.xpath("//div[@class='caption']/h4")).size(); i++) {
//            products.add(driver.findElement(By.xpath("(//div[@class='caption']/h4)[" + i + "]")).getText());
//        }
//        assertTrue(products.containsAll(productsList));
//        assertEquals(12, products.size());
//    }
//
//    public TaskOne addProductButtonClick(String productName) {
//        click(By.xpath("//button[@data-product-name='" + productName + "']"));
//        return this;
//    }
//
//    public TaskOne checkBasketAmountForProduct(String product, String amount) {
////        String howMuch = driver.findElement(By.xpath("//span[@data-quantity-for='" + product + "']")).getText();
//        assertEquals(amount, readText(By.xpath("//span[@data-quantity-for='" + product + "']")));
//        return this;
//    }

