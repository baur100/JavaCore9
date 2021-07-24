package pageObjectsTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginToApp extends BaseTest{

    @Test
    public void loginToApp_correctCredentials_successfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin(){
        LoginPage loginPage = new LoginPage(driver); // created variable loginPage for LoginPage class
        loginPage.open(); // open site
        loginPage.loginToApp(username, password+"Wrong"); // enter Username/Password + click LogIn button
        Assert.assertTrue(loginPage.isError()); // calling isError method from LoginPage class to check if we're getting error is "true"
    }

}
