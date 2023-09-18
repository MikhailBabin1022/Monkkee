package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends BaseTest {




        @Test(description = "Validate login and password")
        public void inputValidDataUserAndPassword() {
                loginPage.open()
                        .inputLoginAndPassword("hsaat@mailto.plus", "BC12345WGHHGHGHGHGHVG")
                        .clickLoginButton();
                assertTrue(mainPage.isPageOpen());
        }

        @Test(description = "User enters invalid data")
        public void inputInvalidDataUserAndPassword() {
                loginPage.open()
                        .inputLoginAndPassword("login", "password")
                        .clickLoginButton();
                assertEquals(loginPage.getErrorMessage(), "Login failed");
        }

        @Test(description = "User did not enter a password")
        public void inputUserEmptyPasswordField() {
                loginPage.open()
                        .inputLoginAndPassword("user", "")
                        .clickLoginButton();
                assertEquals(loginPage.getUserEmptyPasswordField(), "");
        }

        @Test(description = "The user has not entered a login")
        public void inputNotEnteredLogin() {
                loginPage.open()
                        .inputLoginAndPassword("", "password")
                        .clickLoginButton();
                assertEquals(loginPage.getUserEmptyField(), "");
        }

        @Test(description = "The user did not enter a user and password")
        public void inputNotUserAndPassword() {
                loginPage.open()
                        .inputLoginAndPassword("", "")
                        .clickLoginButton();
                assertEquals(loginPage.getUserEmptyUsernameAndPasswordField(), "Mandatory field");
        }

        @Test(description = "The user entered a Russian 'с' instead of an English 'c' in the Password field.")
        public void inputIncorrectCharacterInPassword() {
                loginPage.open()
                        .inputLoginAndPassword("login", "password")
                        .clickLoginButton();
                assertEquals(loginPage.getErrorMessage(), "Login failed");
        }
        @Test(description = "Enter invalid characters in Password")
        public void inputentherinvalidcharactersPassword() {
                loginPage.open()
                        .inputLoginAndPassword("login", "#!%%%%%%%%%%%%%#")
                        .clickLoginButton();
                assertEquals(loginPage.getErrorMessage(), "Login failed");
        }


        @Test(description = "Enter invalid characters in Login")
        public void inputentherinvalidcharactersUser() {
                loginPage.open()
                        .inputLoginAndPassword("#!%%%%%%%%%%%%%#", "password")
                        .clickLoginButton();
                assertEquals(loginPage.getErrorMessage(), "Login failed");
        }

}


