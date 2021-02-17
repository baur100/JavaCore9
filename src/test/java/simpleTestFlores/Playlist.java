package simpleTestFlores;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Playlist {
    WebDriver driver;
    String newPlaylistName;
    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver  = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(1000);
    }
    @AfterMethod
    public void tearDown () throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
    @Test
    public void createPlaylist() throws InterruptedException {
        newPlaylistName = "AAtest1";
        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("koeluser06@testpro.io");
        passwordField.sendKeys("te$t$tudent");
        loginButton.click();

        Thread.sleep(1500);

        WebElement createPlaylistButton = driver.findElement(By.cssSelector("[class='fa fa-plus-circle control create']"));
        createPlaylistButton.click();

        WebElement inputFieldPlaylist = driver.findElement(By.cssSelector("[placeholder='↵ to save']"));
        inputFieldPlaylist.click();
        inputFieldPlaylist.sendKeys(newPlaylistName);
        inputFieldPlaylist.sendKeys(Keys.RETURN);

        driver.navigate().refresh();
        Thread.sleep(1000);


        boolean created = false;
        try{
            driver.findElement(By.xpath("//*[text()='"+newPlaylistName+"']"));
            created =true;
        }catch (NoSuchElementException ignored){}
        Assert.assertTrue(created);
    }
}
