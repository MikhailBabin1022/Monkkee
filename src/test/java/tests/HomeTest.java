package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class HomeTest extends BaseTest {

    @Test("User open website")
    public void userOpensWebsite() {
        homePage.open();
        homePage.isPageOpen();

        assertTrue(homePage.isPageOpen());
    }

    @Test("")




}
