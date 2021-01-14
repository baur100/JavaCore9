package pageObjectDi;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class MainPageDi {
    private WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;
    private String Script;
    private Object Arguments;



    public MainPageDi(WebDriver driver) {
        this.driver = driver;


        wait = new WebDriverWait(driver, 10, 100);
        fluentWait = new FluentWait<WebDriver>(driver)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(NoSuchElementException.class)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100));
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

    private WebElement getNewPlaylistFiled() {
        return driver.findElement(By.xpath("//*[@class='create']/input"));

    }


    public boolean isOpen() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".home")));
        return driver.findElements(By.cssSelector(".home")).size() == 1;

    }

    public String createPlaylist(String name) {
        clickPlusButton();
        getNewPlaylistFiled().sendKeys(name);
        getNewPlaylistFiled().sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".success.show")));
        String url = driver.getCurrentUrl();
        return url.split("/")[5];


    }

    public boolean checkPlaylistExist(String playlistId, String name) {
        WebElement newPlaylist = driver.findElement(By.xpath("//*[@href='#!/playlist/" + playlistId + "']"));
        return newPlaylist.getText().equals(name);


    }
    public void renamePlaylist (String playlistId, String newName) throws InterruptedException {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebElement playlistToRename = driver.findElement(By.xpath("//*[@href='#!/playlist/"+ playlistId +"']"));
    js.executeScript("arguments[0].scrollIntoView();", playlistToRename);

    Actions actions = new Actions(driver);
    //actions.doubleClick(playlistToRename).perform();

    Actions actionsRightClick = new Actions(driver);
    actions.contextClick(playlistToRename).perform();

    }
}