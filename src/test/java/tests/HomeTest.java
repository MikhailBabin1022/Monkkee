package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class HomeTest extends BaseTest {

    @Test(description = "Click to Login Page")
    public void goToLoginPage() {
        homePage.open()
                .clickLoginButton()
                .isPageOpen();
        assertTrue(loginPage.isPageOpen());

    }

}







