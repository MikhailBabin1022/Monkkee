package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {

    private static final By LOGIN_BUTTON = By.xpath("//button[@type='submit']/div");
    private static final By PASSWORD_INPUT = By.xpath("//input[@id='password']");
    private static final By LOGIN_INPUT = By.xpath("//input[@id='login']");
    private static final By ERROR_MESSAGE = By.xpath("//div[@class='alert alert-danger' and @ng-show='formStatus']");
    private static final By PASSWORD_REMINDER = By.xpath("//a[@href=\"/account/password_reminder\"]");
    private static final By REGISTER = By.xpath("//a[@href='/account/registration' and normalize-space()='Register']");
    private static final By FIELD_USER_ERROR = By.xpath("//input[@name='login']");
    private static final By FIELD_PASSWORD_ERROR = By.xpath("//input[@id='password']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
@Step("Open page")
    public LoginPage open() {
        driver.get(BASE_URL + "/app/#/");
        return this;
    }
    @Step("Enter login and password")
    public LoginPage inputLoginAndPassword(String login, String password) {
        driver.findElement(LOGIN_INPUT).sendKeys(login);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        return this;
    }
    @Step("The user clicks the login key")
    public LoginPage clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage(driver);
        }

    @Step("User receives a login error message")
    public String getErrorMessage() {
        return driver.findElement(ERROR_MESSAGE).getText();
    }
   @Step("The user receives a message about an empty User field")
   public String getUserEmptyField() {
       return driver.findElement(FIELD_USER_ERROR).getText();
   }

       @Step("The user receives a message about an empty Password field")
       public String getUserEmptyPasswordField(){
           return driver.findElement(FIELD_PASSWORD_ERROR).getText();



       }


    @Override
    public boolean isPageOpen() {
        return isExist(LOGIN_BUTTON);
    }



    }
