package simpleTestHW;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class HWSimpleTest {
    WebDriver driver;
    WebDriverWait wait;
    FluentWait<WebDriver> fluentWait;
    @BeforeMethod
    public void startUp()  {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,10,100);
        fluentWait = new FluentWait<WebDriver>(driver)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementClickInterceptedException.class)
                .pollingEvery(Duration.ofMillis(100))
                .withTimeout(Duration.ofSeconds(10));


        driver.get("https://koelapp.testpro.io/");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
    @Test
    public void loginTest_correctCredentials_loggedToApp() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("Innamammadova584@gmail.com");
        passwordField.sendKeys("te$t$tudent");
        loginButton.click();


//        boolean logged = false;
//        try{
//            driver.findElement(By.className("home"));
//            logged= true;
//        } catch (NoSuchElementException ignored){}
//        Assert.assertTrue(logged);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='home active']")));
        List<WebElement> homes = driver.findElements(By.xpath("//*[@class='home active']"));
        Assert.assertEquals(1,homes.size());
    }


    @Test
    public void loginTest_wrongCredentials_errorFrame() {

        WebElement emailField = driver.findElement(By.cssSelector("[type= 'email']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("innamammadova584@gmail.com");
        passwordField.sendKeys("test$tudent");
        loginButton.click();


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

    @Test
    public void createPlayList() throws InterruptedException {
        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("Innamammadova584@gmail.com");
        passwordField.sendKeys("te$t$tudent");
        loginButton.click();

        Thread.sleep(1500);
        WebElement plusButton = driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
        plusButton.click();
        WebElement emptyField = driver.findElement(By.xpath("//*[@placeholder='↵ to save']"));
        emptyField.sendKeys("MyPlayList");
        emptyField.sendKeys(Keys.RETURN);
      
    }
}