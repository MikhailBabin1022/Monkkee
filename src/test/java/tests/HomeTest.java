package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class HomeTest extends BaseTest {

    @Test(description = "Go to login page")
    public void userGoToLoginPage() {
        homePage.open()
        .clickLoginButton()
                .isPageOpen();
        assertTrue(loginPage.isPageOpen());
    }




}
