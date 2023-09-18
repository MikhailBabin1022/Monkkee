package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TagsPage;

import static org.testng.Assert.assertEquals;


public class TagsTest extends BaseTest {

    @Test(description = "Create Tag")
    public void createTag() {
        loginPage.open()
                .inputLoginAndPassword("user", "password")
                .clickLoginButton()
                .createNewEntryWithText("");
        tagsPage.createNewTag("Hello World 123456789")
                .clickOkCreateTagsButton()
                .clickHomeButton();
        tagsPage.clickManageTagsButton()
                .getTextListTeg();
        assertEquals(tagsPage.getTextListTeg(), "Hello World 123456789", "Tags not created");

    }

    @Test(description = "Delete Tag")
    public void deleteTag() {
        loginPage.open()
                .inputLoginAndPassword("user", "password")
                .clickLoginButton();
                tagsPage.clickManageTagsButton()
                        .clickDeleteTagsButton();
     assertEquals(tagsPage.noTagsOnPage(),"No tags","Tags not deleted");






    }
}























