package pageObjectsTests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTests extends BaseTest{
    @Test
    public void playlistTests_createNewPlaylist_playlistCreated(){
        Faker faker = new Faker();
//        String playlistName = TestDataGenerator.getString(5);
        String playlistName = faker.funnyName().name();

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

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        String newPlaylistName= faker.artist().name();
        mainPage.renamePlaylist(playlistId, newPlaylistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, newPlaylistName));
    }
    @Test
    public void playlistTests_createNewPlaylist_playlistCreated_COPY1(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, playlistName));
    }
    @Test
    public void playlistTests_renameNewPlaylist_playlistRenamed_COPY1() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        String newPlaylistName= faker.artist().name();
        mainPage.renamePlaylist(playlistId, newPlaylistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, newPlaylistName));
    }

    @Test
    public void playlistTests_createNewPlaylist_playlistCreated_COPY2(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, playlistName));
    }
    @Test
    public void playlistTests_renameNewPlaylist_playlistRenamed_COPY2() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        String newPlaylistName= faker.artist().name();
        mainPage.renamePlaylist(playlistId, newPlaylistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, newPlaylistName));
    }
    @Test
    public void playlistTests_createNewPlaylist_playlistCreated_COPY3(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, playlistName));
    }
    @Test
    public void playlistTests_renameNewPlaylist_playlistRenamed_COPY3() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        String newPlaylistName= faker.artist().name();
        mainPage.renamePlaylist(playlistId, newPlaylistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, newPlaylistName));
    }
}
