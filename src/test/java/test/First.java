package test;

import org.junit.jupiter.api.Test;

public class First extends TestBase {


    @Test
    public void firstTest() {

        main.goTo();
//                .chooseTask("1");
//        taskOne.checkPageIsCorrect();
        taskOne.scrollToElement("Kostka");

    }

    @Test
    public void firstTests() {

        main.goTo();
//                .chooseTask("1");
//        taskOne.checkPageIsCorrect();
        taskOne.scrollToElement("Kostka");

    }

}
