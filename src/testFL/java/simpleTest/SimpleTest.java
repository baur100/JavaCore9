package simpleTest;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SimpleTest {
    private WebDriver driver;
    private Wait<WebDriver> wait;
    private Wait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
//        implicitlyWait ->
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        Explicit wait WebDriverWait ->
        wait= new WebDriverWait(driver,10, 200);

//        FluentWait -> in Java doesn't work so good
        fluentWait= new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(200))
                .withTimeout(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(StaleElementReferenceException.class);


        driver.get("https://bbb.testpro.io/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void loginTest_correctCredentials_loggedToApp() {
        By emailBy = By.cssSelector("[type='email']");
        By passwordBy = By.cssSelector("[type='password']");
        By buttonLoginBy = By.cssSelector("button");
        By homeBy= By.cssSelector(".home");

        wait.until(ExpectedConditions.elementToBeClickable(emailBy));
        WebElement emailField = driver.findElement(emailBy);
        WebElement passwordField = driver.findElement(passwordBy);
        // css selector by tag - button
        WebElement submitButton = driver.findElement(buttonLoginBy);

        emailField.sendKeys("testrun7809@gmail.com");
        passwordField.sendKeys("12345");
        submitButton.click();


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

        wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
//        3rd way - will look for all element with this locator, and add them to the List
        List<WebElement> homes = driver.findElements(homeBy);
        Assert.assertEquals(1,homes.size());
    }

    @Test
    public void loginTest_wrongCredentials_errorFrame() {
        By emailBy = By.cssSelector("[type='email']");
        By passwordBy = By.cssSelector("[type='password']");
        By errorBy= By.className("error");
        fluentWait.until(x->x.findElement(emailBy).isDisplayed());

        WebElement emailField = driver.findElement(emailBy);
        WebElement passwordField = driver.findElement(passwordBy);
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("testrun7809@gmail.com");
        passwordField.sendKeys("WrongPassword");
        submitButton.click();

        fluentWait.until(x->x.findElement(errorBy).isDisplayed());
        boolean errorFrame=false;
        try{
            driver.findElement(errorBy);
            errorFrame = true;
        } catch (NoSuchElementException ignored){}
        Assert.assertTrue(errorFrame);
    }

}
