package pageObjectsTestsFlores;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectsFlores.LoginPage;
import pageObjectsFlores.MainPage;

public class PlaylistsTest {
    WebDriver driver;
    String playlistNewName;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void playlistTests_createPlaylist_playlistCreated(){
        String name = "AAA1";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        String playlistId = mainPage.createPlaylist(name);
        Assert.assertTrue(mainPage.checkPlaylistExist(playlistId,name));

//        mainPage.getPlusButton().click();
//        mainPage.getInputFieldPlaylist().click();
//        playlistNewName = "AA1";
//        mainPage.getInputFieldPlaylist().sendKeys(playlistNewName);
    }
}
