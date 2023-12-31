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
                .inputLoginAndPassword("User", "Password")
                .clickLoginButton()
                .createNewEntryWithText("Hello my name is Mikhail")
                .clickHomeButton();
        assertEquals(mainPage.getTextEntry(), "Hello my name is Mikhail", "Hello my name is Mikhail");
    }


    @Test(description = "Delete entry")
    public void userDeleteEntry() {
        loginPage.open()
                .inputLoginAndPassword("User", "Password")
                .clickLoginButton()
                .selectEntries()
                .clickDeleteEntry();
        assertEquals(mainPage.notEntry(),"Not Entry","Not Entry");


    }
}

























