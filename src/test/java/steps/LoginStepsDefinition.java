package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class LoginStepsDefinition extends TestBase {

    @Attachment(value = "Failed test screenshot")
    public byte[] attachScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Step("I go to main page")
    @Given("I go to main page")
    public void iGoToMainPage() {
        mainPage.goTo();
    }

    @Step("I login as {0} with password {1}")
    @And("I login as \"([^\"]*)\" with password \"([^\"]*)\"$")
    public void iLoginAsWithPassword(String login, String password) {
        loginPage.checkAllElementsOnPagePresent()
                .fillInLogin(login)
                .fillInPassword(password)
                .loginButtonClick();
    }

    @Step("Then I {0} link")
    @Then("I have (been|not been) successfully logged$")
    public void iShouldSeeTheLinkToDownloadFile(String visibility) {
        if(visibility.equals("been")){
            loginPage.isLoginCorrect();
        } else {
            loginPage.isLoginWrong();
        }
    }

    @Step("I login with correct credentials")
    @And("I login with correct credentials")
    public void iLoginWithCorrectCredentials() {
        loginPage.correctLogin();
    }

//    @When("I want to edit user profile")
//    public void iWantToEditUserProfile() {
//        userPage.editButtonClick();
//    }

}
