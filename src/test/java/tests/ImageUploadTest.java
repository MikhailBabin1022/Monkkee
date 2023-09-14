package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ImageUploadPage;

import java.io.File;

import static org.testng.AssertJUnit.assertEquals;

public class ImageUploadTest extends BaseTest {

    @Test
    public void FileUpload() {
        driver.get("https://monkkee.com/app/#/entries/3784723");

        File file = new File("src/test/resources/Depeche-Mode-wallpaper-3ee848ff8d502a9856541997f1095905.jpg");
        driver.findElement(By.xpath("\"//input[@id='cke_388_fileInput_input' and @type='file' and @name='txtUpload']\"")).sendKeys(file.getAbsolutePath());
        driver.findElement(By.xpath("//span[@id='cke_405_label' and @class='cke_dialog_ui_button' and text()='OK']")).click();

       assertEquals( "File Uploaded!","File Not Uploaded");
    }
}




