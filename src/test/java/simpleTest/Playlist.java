package simpleTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;

public class Playlist {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        wait= new WebDriverWait(driver,10, 200);

        driver.get("https://bbb.testpro.io/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1500);
        driver.quit();
    }

    @Test
    public void createPlaylist_newPlaylist_created() {
        By emailBy = By.cssSelector("[type='email']");
        By passwordBy = By.cssSelector("[type='password']");
        By buttonLoginBy = By.cssSelector("button");
        By fafaPlusControlBy= By.cssSelector("[class='fa fa-plus-circle control create']");
        WebElement emailField = driver.findElement(emailBy);
        WebElement passwordField = driver.findElement(passwordBy);
        WebElement submitButton = driver.findElement(buttonLoginBy);

        emailField.sendKeys("testrun7809@gmail.com");
        passwordField.sendKeys("12345");
        submitButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(fafaPlusControlBy));
        WebElement plusButton = driver.findElement(fafaPlusControlBy);
        plusButton.click();

        WebElement newPlayListButton=driver.findElement(By.xpath("//*[text()='New Playlist']"));
        newPlayListButton.click();
        WebElement placeholderNamePlayList = driver.findElement(By.xpath("//*[@class='create']/input"));
        placeholderNamePlayList.click();
        placeholderNamePlayList.sendKeys("Test1");
        placeholderNamePlayList.sendKeys(Keys.ENTER);
        By successShowBy = By.cssSelector("[class='success show']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(successShowBy));
        WebElement green = driver.findElement(successShowBy);
        Assert.assertTrue(green.isDisplayed());

//        boolean popUpPlaylistCreated=false;
//        try{
//            driver.findElement(successShowBy);
//            popUpPlaylistCreated = true;
//        } catch (NoSuchElementException ignored){}
//        Assert.assertTrue(popUpPlaylistCreated);
    }
}
