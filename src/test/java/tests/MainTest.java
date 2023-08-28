package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class MainTest extends BaseTest {

    @Test(description = "Create a new entry")
    public void userCreateEntry() {
        loginPage.open();
        loginPage.inputLoginAndPassword("hsaat@mailto.plus", "BC12345WGHHGHGHGHGHVG");
        loginPage.clickLoginButton();
        mainPage.isPageOpen();
        mainPage.createNewEntry("Hello World !!!");
        mainPage.clickHomeButton();

        Assert.assertTrue(loginPage.isPageOpen());
    }
}
