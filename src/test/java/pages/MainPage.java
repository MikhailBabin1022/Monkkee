package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class MainPage extends BasePage {

    public static final By SETTINGS_BUTTON = By.xpath("//a[@class='user-menu__btn' and @href='#/settings/locale' and contains(., 'Settings')]");
    public static final By LOGOUT_BUTTON = By.xpath("//button[@class='user-menu__btn' and @ng-click='logout($event)']");
    public static final By CREATE_AN_ENTRY = By.xpath("//i[@class='icon-plus']");
    public static final By BACK_TO_HOME = By.id("back-to-overview");
    public static final By DELETE_ENTRY = By.id("delete-entry");
    public static final By PRINT = By.xpath("//a[@class='btn btn-default' and @href='javascript:void(0)' and @title='Print entry']");
    public static final By ICON_LEFT = By.xpath("//i[@class='icon-chevron-left']");
    public static final By ICON_RIGHT = By.xpath("//i[@class='icon-chevron-right']");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click on Settings button")
    public void clickSettingsButton() {
        driver.findElement(SETTINGS_BUTTON).click();
        log.info("Clicked on Settings button");
    }

    @Step("Click on Logout button")
    public void clickLogoutButton() {
        driver.findElement(LOGOUT_BUTTON).click();
        log.info("Clicked on Logout button");
    }

    @Step("Click on Create An Entry button")
    public void clickCreateAnEntry() {
        driver.findElement(CREATE_AN_ENTRY).click();
        log.info("Clicked on Create An Entry button");
    }

    @Step("Click on Back to Home button")
    public void clickBackToHome() {
        driver.findElement(BACK_TO_HOME).click();
        log.info("Clicked on Back to Home button");
    }

    @Step("Click on Delete Entry button")
    public void clickDeleteEntry() {
        driver.findElement(DELETE_ENTRY).click();
        log.info("Clicked on Delete Entry button");
    }

    @Step("Click on Print button")
    public void clickPrint() {
        driver.findElement(PRINT).click();
        log.info("Clicked on Print button");
    }

    @Step("Click on Icon Left button")
    public void clickIconLeft() {
        driver.findElement(ICON_LEFT).click();
        log.info("Clicked on Icon Left button");
    }

    @Step("Click on Icon Right button")
    public void clickIconRight() {
        driver.findElement(ICON_RIGHT).click();
        log.info("Clicked on Icon Right button");
    }


}




