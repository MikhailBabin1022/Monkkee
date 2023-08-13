package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.bouncycastle.cms.RecipientId.password;

public class LoginPage extends BasePage {

    public static final By LOGIN_IN_BUTTON = By.xpath("//button[@type='submit']");
    public static final By PASSWORD_INPUT = By.xpath("//input[@id='password']");
    public static final By LOG_IN_INPUT = By.xpath("//input[@id='login']");
    public static final By ERROR_MESSAGE = By.xpath("//div[@class='alert alert-danger' and @ng-show='formStatus']");




    public LoginPage(WebDriver driver) {
        super(driver);

        public LoginPage open(){
            driver.get(BASE_URL+"login");
            return this;

            public LoginPage inputLoginAndPassword
            driver.findElement(LOG_IN_INPUT).sendKeys(login);
            driver.findElement(PASSWORD_INPUT).sendKeys(password);
            return this;












