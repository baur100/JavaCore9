package pageObjectsTestsHW;

import myHelpers.TestObjectGenerator1;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlayListTestHW extends BaseTestHW{

    @Test
    public void playListTest_createPlayList_playListCreated() {
        String name = faker.funnyName().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPageHW = loginPage.login("Innamammadova584@gmail.com", "te$t$tudent");
        String playListId = mainPageHW.createPlaylist(name);
        Assert.assertTrue(mainPageHW.checkPlaylistExist(playListId, name));

    }
    @Test
    public void playListRenamePlayList_playListRenamed() {
        String name = TestObjectGenerator1.randomString(8);
        String newName = faker.ancient().god();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPageHW = loginPage.login("Innamammadova584@gmail.com", "te$t$tudent");
        String playListId = mainPageHW.createPlaylist(name);
        mainPageHW.renamePlaylist(playListId, newName);
        Assert.assertTrue(mainPageHW.checkPlaylistExist(playListId, newName));

    }
}