package playList;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlayList {

    @Test
    public void login_createPlayList_verification () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get ("https://koelapp.testpro.io/");
        Thread.sleep(1000);
        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("koeluser06@testpro.io");
        passwordField.sendKeys("te$t$tudent");
        loginButton.click();
        Thread.sleep(2000);
        WebElement addPlaylist = driver.findElement(By.cssSelector("[class='fa fa-plus-circle control create']"));
        Thread.sleep(2000);
        addPlaylist.click();
        WebElement namePlaylist =driver.findElement(By.cssSelector("[placeholder='↵ to save']"));
        namePlaylist.sendKeys("Dmitry's playlist");
        namePlaylist.sendKeys(Keys.RETURN);

      //  Thread.sleep(2000);
      //  boolean created = false;
      //  try { driver.findElement(By.xpath("//*[@class='active']"));
     //       created=true;}
     //   catch (NoSuchElementException ignored){}
      //  Assert.assertTrue(created);
     //   Thread.sleep(2000);
     //   driver.close();





    }
}
