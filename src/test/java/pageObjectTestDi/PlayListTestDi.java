package pageObjectTestDi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;


public class PlayListTestDi {
    private WebDriver driver;
    private Object newPlaylist;


    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;


    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        //driver.close();
    }
    @Test
    public void playlistTests_createPlaylist_playlistCreated(){
        String name = "99999";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io", "te$t$tudent");
        String playlistId = mainPage.createPlaylist(name);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
        Assert.assertTrue(mainPage.checkPlaylistExist(playlistId,name));
    }

    public void scrollToWebElement (WebElement newPlaylist){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", newPlaylist);


}
}
