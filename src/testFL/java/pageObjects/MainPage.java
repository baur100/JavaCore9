package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isMain() {
        By homeBy = By.className("home");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
            return true;
        } catch (TimeoutException xx) {
            return false;
        }
    }

    private WebElement getFafaPlusButton(){
        By fafaPlusBy = By.cssSelector("[class='fa fa-plus-circle control create']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fafaPlusBy));
        return driver.findElement(fafaPlusBy);
    }
    private WebElement getNewPlaylistItem(){
        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
    }
    private WebElement getEditPlaylistField(){
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }

    public String createPlaylist(String playlistName){
        String playlistId = "";
        getFafaPlusButton().click();
        getNewPlaylistItem().click();
        getEditPlaylistField().click();
        getEditPlaylistField().sendKeys(playlistName);
        getEditPlaylistField().sendKeys(Keys.ENTER);
        By successShowBy = By.cssSelector("[class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(successShowBy));

        return driver.getCurrentUrl().split("/")[5];
    }

    public boolean checkPlaylist(String playlistId, String playlistName) {
        // Add scrolling page (or it won't work for Firefox)
        By playlistBy = By.cssSelector("[href='#!/playlist/"+playlistId+"']");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(playlistBy ));
            String name = driver.findElement(playlistBy).getText();
            return name.equals(playlistName);
        } catch (TimeoutException xx) {
            return false;
        }

    }

    public void renamePlaylist(String playlistId, String newPlaylistName) {
        // Scroll
        // By.cssSelector("[href='#!/playlist/"+playlistId+"']")
        // double click or right-click
        // Cmd+A highlight text
    }
}
