package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;



public class LoginPage extends BasePage {

    private static final By LOGIN_BUTTON = By.xpath("//button[@type='submit']/div");
    private static final By PASSWORD_INPUT = By.xpath("//input[@id='password']");
    private static final By LOGIN_INPUT = By.xpath("//input[@id='login']");
    private static final By ERROR_MESSAGE = By.xpath("//div[@class='alert alert-danger' and @ng-show='formStatus']");
    private static final By PASSWORD_REMINDER = By.xpath("//a[@href=\"/account/password_reminder\"]");
    private static final By REGISTER = By.xpath("//a[@href='/account/registration' and normalize-space()='Register']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage open() {
        driver.get(BASE_URL + "/app/#/");
        return this;
    }

    public LoginPage inputLoginAndPassword(String login, String password) {
        driver.findElement(LOGIN_INPUT).sendKeys(login);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
        return new MainPage(driver);
    }

    public String getErrorMessage() {
        return driver.findElement(ERROR_MESSAGE).getText();
    }

    @Override
    public boolean isPageOpen () {
        return isExist(LOGIN_BUTTON);

    }

}
