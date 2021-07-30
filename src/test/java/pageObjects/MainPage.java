package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{
    private static Logger logger= LogManager.getLogger(MainPage.class);
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
    private WebElement getCreatePlaylistField(){
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }

    public String createPlaylist(String playlistName){
        logger.debug("Create Playlist with name -> "+playlistName);
        getFafaPlusButton().click();
        getNewPlaylistItem().click();
        getCreatePlaylistField().click();
        getCreatePlaylistField().sendKeys(playlistName);
        getCreatePlaylistField().sendKeys(Keys.ENTER);
        By successShowBy = By.cssSelector("[class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(successShowBy));

        return driver.getCurrentUrl().split("/")[5];
    }

    public boolean checkPlaylist(String playlistId, String playlistName) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            By playlistBy = getPlaylistBy(playlistId);
            WebElement playlistLocatedByID= driver.findElement(playlistBy);
            js.executeScript("arguments[0].scrollIntoView();", playlistLocatedByID);
            wait.until(ExpectedConditions.visibilityOfElementLocated(playlistBy ));
            String name = driver.findElement(playlistBy).getText();
            return name.equals(playlistName);
        } catch (TimeoutException xx) {
            return false;
        }
    }

    private By getPlaylistBy(String playlistId){
        return By.cssSelector("[href='#!/playlist/"+playlistId+"']");
    }

    public void renamePlaylist(String playlistId, String newPlaylistName) {
        logger.info("Updating playlist name with id: "+playlistId+". New name: "+newPlaylistName);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        By playlistBy = getPlaylistBy(playlistId);
        WebElement playlistLocatedByID= driver.findElement(playlistBy);
        js.executeScript("arguments[0].scrollIntoView();", playlistLocatedByID);

        Actions action = new Actions(driver);
        action.moveToElement(playlistLocatedByID).doubleClick().build().perform();

        WebElement editingField= getEditPlaylistField();
        editingField.sendKeys(Keys.COMMAND+"A");
        editingField.sendKeys(newPlaylistName);
        editingField.sendKeys(Keys.ENTER);

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"+"/following-sibling::input")));

        By successShowBy = By.cssSelector("[class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(successShowBy));
    }

    private WebElement getEditPlaylistField() {
        By editBy= By.cssSelector("[type='text']");
        wait.until(ExpectedConditions.elementToBeClickable(editBy));
        return driver.findElement(editBy);
   }
}
