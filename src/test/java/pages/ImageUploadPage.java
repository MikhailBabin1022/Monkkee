package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ImageUploadPage extends BasePage {

    public static final By IMAGE_DOWNLOAD_BUTTON = By.xpath("//span[@id='cke_267_description']");
    public static final By INPUT_FIELD = By.xpath("//input[@class='cke_dialog_ui_input_text' and @id='cke_382_textInput']");
    public static final By UPLOAD_BUTTON = By.xpath("//input[@id='cke_388_fileInput_input' and @type='file' and @name='txtUpload']");
    public static final By NONE_RADIO_BUTTON = By.xpath("//input[@type='radio' and @class='cke_dialog_ui_radio_input' and @name='align_radio' and @value='none' and @id='cke_392_uiElement']");
    public static final By LEFT_RADIO_BUTTON = By.xpath("//input[@type='radio' and @class='cke_dialog_ui_radio_input' and @name='align_radio' and @value='left' and @id='cke_394_uiElement']");
    public static final By CENTER_RADIO_BUTTON = By.xpath("//input[@type='radio' and @class='cke_dialog_ui_radio_input' and @name='align_radio' and @value='center' and @id='cke_396_uiElement']");
    public static final By RIGHT_RADIO_BUTTON = By.xpath("//input[@type='radio' and @class='cke_dialog_ui_radio_input' and @name='align_radio' and @value='right' and @id='cke_398_uiElement']");
    public static final By OK_BUTTON = By.xpath("//span[@id='cke_405_label' and @class='cke_dialog_ui_button' and text()='OK']");
    public static final By CANCEL_BUTTON = By.xpath("//span[@id='cke_407_label' and @class='cke_dialog_ui_button' and text()='Cancel']");

    public ImageUploadPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }

    public ImageUploadPage clickUploadButton(){
        driver.findElement(IMAGE_DOWNLOAD_BUTTON).click();
        return new ImageUploadPage(driver);
    }

    public ImageUploadPage uploadFile() {
        File file = new File("src/test/resources/Depeche-Mode-wallpaper-3ee848ff8d502a9856541997f1095905.jpg");
        driver.findElement(UPLOAD_BUTTON).sendKeys(file.getAbsolutePath());
        driver.findElement(OK_BUTTON).click();
        return this;
    }
}






























