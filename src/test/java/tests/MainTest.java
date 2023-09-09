package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

@Log4j2
public class MainTest extends BaseTest {

    @Test(description = "Create a new entry")
    public void userCreateEntry() {
        loginPage.open()
                .inputLoginAndPassword("hsaat@mailto.plus", "BC12345WGHHGHGHGHGHVG")
                .clickLoginButton()
                .createNewEntryWithText("")
                .clickHomeButton();

        Assert.assertTrue(mainPage.isPageOpen());
    }

    @Test(description = "Delete all entry")
    public void userDeleteAllEntry() {
        loginPage.open()
                .inputLoginAndPassword("hsaat@mailto.plus", "BC12345WGHHGHGHGHGHVG")
                .clickLoginButton()
                .selectAllEntries()
                .clickdeleteEntry();

        Assert.assertTrue(mainPage.isPageOpen());
    }

}
























