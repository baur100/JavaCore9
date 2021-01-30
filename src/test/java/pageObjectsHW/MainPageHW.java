package pageObjectsHW;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.Element;
import java.time.Duration;

public class MainPageHW extends BasePageHW {
    public MainPageHW(WebDriver driver){
        super(driver);
    }
    private void clickPlusButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".fa-plus-circle")));
        for (int i = 0; i < 5; i++) {
            try {
                driver.findElement(By.cssSelector(".fa-plus-circle")).click();
                break;
            } catch (ElementClickInterceptedException ignored) {
            }
        }
    }
    private WebElement getEditPlaylistField(){
        return driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));

    }

    private WebElement getNewPlayListField() {
        return driver.findElement(By.xpath("//*[@class= 'create']/input"));
    }

    public boolean isOpen() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".home")));
        return driver.findElements(By.cssSelector(".home")).size() == 1;

    }

    public String createPlayList(String name) {
        clickPlusButton();
        getNewPlayListField().sendKeys(name);
        getNewPlayListField().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("success.show")));
        String url = driver.getCurrentUrl();
        return url.split("/")[5];
    }

    public boolean checkPlaylistExist(String playlistId, String name) {
        WebElement newPlaylist = driver.findElement(By.xpath("//*[@href='#!/playlist/" + playlistId + "']"));
        return newPlaylist.getText().equals(name);
    }
    public void reNamePlayList(String playlistId, String newName){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement playlistToRename = driver.findElement(By.xpath("//*[@href='#!/playlist/"+ playlistId +"']"));
        js.executeScript("arguments[0].scrollIntoView();", playlistToRename);
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.id("ID"));
        actions.doubleClick(playlistToRename).perform();

        getEditPlaylistField().sendKeys(Keys.CONTROL +"a");
        getEditPlaylistField().sendKeys(newName);
        getEditPlaylistField().sendKeys(Keys.ENTER);



    }
}
