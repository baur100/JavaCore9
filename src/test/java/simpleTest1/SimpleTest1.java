package simpleTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest1 {
    @Test
    public void loginTest_correctCredentials_loggedToApp () throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get ("https://accounts.myherbalife.com/?appId=1&locale=ru-RU&redirect=https://www.myherbalife.com/");
        WebElement emailField = driver.findElement(By.cssSelector("[id='Username']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("[id='submit']"));

        emailField.sendKeys("dshpakin@gmail.com");
        passwordField.sendKeys("wrongPassword");
        loginButton.click();

        Thread.sleep(2000);
        boolean logged= false;

        try {
            driver.findElement(By.xpath("//*[@role='banner']"));
            logged=true;
        } catch (NoSuchElementException ignored){}
        Assert.assertTrue(logged);

        Thread.sleep(10000);

        driver.close();


    }

}
