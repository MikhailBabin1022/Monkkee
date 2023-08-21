package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends BaseTest {

        @Test(description = "User login and password valid data")
        public void inputValidDateUserAndPassword() {
                loginPage.open();
                loginPage.inputLoginAndPassword("mislavik@tut.by", "8*!pDzuTH#75gYq");
                loginPage.clickLoginButton();
                loginPage.isPageOpen();
                Assert.assertTrue(loginPage.isPageOpen());
        }

        }


}

























