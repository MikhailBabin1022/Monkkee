package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.ViewFullScreenPage;

public class ViewFullScreenTest extends BaseTest {
    public ViewFullScreenTest() {
    }

    @Test(description = "Click Full Screen")
    public void clickFullScreen() {
        loginPage.open()
                .inputLoginAndPassword("hsaat@mailto.plus", "BC12345WGHHGHGHGHGHVG")
                .clickLoginButton();
        mainPage.isPageOpen();
        mainPage.createNewEntryWithText("");
        ViewFullScreenPage.FULL_SCREEN_BUTTON();
        Assert.assertTrue(ViewFullScreenPage.isPageOpen());


    }
}







