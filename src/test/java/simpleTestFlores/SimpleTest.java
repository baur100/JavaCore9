package simpleTestFlores;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SimpleTest {
    @Test
    public void loginTest_correctCredentials_loggedToApp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver  = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");
        Thread.sleep(1000);

        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("koeluser06@testpro.io");
        passwordField.sendKeys("te$t$tudent");
        loginButton.click();

        Thread.sleep(1500);
        // 1st way
//        boolean logged = false;
//        try {
//            driver.findElement(By.className("home"));
//            logged = true;
//        }catch (NoSuchElementException ignored){}
//        Assert.assertTrue(logged);

        // 2nd way - not the best (will give an exception if the test fails)
//        boolean logged = driver.findElement(By.cssSelector(".home")).isDisplayed();
//        Assert.assertTrue(logged);

        //3rd way - as good, as the 1st
        List<WebElement> homes = driver.findElements(By.xpath("//*[class='homeactive']"));
        Assert.assertEquals(1, homes.size());

        Thread.sleep(3000);
        driver.close();
    }
}
