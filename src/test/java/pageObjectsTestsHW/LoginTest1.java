package pageObjectsTestsHW;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;


public class LoginTest1 extends BaseTestHW{

    @Test
    public void loginTest_CorrectCredentials_successfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPageHW = loginPage.login("Innamammadova584@gmail.com","te$t$tudent");
        Assert.assertTrue(mainPageHW.isOpen());
    }
    @Test
    public void loginTest_wrongCredentials_redFrame(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("Innamammadova584@gmail.com","WrongPassword");
        Assert.assertTrue(loginPage.isErrorState());
    }
}
