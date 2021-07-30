package simpleTestFlores;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;
    WebDriverWait wait;
    FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        fluentWait = new FluentWait<WebDriver>(driver)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementClickInterceptedException.class)
                .pollingEvery(Duration.ofMillis(100))
                .withTimeout(Duration.ofSeconds(10));

        wait = new WebDriverWait(driver, 10);
        driver.get("https://koelapp.testpro.io/");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void loginTest_correctCredentials_loggedToApp() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("koeluser06@testpro.io");
        passwordField.sendKeys("te$t$tudent");
        loginButton.click();
        Thread.sleep(1000);
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='home active']")));
        List<WebElement> homes = driver.findElements(By.xpath("//*[@class='home active']"));
        Assert.assertEquals(1, homes.size());
    }

    @Test
    public void loginTest_WrongCredentials_Error() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type='email']")));
        fluentWait.until(x->x.findElement(By.cssSelector("[type='email']")));
        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("koeluser06@testpro.io");
        passwordField.sendKeys("WrongPassword");
        loginButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='error']")));

        boolean logged = false;
        try {
            driver.findElement(By.cssSelector("[class='error']"));
            logged = true;
        } catch (NoSuchElementException ignored) {
        }
        Assert.assertTrue(logged);
    }
}
