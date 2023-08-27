package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

        @Test(description = "User validate login and password")
        public void inputValidDataUserAndPassword() {
                loginPage.open();
                loginPage.inputLoginAndPassword("hsaat@mailto.plus", "BC12345WGHHGHGHGHGHVG");
                loginPage.clickLoginButton();
                Assert.assertTrue(loginPage.isPageOpen());
        }

        @Test(description = "User enters invalid data")
        public void inputInvalidDataUserAndPassword() {
                loginPage.open();
                loginPage.inputLoginAndPassword("wewewew", "wewewewew");
                loginPage.clickLoginButton();
                Assert.assertEquals(loginPage.getErrorMessage(), "Login_failed");

        }

        @Test(description = "User did not enter a password")
        public void inputNotPassword() {
                loginPage.open();
                loginPage.inputLoginAndPassword("hsaat@mailto.plus", "");
                loginPage.clickLoginButton();
                Assert.assertEquals(loginPage.getErrorMessage(), "Mandatory field");
        }

        @Test(description = "The user has not entered a login")
        public void inputNotEnteredLogin() {
                loginPage.open();
                loginPage.inputLoginAndPassword("", "BC12345WGHHGHGHGHGHVG");
                loginPage.clickLoginButton();
                Assert.assertEquals(loginPage.getErrorMessage(), "Mandatory field");
        }

        @Test(description = "The user did not enter a user and password")
        public void inputNotUserAndPassword() {
                loginPage.open();
                loginPage.inputLoginAndPassword("", "");
                loginPage.clickLoginButton();
                Assert.assertEquals(loginPage.getErrorMessage(), "Mandatory field");
        }

        @Test(description = "The user entered a Russian 'с' instead of an English 'c' in the Password field.")
        public void inputIncorrectCharacterInPassword() {
                loginPage.open();
                loginPage.inputLoginAndPassword("hsaat@mailto.plus", "Bс12345WGHHGHGHGHGHVG");
                loginPage.clickLoginButton();
                Assert.assertEquals(loginPage.getErrorMessage(), "Login failed");
        }

}