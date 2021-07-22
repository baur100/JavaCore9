package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 200);
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
    private WebElement getNewPlaylistButton(){
        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
    }
    private WebElement getPlaylistTextField(){
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }

    public String createPlaylist(String playlistName){
        String playlistId = null;
        getFafaPlusButton().click();
        getNewPlaylistButton().click();
        getPlaylistTextField().click();
        getPlaylistTextField().sendKeys(playlistName);
        getPlaylistTextField().sendKeys(Keys.ENTER);
        //not sure ->
        By successShowBy = By.cssSelector("[class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(successShowBy));

        return (playlistId = driver.getCurrentUrl());
    }


}
