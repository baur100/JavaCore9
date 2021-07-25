package pageObjectsTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.LoginPageFactory;
import pageObjects.MainPage;

// This class "LoginToAppFactory", just to show how @FindBy working. It will be good for Stale Element Reference Exception.

public class LoginToAppFactory extends BaseTest{

    @Test
    public void loginToApp_correctCredentials_successfulLogin(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        loginPage.loginToApp(username, password+"Wrong");
        Assert.assertTrue(loginPage.isErrorFrame());
    }
}
