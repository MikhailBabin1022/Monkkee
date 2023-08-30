package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;
import pages.MainPage;

import java.time.Duration;

public abstract class BaseTest {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    MainPage mainPage;

    @Step("Setting up and opening the browser")
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
    }

    @Step("Exit the browser")
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }
}