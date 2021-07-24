package pageObjectsTests;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTests extends BaseTest{

    @Test
    public void playlistTests_createNewPlaylist_playlistCreated(){
        Faker faker = new Faker();
//        String playlistName = TestDataGenerator.getString(5);
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, playlistName));
    }
    @Test
    public void playlistTests_renameNewPlaylist_playlistRenamed() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        System.out.println(playlistId);

        String newPlaylistName= faker.artist().name();
        mainPage.renamePlaylist(playlistId, newPlaylistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, newPlaylistName));
    }
}
