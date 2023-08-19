package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public static By LOGIN_BUTTON_HOME_PAGE = By.xpath("//a[@class='btn btn-primary'][text()='Login']");
    public static final By SIGN_UP = By.xpath("//a[@class=\"btn btn-primary home__register-btn\" and @href=\"/account/registration\"]");

    public static final By Donate = By.xpath("//a[@class='btn btn-primary home__donation-btn' and @href='/app/#/settings/donation_payment']");














}



