package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

@Log4j2
public class MainTest extends BaseTest {

    @Test(description = "Create a new entry")
    public void userCreateEntry() {
        loginPage.open()
                .inputLoginAndPassword("BC12345WGHHGHGHGHGHVG", "BC12345WGHHGHGHGHGHVG")
                .clickLoginButton()
                .createNewEntryWithText("Hello World 12345")
                .clickHomeButton();
        assertEquals(mainPage.getTextEntry(), "Hello World12345", "Hello World12345");
    }


    @Test(description = "Delete entry")
    public void userDeleteEntry() {
        loginPage.open()
                .inputLoginAndPassword("BC12345WGHHGHGHGHGHVG", "BC12345WGHHGHGHGHGHVG")
                .clickLoginButton()
                .selectEntries()
                .clickDeleteEntry();
        assertEquals(mainPage.getTextEntry(),"Entry deleted","Entry deleted");


    }
}

























