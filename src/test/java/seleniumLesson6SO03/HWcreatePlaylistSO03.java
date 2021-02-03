package seleniumLesson6SO03;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HWcreatePlaylistSO03 {
    WebDriver driver;
    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(1000);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
    @Test
    public void loginTest_correctCredentials_loggedToApp() throws InterruptedException {


        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("koeluser06@testpro.io");
        passwordField.sendKeys("te$t$tudent");
        loginButton.click();

        Thread.sleep(1500);
        boolean logged = false;
        try{
            driver.findElement(By.className("home"));
            logged=true;
        } catch (NoSuchElementException ignored){}

    @Test
    public void createNewPlayList() {
            WebElement plusButton = driver.findElement(By.cssSelector("[class='fa fa-plus-circle']"));
            plusButton.click();
            WebElement newPlayList = driver.findElement(By.cssSelector("[class='create']"));
            newPlayList.sendKeys("newPlayListSO03");
            newPlayList.sendKeys(Keys.ENTER);

        }


    }
}
