package test;

import org.junit.jupiter.api.Test;

public class TestSix extends TestBase {

    @Test
    public void loginWithCorrectCredentials(){

        main.goTo()
                .chooseTask("6");
        taskSix.checkAllElementsOnPagePresent()
                .fillInLogin("tester")
                .fillInPassword("123-xyz")
                .loginButtonClick()
                .isLoginCorrect();
    }
}
