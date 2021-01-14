package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTest extends BaseTest{
    @Test
    public void loginTest_CorrectCredentials_successfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io", "te$t$tudent");
        Assert.assertTrue(mainPage.isOpen());
    }
    @Test
    public void loginTest_wrongCredentials_redFrame(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("koeluser06@testpro.io", "WrongPassword");
        Assert.assertTrue(loginPage.isErrorState());
    }
}
