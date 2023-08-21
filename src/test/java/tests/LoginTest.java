package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


        @Test(description = "User validates login and password")
        public void inputValidDateUserAndPassword() {
                loginPage.open();
                loginPage.inputLoginAndPassword("mislavik@tut.by", "8*!pDzuTH#75gYq");
                loginPage.clickLoginButton();
                loginPage.isPageOpen();
                Assert.assertTrue(loginPage.isPageOpen());
        }

        @Test(description = "User enters invalid data")
        public void inputInvalidDateUserAndPassword() {
                loginPage.open();
                loginPage.inputLoginAndPassword("wewewew", "wewewewew");
                loginPage.clickLoginButton();
                loginPage.isPageOpen();
                Assert.assertTrue(loginPage.getErrorMessage().equals("Login_failed"));

        }

        @Test(description = "User did not enter a password")
        public void inputNotPassword() {
                loginPage.open();
                loginPage.inputLoginAndPassword("mislavik@tut.by", "");
                loginPage.clickLoginButton();
                loginPage.isPageOpen();
                Assert.assertTrue(loginPage.getErrorMessage().equals("Mandatory field"));
        }

        @Test(description = "The user has not entered a login")
        public void inputNotEnteredLogin() {
                loginPage.open();
                loginPage.inputLoginAndPassword("", "8*!pDzuTH#75gYq");
                loginPage.clickLoginButton();
                loginPage.isPageOpen();
                Assert.assertTrue(loginPage.getErrorMessage().equals("Mandatory field"));
        }

        @Test(description = "The user did not enter a user and password")
        public void inputNotUserAndPassword() {
                loginPage.open();
                loginPage.inputLoginAndPassword("", "");
                loginPage.clickLoginButton();
                loginPage.isPageOpen();
                Assert.assertTrue(loginPage.getErrorMessage().equals("Mandatory field"));
        }
}
























