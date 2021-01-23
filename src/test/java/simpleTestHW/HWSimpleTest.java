package simpleTestHW;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;


public class HWSimpleTest {
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

        emailField.sendKeys("Innamammadova584@gmail.com");
        passwordField.sendKeys("te$t$tudent");
        loginButton.click();

        Thread.sleep(1500);
        boolean logged = false;
        try{
            driver.findElement(By.className("home"));
            logged= true;
        } catch (NoSuchElementException ignored){}
        Assert.assertTrue(logged);

    }

    @Test
    public void loginTest_wrongCredentials_errorFrame() throws InterruptedException {

        WebElement emailField = driver.findElement(By.cssSelector("[type= 'email']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("innamammadova584@gmail.com");
        passwordField.sendKeys("test$tudent");
        loginButton.click();

        Thread.sleep(1000);
//        boolean logged = false;
//        try{
//            driver.findElement(By.xpath("//*[@class='error']"));
//            logged = true;
//        }catch (NoSuchElementException ignored){}
//        boolean error = false;
//        Assert.assertFalse(error);

        List<WebElement> homes = driver.findElements(By.cssSelector(".error"));
        Assert.assertEquals(1, homes.size());



    }
}