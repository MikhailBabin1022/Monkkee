package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {




        @Test(description = "User enters valid data")
        public void inputValidDataUserAndPassword() {
                loginPage.open()
                .inputLoginAndPassword("hsaat@mailto.plus", "BC12345WGHHGHGHGHGHVG")
                .clickLoginButton();
                Assert.assertTrue(loginPage.isPageOpen());

        }

        @Test(description = "User enters invalid data")
        public void inputInvalidDataUserAndPassword() {
                loginPage.open()
                .inputLoginAndPassword("wewewew", "wewewewew")
                .clickLoginButton();
                Assert.assertEquals(loginPage.getErrorMessage(), "Login_failed");

        }

        @Test(description = "User did not enter a password")
        public void inputNotPassword() {
                loginPage.open()
                .inputLoginAndPassword("hsaat@mailto.plus", "")
                .clickLoginButton();
                Assert.assertEquals(loginPage.getErrorMessage(), "Mandatory field");
        }

        @Test(description = "The user has not entered a login")
        public void inputNotEnteredLogin() {
                loginPage.open()
                .inputLoginAndPassword("", "BC12345WGHHGHGHGHGHVG")
                .clickLoginButton();
                Assert.assertEquals(loginPage.getErrorMessage(), "Mandatory field");
        }

        @Test(description = "The user did not enter a user and password")
        public void inputNotUserAndPassword() {
                loginPage.open()
                .inputLoginAndPassword("", "")
                .clickLoginButton();
                Assert.assertEquals(loginPage.getErrorMessage(), "Mandatory field");
        }

        @Test(description = "The user entered a Russian 'с' instead of an English 'c' in the Password field.")
        public void inputIncorrectCharacterInPassword() {
                loginPage.open()
                .inputLoginAndPassword("hsaat@mailto.plus", "Bс12345WGHHGHGHGHGHVG")
                .clickLoginButton();
                Assert.assertEquals(loginPage.getErrorMessage(), "Login failed");
        }

}