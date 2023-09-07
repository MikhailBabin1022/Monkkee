package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.awt.SystemColor.text;

@Log4j2
public class TagsPage extends BasePage {

    public static final By MANAGE_TAGS_BUTTON = By.xpath("//a[@class='tags__manage-link']");
    public static final By EDIT_TAGS_BUTTON = By.xpath("//i[@class='icon-plus icon-white']");
    public static final By DELETE_TAGS_BUTTON = By.xpath("//i[contains(@class, 'icon-trash') and contains(@class, 'icon-white')]");
    public static final By CREATE_NEW_TAGS_FIELD = By.xpath("//input[@id=\"new-tag\"]");

    public TagsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click Manage Tags")
    public TagsPage clickManageTags() {
        driver.findElement(MANAGE_TAGS_BUTTON).click();
        log.info("Click the Manage tags");
        return this;
    }

    @Step("Click Edit Tags")
    public TagsPage clickEditTags() {
        driver.findElement(EDIT_TAGS_BUTTON).click();
        log.info("Click the Edit tags");
        return this;
    }

    @Step("Delete Tags")
    public TagsPage deleteTags() {
        driver.findElement(DELETE_TAGS_BUTTON).click();
        log.info("Delete Tags");
        return this;
    }

    @Step("Enter text in Create new tag")
    public TagsPage enterTextInCreateNewTag() {
        driver.findElement(CREATE_NEW_TAGS_FIELD).sendKeys();
        log.info("Writing text Create new tag");
        return this;
    }




    @Override
    public boolean isPageOpen() {
        return isExist(MANAGE_TAGS_BUTTON);
    }
}