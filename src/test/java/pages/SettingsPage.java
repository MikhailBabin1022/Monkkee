package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

@Log4j2
public class SettingsPage extends BasePage {

    public static final By SETTINGS_BUTTON = By.xpath("//a[@class='user-menu__btn']");
    public static final By SETTINGS_LIST = By.xpath("//ul[@class=\"nav nav-list sidenav\"]");
    public static final By OK_BUTTON = By.xpath("//button[@class='btn btn-default']");
    public static final By LANGUAGE_LIST = By.xpath("//option[@value]/ancestor::div[@class = 'col-sm-4']//option");
    public static final By SELECT_LANGUAGE_MESSAGE = By.xpath("//div[@class = 'alert alert-success' and text()]");

    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click the Settings button")
    public SettingsPage clickSettingButton() {
        log.info("Click button with xPath: "+ SETTINGS_BUTTON);
        driver.findElement(SETTINGS_BUTTON).click();
        return this;
}

    @Step("Click the Ok Button button")
    public SettingsPage clickOkButton() {
        log.info("Click button with xPath: " + SETTINGS_BUTTON);
        driver.findElement(OK_BUTTON).click();
        return this;
    }

    @Step("Select a language from the list of languages")
    public SettingsPage selectLanguagelist() {
        List<WebElement> language = driver.findElements(LANGUAGE_LIST);
        log.info("put all the elements in a list");
        language.get(2).click();
        log.info("Select an item from a list");
        return this;
    }
    @Step("Language change message")
        public String gettextLanguageChange() {
        return driver.findElement(SELECT_LANGUAGE_MESSAGE).getText();
    }












    @Override
    public boolean isPageOpen() {
        return isExist(SETTINGS_BUTTON);
    }
}








