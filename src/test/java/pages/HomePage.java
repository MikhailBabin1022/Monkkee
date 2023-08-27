package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static com.google.gson.internal.bind.TypeAdapters.URL;

public class HomePage extends BasePage {

    public static By LOGIN_BUTTON_HOME_PAGE = By.xpath("//a[@class='btn btn-primary'][text()='Login']");
    public static final By SIGN_UP = By.xpath("//a[@class=\"btn btn-primary home__register-btn\" and @href=\"/account/registration\"]");
    public static final By Donate = By.xpath("//a[@class='btn btn-primary home__donation-btn' and @href='/app/#/settings/donation_payment']");
    public static final By MONKKEE_RELOAD = By.xpath("//span[@class='monkkee-kee']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Открыть сайт")
    public HomePage open() {
        driver.get(URL + "en");
        log.info("Open site with URL:" + URL);
        return this;
    }

    @Step("Сlick login button")
    public HomePage clickLoginButton() {
        driver.findElement(LOGIN_BUTTON_HOME_PAGE).click();
        log.info("Click on loginButton By.xpath");
        return this;
    }

    @Override
    public boolean isPageOpen() {
        return isExist(LOGIN_BUTTON_HOME_PAGE);
    }
}






