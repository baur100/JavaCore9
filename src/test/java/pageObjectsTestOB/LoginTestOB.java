package pageObjectsTestOB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestOB {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void loginTest_CorrectCredentials_succesfulLogin() {
        LoginPageOB loginPage = new LoginPageOB(driver);
        loginPage.open();
       MainPageOB mainPage =  loginPage.login("koeluser06@testpro.io", "te$t$tudent");
       Assert.assertTrue(mainPage.isOpen());

    }

    @Test
    public void loginTest_wrongCredentials_redFrame() {
        LoginPageOB loginPage = new LoginPageOB(driver);
        loginPage.open();
        loginPage.login("koeluser06@testpro.io", "WrongPassword");
        Assert.assertTrue(loginPage.isErrorState());

    }
}
