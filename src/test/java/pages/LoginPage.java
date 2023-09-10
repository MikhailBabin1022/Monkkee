package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class LoginPage extends BasePage {
    private static final By LOGIN_BUTTON = By.xpath("//button[@type='submit']/div");
    private static final By PASSWORD_INPUT = By.xpath("//input[@id='password']");
    private static final By LOGIN_INPUT = By.xpath("//input[@id='login']");
    private static final By ERROR_MESSAGE = By.xpath("//div[@class='alert alert-danger' and @ng-show='formStatus']");
    private static final By PASSWORD_REMINDER = By.xpath("//a[@href=\"/account/password_reminder\"]");
    private static final By REGISTER_BUTTON = By.xpath("//a[@href='/account/registration' and normalize-space()='Register']");
    private static final By FIELD_USER_ERROR = By.xpath("//input[@name='login']");
    private static final By FIELD_PASSWORD_ERROR = By.xpath("//input[@id='password']");
    private static final By EMPTY_LOGIN_PASSWORD_FIELD = By.xpath("//div[@class=\"help-block ng-binding\" and contains(text(), \"Mandatory field\")]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open page")
    public LoginPage open() {
        driver.get(BASE_URL + "/app#/");
        log.info("Page opened");
        return this;
    }

    @Step("Enter login and password")
    public LoginPage inputLoginAndPassword(String login, String password) {
        driver.findElement(LOGIN_INPUT).sendKeys(login);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        log.info("Entered login and password");
        return this;
    }

    @Step("The user clicks the login button")
    public MainPage clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
        log.info("Login button clicked");
        return new MainPage(driver);
    }

    @Step("User receives a login error message")
    public String getErrorMessage() {
        String errorMessage = driver.findElement(ERROR_MESSAGE).getText();
        log.info("Error message received: " + errorMessage);
        return errorMessage;
    }

    @Step("The user receives a message about an empty User field")
    public String getUserEmptyField() {
        String userEmptyFieldMessage = driver.findElement(FIELD_USER_ERROR).getText();
        log.info("Empty User field message received: " + userEmptyFieldMessage);
        return userEmptyFieldMessage;
    }

    @Step("The user receives a message about an empty Password field")
    public String getUserEmptyPasswordField() {
        String getUserPasswordEmptyFieldMessage = driver.findElement(FIELD_PASSWORD_ERROR).getText();
        log.info("Empty Password field message received: " + getUserPasswordEmptyFieldMessage);
        return getUserPasswordEmptyFieldMessage;
    }

    @Step("The user left the username and password fields blank")
    public String getUserEmptyUsernameAndPasswordField() {
        String getUserEmptyUsernameAndPasswordFieldMessage = driver.findElement(EMPTY_LOGIN_PASSWORD_FIELD).getText();
        log.info("Empty Login And Password field message received: " + getUserEmptyUsernameAndPasswordFieldMessage);
        return getUserEmptyUsernameAndPasswordFieldMessage;
    }

    @Override
    public boolean isPageOpen() {
        return isExist(LOGIN_BUTTON);
    }
}