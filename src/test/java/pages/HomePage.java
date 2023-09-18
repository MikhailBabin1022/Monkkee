package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import static com.google.gson.internal.bind.TypeAdapters.URL;

@Log4j2
public class HomePage extends BasePage {

    public static By LOGIN_BUTTON_HOME_PAGE = By.xpath("//a[@class='btn btn-primary'][text()='Login']");
    public static final By SIGN_UP = By.xpath("//a[@class=\"btn btn-primary home__register-btn\" and @href=\"/account/registration\"]");
    public static final By DONATE_BUTTON = By.xpath("//a[@class='btn btn-primary home__donation-btn']");
    public static final By MONKKEE_RELOAD = By.xpath("//span[@class='monkkee-kee']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Open Site")
    public HomePage open() {
        driver.get(BASE_URL + "en");
        log.info("Open site with Base URL: " + "en");
        return this;
    }

    @Step("Click Login Button")
    public HomePage clickLoginButton() {
        driver.findElement(LOGIN_BUTTON_HOME_PAGE).click();
        log.info("Click on loginButton");
        return this;
    }

    @Step("Click on Donate")
    public HomePage clickDonateButton() {
        driver.findElement(DONATE_BUTTON).click();
        log.info("Click on DonateButton");
        return this;
    }

    @Override
    public boolean isPageOpen() {
        return isExist(LOGIN_BUTTON_HOME_PAGE);
    }
}