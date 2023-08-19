package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(description = "User logs in with valid data")
    public void inputValidCredentials() {
        LoginPage loginPage = new LoginPage();
        loginPage.open();
        loginPage.login("mislavik@tut.by", "8*!pDzuTH#75gYq");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isPageOpen());









    }
}






