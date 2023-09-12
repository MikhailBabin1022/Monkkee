package tests;

import org.testng.annotations.Test;
import pages.TagsPage;

import static org.testng.Assert.assertEquals;


public class TagsTest extends BaseTest {

    @Test(description = "Delete Tag")
    public void deleteTag() {
        loginPage.open()
                .inputLoginAndPassword("hsaat@mailto.plus", "BC12345WGHHGHGHGHGHVG")
                .clickLoginButton();
        tagsPage.clickManageTagsButton()
                .clickDeleteTagsButton()
                .clickHomeButton();

        assertEquals(tagsPage.noEntriesFound(), "No tags", "Tag not deleted");
    }

    @Test(description = "Create Tag")
    public void createTag(){
        loginPage.open()
                .inputLoginAndPassword("hsaat@mailto.plus", "BC12345WGHHGHGHGHGHVG")
                .clickLoginButton()
                .createNewEntryWithText("");
        tagsPage.createNewTag("Hello World 123456789")
                .clickOkCreateTagsButton()
                .clickHomeButton();

//        assertEquals(mainPage.(),"Tag created","Tag not created");








    }



}


