package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewFullScreenPage extends BasePage {

    public static final By FULL_SCREEN_BUTTON = By.xpath("//span[contains(@class, 'cke_button__simplemaximize_icon')]");

    public static void FULL_SCREEN_BUTTON() {
    }

    public static ViewFullScreenPage clickFullscreen() {
        driver.findElement(FULL_SCREEN_BUTTON).click();
        return new ViewFullScreenPage(driver);
    }

    public ViewFullScreenPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }
}

