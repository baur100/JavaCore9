package pageObjectsTests;

import org.testng.Assert;
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

    @Test
    public void loginToApp_correctCredentials_successfulLogin_COPY1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin_COPY1(){
        LoginPage loginPage = new LoginPage(driver); // created variable loginPage for LoginPage class
        loginPage.open(); // open site
        loginPage.loginToApp(username, password+"Wrong"); // enter Username/Password + click LogIn button
        Assert.assertTrue(loginPage.isError()); // calling isError method from LoginPage class to check if we're getting error is "true"
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin_COPY2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test(enabled = false)
    public void loginToApp_incorrectCredentials_failedLogin_COPY2(){
        LoginPage loginPage = new LoginPage(driver); // created variable loginPage for LoginPage class
        loginPage.open(); // open site
        loginPage.loginToApp(username, password+"Wrong"); // enter Username/Password + click LogIn button
        Assert.assertTrue(loginPage.isError()); // calling isError method from LoginPage class to check if we're getting error is "true"
    }
    @Test
    public void loginToApp_correctCredentials_successfulLogin_COPY3(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isMain());
    }
    @Test
    public void loginToApp_incorrectCredentials_failedLogin_COPY3(){
        LoginPage loginPage = new LoginPage(driver); // created variable loginPage for LoginPage class
        loginPage.open(); // open site
        loginPage.loginToApp(username, password+"Wrong"); // enter Username/Password + click LogIn button
        Assert.assertTrue(loginPage.isError()); // calling isError method from LoginPage class to check if we're getting error is "true"
    }
}
