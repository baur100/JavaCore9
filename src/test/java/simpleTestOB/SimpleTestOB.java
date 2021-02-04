package simpleTestOB;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTestOB {
    @Test
    public void loginTest_correctCredentials_loggedToApp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(1000);
        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));// by tag
        emailField.sendKeys("koeluser06@testpro.io");
        passwordField.sendKeys("te$t$tudent");
        loginButton.click();
        Thread.sleep(1500);
        boolean logged=false;
        //boolean logged = driver.findElement(By.cssSelector(".home")).isDDisplayed();
        //Assert.assertTrue(logged);

        //OR
        //List<WebElement> homes = driver.findElements(By.xpath("//*[@class='home active']"));
        //   Assert.assertEquals(1,homes.size());
        try{
            driver.findElement(By.className("home"));
            logged=true;
        } catch(NoSuchElementException ignored){}
        Assert.assertTrue(logged);
        Thread.sleep(3000);
        driver.close();
    }
}
