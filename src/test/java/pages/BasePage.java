package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
@Log4j2
public abstract class BasePage {

    public static WebDriver driver;
    WebDriverWait wait;
    public static final String BASE_URL = "https://monkkee.com/";
    public static final By MONKEY_RELOAD_BUTTON = By.xpath("//span[@class=monkkee-kee]");

    public BasePage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void clickMRB(){
        driver.findElement(MONKEY_RELOAD_BUTTON).click();


    }


    public abstract boolean isPageOpen();

    public static boolean isExist(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    }







