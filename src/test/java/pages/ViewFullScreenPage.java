package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewFullScreenPage extends BasePage {

    public static final By FULL_SCREEN_BUTTON = By.xpath("//span[contains(@class, 'cke_button__simplemaximize_icon')]");

    public static void FULL_SCREEN_BUTTON() {
    }

    public ViewFullScreenPage clickFullscreen() {
        driver.findElement(FULL_SCREEN_BUTTON).click();
        return new ViewFullScreenPage(driver);
    }

    public ViewFullScreenPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public static boolean isPageOpen() {
        return false;
    }
}