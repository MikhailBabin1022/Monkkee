package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.bouncycastle.cms.RecipientId.password;

public class LoginPage extends BasePage {

    public static final By LOG_IN_BUTTON = By.xpath("//button[@type='submit']");
    public static final By PASSWORD_INPUT = By.xpath("//input[@id='password']");
    public static final By LOG_IN_INPUT = By.xpath("//input[@id='login']");
    public static final By ERROR_MESSAGE = By.xpath("//div[@class='alert alert-danger' and @ng-show='formStatus']");

    public static final By Password_REMINDER = By.xpath("//a[@href=\"/account/password_reminder\"]");

    public static final By REGISTER = By.xpath("//a[@href='/account/registration' and normalize-space()='Register']");


    public LoginPage(WebDriver driver) {
        super(driver);

        public LoginPage open() {
            driver.get(BASE_URL + "login");
            return this;

            public LoginPage inputLoginAndPassword
            driver.findElement(LOG_IN_INPUT).sendKeys(login);
            driver.findElement(PASSWORD_INPUT).sendKeys(password);
            return this;

            public LoginPage clickLoginButton () {
                driver.findElement(LOG_IN_BUTTON).click();
                return new LoginPage(driver);

                public String getErrorMessage () {
                    return driver.findElement(ERROR_MESSAGE).getText();
                }


            }

        }