package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;

public class MainPage extends BasePage {

    public static final By SETTINGS_BUTTON = By.xpath("//a[@class='user-menu__btn' and @href='#/settings/locale' and contains(., 'Settings')]");
    public static final By LOGOUT_BUTTON = By.xpath("//button[@class='user-menu__btn' and @ng-click='logout($event)']");
    public static final By CREATE_AN_ENTRY = By.xpath("//i[@class='icon-plus']");
    public static final By DELETE_ENTRY = By.id("delete-entry");
    public static final By PRINT = By.xpath("//a[@class='btn btn-default' and @href='javascript:void(0)' and @title='Print entry']");
    public static final By ICON_LEFT = By.xpath("//i[@class='icon-chevron-left']");
    public static final By ICON_RIGHT = By.xpath("//i[@class='icon-chevron-right']");
    public static final By HOME_BUTTON = By.xpath("//a[@class=\"btn btn-default\" and @href=\"#/entries\" and @id=\"back-to-overview\" and @title=\"Back to overview\"]");
    public static final By SAVE_BUTTON = By.xpath("//a[@class='cke_button cke_button__savetoggle cke_button_off cke_button_disabled']");
    private Logger log;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void createNewEntry(String text) {
        driver.findElement(CREATE_AN_ENTRY).click();
        log.info("Create new entry");
    }

    public void deleteEntry() {
        driver.findElement(DELETE_ENTRY).click();
        log.info("Deleting the entry");

    }

    public void printEntry() {
        driver.findElement(PRINT).click();
        log.info("Printing the entry");
    }

    public void clickForwardButton() {
        driver.findElement(ICON_RIGHT).click();
        log.info("Clicking the forward button");
    }

    public void clickBackwardButton() {
        driver.findElement(ICON_LEFT).click();
        log.info("Clicking the backward button");
    }

    public void clickHomeButton() {
        driver.findElement(HOME_BUTTON).click();
        log.info("Clicking the home button");
    }

    public void clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
        log.info("Clicking the save button");
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SETTINGS_BUTTON);
    }
}
