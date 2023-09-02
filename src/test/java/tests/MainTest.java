package tests;

import org.testng.Assert;
import org.testng.annotations.Test;




public class MainTest extends BaseTest {

    @Test(description = "Create a new entry")
    public void userCreateEntry() {
        loginPage.open();
        loginPage.inputLoginAndPassword("hsaat@mailto.plus", "BC12345WGHHGHGHGHGHVG");
        loginPage.clickLoginButton();
        mainPage.isPageOpen();
        mainPage.createNewEntryWithText("");
        mainPage.clickHomeButton();

        Assert.assertTrue(mainPage.isPageOpen());
    }



    }







