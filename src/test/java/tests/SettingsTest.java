package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SettingsTest extends BaseTest{

    @Test(description = "Select Language in the Settings")
    public void selectLanguageSettings()throws InterruptedException {
        loginPage.open()
                .inputLoginAndPassword("hsaat@mailto.plus", "BC12345WGHHGHGHGHGHVG")
                .clickLoginButton();
        settingsPage.clickSettingsButton();
        settingsPage.selectSettingLanguage();
        settingsPage.selectLanguage()
                .clickOkButton();
        assertEquals(settingsPage.languageChangeMessage("Language Change"),  "Language Change");

    }






}






















