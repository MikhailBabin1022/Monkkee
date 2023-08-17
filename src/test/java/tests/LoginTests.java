package tests;

import org.testng.annotations.BeforeMethod;

public class LoginTests extends BaseTest {

   public void loginWithValiData (){

      loginPage.open()
              .inputLoginAndPassword("mislavik@tut.by,8*!pDzuTH#75gYq")
              .clickLoginButton();



   }










}
