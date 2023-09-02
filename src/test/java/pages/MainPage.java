package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;

import java.net.URL;

import static java.awt.SystemColor.text;

@Log4j2
public class MainPage extends BasePage {

    public static final By SETTINGS_BUTTON = By.xpath("//a[@class='user-menu__btn' and @href='#/settings/locale' and contains(., 'Settings')]");
    public static final By LOGOUT_BUTTON = By.xpath("//button[@class='user-menu__btn' and @ng-click='logout($event)']");
    public static final By CREATE_AN_ENTRY = By.xpath("//i[@class='icon-plus']");
    public static final By DELETE_ENTRY = By.id("delete-entry");
    public static final By PRINT_BUTTON = By.xpath("//a[@class='btn btn-default' and @href='javascript:void(0)' and @title='Print entry']");
    public static final By ICON_LEFT = By.xpath("//i[@class='icon-chevron-left']");
    public static final By ICON_RIGHT = By.xpath("//i[@class='icon-chevron-right']");
    public static final By HOME_BUTTON = By.xpath("//a[@class=\"btn btn-default\" and @href=\"#/entries\" and @id=\"back-to-overview\" and @title=\"Back to overview\"]");
    public static final By SAVE_BUTTON = By.xpath("//a[@class='cke_button cke_button__savetoggle cke_button_off cke_button_disabled']");
    public static final By TEXT_INPUT_FIELD = By.xpath("//div[contains(@class,'contenteditable cke_editable')]");
    private Logger log;

    public MainPage(WebDriver driver) {
        super(driver);
    }


    @Step("Create a new entry with the text")
    public MainPage createNewEntryWithText(String text){
        driver.findElement(CREATE_AN_ENTRY).click();
        log.info("Click button CREATE_AN_ENTRY");
        driver.findElement(TEXT_INPUT_FIELD).sendKeys(text);
        log.info("Entry field opened");
        driver.findElement(SAVE_BUTTON).click();
        log.info("Click save button");
        return this;
    }

    @Step("Delete entry")
    public MainPage deleteEntry(){
        driver.findElement(DELETE_ENTRY).click();
        log.info("Press delete with Xpath");
        Alert alert= driver.switchTo().alert();
        alert.accept();
        return this;
    }

    @Step("Click the Home Button")
    public MainPage clickHomeButton(){
        driver.findElement(HOME_BUTTON).click();
        log.info("Press home button+Xpath");
        return this;
    }

    @Step("Logout recording")
    public MainPage logoutRecording() {
        driver.findElement(LOGOUT_BUTTON).click();
        log.info("Press logout button with Xpath");
        return this;
    }

    @Step("Click Print Button")
    public MainPage clickPrintbutton() {
        driver.findElement(PRINT_BUTTON).click();
        log.info("Press print button+Xpath");
        return this;
    }

    @Step("Click to the Settings Button")
    public MainPage clickSettingsButton(){
        driver.findElement(SETTINGS_BUTTON).click();
        log.info("Press Settings button +Xpath");
        return this;
    }

    @Step("Click Icon Left")
    public MainPage clickIconLeft() {
        driver.findElement(ICON_LEFT).click();
        log.info("Press Icon left +Xpath");
        return this;
    }

    @Step("Click Icon Right")
    public MainPage clickIconRight() {
        driver.findElement(ICON_RIGHT).click();
        log.info("Press Icon right +Xpath");
        return this;
    }

    @Override
    public boolean isPageOpen() {
        return isExist(CREATE_AN_ENTRY);
    }
}
