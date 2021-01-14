package pageObjectTestDi;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectDi.MainPageDi;
import pageObjects.LoginPage;
import pageObjects.MainPage;


public class PlayListTestDi {
    private WebDriver driver;
    private Object newPlaylist;


    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        //driver.close();
    }
    @Test
    public void playlistTests_createPlaylist_playlistCreated(){
        String name = "9999";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io", "te$t$tudent");
        String playlistId = mainPage.createPlaylist(name);
        Assert.assertTrue(mainPage.checkPlaylistExist(playlistId,name));
    }

    @Test
    public void playlistTests_renamePlaylist_playlistRenamed() {
        String name = "List1";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io", "te$t$tudent");
        String playlistId = mainPage.createPlaylist(name);
        mainPage.renamePlaylist(playlistId,"List2");


    }

}

