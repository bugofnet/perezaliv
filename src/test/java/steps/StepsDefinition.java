package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class StepsDefinition extends TestBase {
    @Before
    public void initialisation(){
        start();
    }

    @After
    public void teardown(Scenario scenario){
        if (scenario.isFailed()) {
            attachScreenshot();
        }
        finish();
    }

    @Attachment(value = "Failed test screenshot")
    public byte[] attachScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Step("I go to main page")
    @Given("I go to main page")
    public void iGoToMainPage() {
        main.goTo();
    }

    @Step("I login as {0} with password {1}")
    @And("I login as {string} with password {string}")
    public void iLoginAsWithPassword(String login, String password) {
        user.checkAllElementsOnPagePresent()
                .fillInLogin(login)
                .fillInPassword(password)
                .loginButtonClick();
    }

    @Step("Then I {0} link")
    @Then("I have (been|not been) successfully logged$")
    public void iShouldSeeTheLinkToDownloadFile(String visibility) {
        if(visibility.equals("been")){
            user.isLoginCorrect();
        } else {
            user.isLoginWrong();
        }
    }

}
