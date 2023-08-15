package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

public static final By LOG_IN_BUTTON = By.xpath("//a[@class='btn btn-primary'][text()='Login']");
public static final By REGISTER_BUTTON = By.xpath("//a[@class='btn btn-primary home__register-btn']");
public static final By DONATION = By.xpath("//a[contains(text(), 'Donate now')]");



}
