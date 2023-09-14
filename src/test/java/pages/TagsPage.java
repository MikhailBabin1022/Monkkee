package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

@Log4j2
public class TagsPage extends BasePage {

    public static final By MANAGE_TAGS_BUTTON = By.xpath("//a[@class='tags__manage-link']");
    public static final By EDIT_TAGS = By.xpath("//i[@class='icon-plus icon-white']");
    public static final By CREATE_NEW_TAG_INPUT = By.id("new-tag");
    public static final By CREATE_NEW_TAG_OK_BUTTON = By.xpath("//button[@id='assign-new-tag']");
    public static final By OK_BUTTON = By.xpath("//button[@class='btn btn-default']");
    public static final By DELETE_TAGS_BUTTON = By.xpath("//a[@ng-click='deleteTag(tag)']");
    public static final By HOME_BUTTON = By.xpath("//i[@class='icon-home']");
    public static final By RECORDING = By.xpath("(//div[@class=' body'])[1]");
    public static final By NO_ENTRIES_FOUND = By.xpath("//div[@class='none centered']");
    public static final By TAG_LIST_TEXT = By.xpath("//td[contains(text(), 'Hello World 123456789')]");


    public TagsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click on Button Manage Tags")
    public TagsPage clickManageTagsButton() {
        driver.findElement(MANAGE_TAGS_BUTTON).click();
        log.info("Clicked the Manage Tags button");
        return this;
    }

    @Step("Click on Edit Tags")
    public TagsPage clickEditTagsButton() {
        driver.findElement(EDIT_TAGS).click();
        log.info("Clicked the Edit Tags button");
        return this;
    }

    @Step("Click on OK Button")
    public TagsPage clickOkButton() {
        driver.findElement(OK_BUTTON).click();
        log.info("Clicked the OK button");
        return this;
    }

    @Step("Click on OK in the Create Tags")
    public TagsPage clickOkCreateTagsButton() {
        driver.findElement(CREATE_NEW_TAG_OK_BUTTON).click();
        log.info("Clicked the Create OK button");
        return this;
    }

    @Step("Click on Delete Tags")
    public TagsPage clickDeleteTagsButton() {
        driver.findElement(DELETE_TAGS_BUTTON).click();
        log.info("Clicked the Delete Tags button");
        Alert alert = driver.switchTo().alert();
        alert.accept();
        return this;
    }

    @Step("Click on Home Button")
    public TagsPage clickHomeButton() {
        driver.findElement(HOME_BUTTON).click();
        log.info("Clicked the Home Button");
        return this;
    }

    @Step("Create Tag")
    public TagsPage createNewTag(String text) {
        driver.findElement(CREATE_NEW_TAG_INPUT).sendKeys(text);
        log.info("Writing text to new Tag " + text);
        return this;
    }
    @Step("Select Entry")
    public TagsPage clickEntry() {
        driver.findElement(RECORDING).click();
        log.info("Select entry");
        return this;
    }

    @Step("No entries found")
    public String  noEntriesFound() {
        return driver.findElement(NO_ENTRIES_FOUND).getText();
    }

    @Step("Взять текст из списка тегов")
    public String getTextListTeg() {
        List<WebElement>list = driver.findElements(TAG_LIST_TEXT);
        log.info("Put all elements into a list");
        return list.get(0).getText();
    }


    @Override
    public boolean isPageOpen() {
        return isExist(EDIT_TAGS);
    }


}