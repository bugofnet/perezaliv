package steps;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestBase {
    @Before
    public void initialisation(){
        start();
    }

    @After
    public void teardown(Scenario scenario){
        if (scenario.isFailed()) {
//            attachScreenshot();
        }
        finish();
    }
}
