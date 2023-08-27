package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class MainTest extends BaseTest {

    @Test
    public void userCreateEntry(){
        loginPage.open();
        loginPage.inputLoginAndPassword("hsaat@mailto.plus", "BC12345WGHHGHGHGHGHVG");
        loginPage.clickLoginButton();
        mainPage.createNewEntry();
        mainPage.CREATE_AN_ENTRY("Hello World!!!");
        mainPage.BACK_TO_HOME();

        Assert.assertTrue(loginPage.isPageOpen());


  }

}
