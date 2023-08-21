package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

public static final By SETTINGS_BUTTON = By.xpath("//a[@class='user-menu__btn' and @href='#/settings/locale' and contains(., 'Settings')]");
public static final By LOGOUT_BUTTON = By.xpath("//button[@class=user-menu__btn and @ng-click=logout($event)]");
public static final By CREATE_AN_ENTRY = By.xpath("//i[@class='icon-plus']");
public static final By BACK_TO_HOME = By.id("back-to-overview");
public static final By DELETE_ENTRY = By.id("delete-entry");
public static final By PRINT = By.xpath("//a[@class='btn btn-default' and @href='javascript:void(0)' and @title='Print entry']\n");
public static final By ICON_LEFT = By.xpath("//i[@class='icon-chevron-left']");
public static final By ICON_RIGHT = By.xpath("//i[@class='icon-chevron-right']");

    public MainPagePage(WebDriver driver) {
        super(driver);
    }



    }

