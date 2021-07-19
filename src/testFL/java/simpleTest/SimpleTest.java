package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class SimpleTest {
    @Test
    public void loginTest_correctCredentials_loggedToApp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");

        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
        // css selector by tag - button
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("testrun7809@gmail.com");
        passwordField.sendKeys("12345");
        submitButton.click();
        Thread.sleep(3000);

//        1st way - correct way:
//        boolean logged=false;
//        try{
//            driver.findElement(By.className("home"));
//            logged = true;
//        } catch (NoSuchElementException ignored){}

//        also can use 2nd way - working good, if test is working. if not it throws an exception - it's not good
//         (vs first test fails on assertion):
//        boolean logged = driver.findElement(By.cssSelector(".home")).isDisplayed();
//        Assert.assertTrue(logged);

//        3rd way - will look for all element with this locator, and add them to the List
        List<WebElement> homes = driver.findElements(By.cssSelector(".home"));
        Assert.assertEquals(1,homes.size());



        Thread.sleep(1000);
        driver.quit();

    }

    @Test
    public void loginTest_wrongCredentials_errorFrame() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");

        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("testrun7809@gmail.com");
        passwordField.sendKeys("WrongPassword");
        submitButton.click();
        Thread.sleep(1500);

        boolean errorFrame=false;
        try{
            driver.findElement(By.className("error"));
            errorFrame = true;
        } catch (NoSuchElementException ignored){}
        Assert.assertTrue(errorFrame);

        Thread.sleep(1500);
        driver.quit();
    }

}
