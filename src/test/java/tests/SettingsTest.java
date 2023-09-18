package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SettingsTest extends BaseTest{

    @Test(description = "Select Language in the Settings")
    public void selectLanguageSettings()throws InterruptedException {
        loginPage.open()
                .inputLoginAndPassword("user", "password")
                .clickLoginButton();
        settingsPage.clickSettingsButton();
        settingsPage.selectSettingLanguage();
        settingsPage.selectLanguage()
                .clickOkButton();
        assertEquals(settingsPage.languageChangeMessage("Language Change"),  "Language Change");

    }






}






















