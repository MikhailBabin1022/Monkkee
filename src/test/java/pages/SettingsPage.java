package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

@Log4j2
public class SettingsPage extends BasePage {
    public static By SETTINGS_BUTTON = By.xpath("//a[@class='user-menu__btn']");
    public static By HOME_BUTTON = By.id("back-to-overview");
    public static By LOGOUT_BUTTON = By.xpath("//button[@class = 'user-menu__btn']");
    public static By MENU_LIST_SETTINGS = By.xpath("//div[@id = 'settings-menu']//li");
    public static By OK_BUTTON = By.xpath("//div[@class = 'col-sm-4 col-sm-offset-3']/ancestor::div[@class = 'content-container clearfix ng-scope']//button");
    public static By LANGUAGE_SELECTION_LIST = By.xpath("//option[@value=\"en\"]");
    public static By LANGUAGE_CHANGE_MESSAGE = By.xpath("//div[normalize-space(text()) = 'Your language has been changed successfully']");
    public static By MENU_SETTINGS_LIST = By.xpath("//div//li[@class='active']");
    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click Settings Button")
    public void clickSettingsButton() {
        log.info("Click Settings Button with xPath: " + SETTINGS_BUTTON);
        driver.findElement(SETTINGS_BUTTON).click();
    }

    @Step("Click Home Button")
    public void clickHomeButton() {
        log.info("Click Settings Button with xPath: " + HOME_BUTTON);
        driver.findElement(HOME_BUTTON).click();
    }
    @Step("Click Ok Button")
    public void clickOkButton() {
        log.info("Click Settings Button with xPath: " + OK_BUTTON);
        driver.findElement(OK_BUTTON).click();
    }
    @Step("Click Logout Button")
    public void clickLogoutButton() {
        log.info("Click Settings Button with xPath: " + LOGOUT_BUTTON);
        driver.findElement(LOGOUT_BUTTON).click();
    }

    @Step("Select Language in the Settings")
    public SettingsPage selectSettingLanguage() {
        List<WebElement> settings = driver.findElements(MENU_SETTINGS_LIST);
        log.info(" all elements into a list");
        settings.get(0).click();
        log.info("Select an item from a list");
        return this;
    }
    @Step("Select Language ")
    public SettingsPage selectLanguage() {
        List<WebElement> settings = driver.findElements(LANGUAGE_SELECTION_LIST);
        log.info(" all elements into a list");
        settings.get(0).click();
        log.info("Select an item from a list");
        return this;
    }
    @Step("Text message language")
    public String languageChangeMessage(String text) {
        driver.findElement(LANGUAGE_CHANGE_MESSAGE).getText();
        log.info("Text message language " + text);
        return text;
    }














    @Override
    public boolean isPageOpen() {
        return isExist(SETTINGS_BUTTON);
    }
}







































































