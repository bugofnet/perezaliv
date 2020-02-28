package steps;


import cucumber.api.java.en.When;

public class UserStepDefinition extends TestBase{

    @When("I want to edit user profile")
    public void iWantToEditUserProfile() {
        userPage.editButtonClick();
    }

}
