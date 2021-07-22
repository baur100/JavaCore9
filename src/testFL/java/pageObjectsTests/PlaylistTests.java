package pageObjectsTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTests {
    private WebDriver driver;
    String username = "testrun7809@gmail.com";
    String password = "12345";
    String playlistName1 = "New Playlist1";

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void playlistTests_createNewPlaylist_playlistCreated(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName1);

        //not sure->

        System.out.println(playlistId);

    }
}
