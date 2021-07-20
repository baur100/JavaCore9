package simpleTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;

public class Playlist {
    WebDriver driver;

    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");

        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
        // css selector by tag - button
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("testrun7809@gmail.com");
        passwordField.sendKeys("12345");
        submitButton.click();
        Thread.sleep(1500);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1500);
        driver.quit();
    }

    @Test
    public void createPlaylist_newPlaylist_created() throws InterruptedException {
        WebElement plusButton = driver.findElement(By.cssSelector("[class='fa fa-plus-circle control create']"));
        plusButton.click();
        Thread.sleep(1500);

        WebElement newPlayListButton=driver.findElement(By.xpath("//*[text()='New Playlist']"));
        newPlayListButton.click();
        Thread.sleep(1500);

        WebElement placeholderNamePlayList = driver.findElement(By.xpath("//*[@class=\"create\"]/input"));
        placeholderNamePlayList.click();
        Thread.sleep(1500);
        placeholderNamePlayList.sendKeys("Test1");
        placeholderNamePlayList.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        boolean popUpPlaylistCreated=false;
        try{
            driver.findElement(By.cssSelector("[class='success show']"));
            popUpPlaylistCreated = true;
        } catch (NoSuchElementException ignored){}
        Assert.assertTrue(popUpPlaylistCreated);
    }
}
