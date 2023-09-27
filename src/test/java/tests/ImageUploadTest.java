package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ImageUploadTest extends BaseTest {

    @Test(description = "Upload Image")
    public void ImageUpload() throws InterruptedException {
        loginPage.open()
                .inputLoginAndPassword("hsaat@mailto.plus","BC12345WGHHGHGHGHGHVG")
                        .clickLoginButton()
                                .createNewEntryWithText("");
        imageUploadPage.clickUploadButton()
                .uploadFile()
                .clickOkButton();
        assertTrue(imageUploadPage.imagePresent());


    }
}




