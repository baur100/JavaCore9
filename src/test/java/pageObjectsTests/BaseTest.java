package pageObjectsTests;

import enums.BrowserType;
import helpers.BrowserFactory;
import listeners.GetScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;

    @Parameters({"username", "password", "browser"})

    @BeforeMethod
    public void startUp(String email, String password, String browser) {
        username = email;
        this.password = password;
        // syntax line below "?" and ":" is equal if/else
        BrowserType browserType = browser.equals("chrome") ? BrowserType.CHROME : BrowserType.FIREFOX;
        driver = BrowserFactory.getDriver(browserType);

//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        driver = new ChromeDriver();

        //Chrome
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();

        //Firefox
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();

        //Opera
//        WebDriverManager.operadriver().setup();
//        driver = new OperaDriver();

        //Edge
//        WebDriverManager.edgedriver().setup();
//        driver = new EdgeDriver();
    }
    @AfterMethod (alwaysRun = true)
    public void tearDown(ITestResult iTestResult){
        if (iTestResult.getStatus()==iTestResult.FAILURE){
            GetScreenshot.capture(driver,iTestResult.getName());
        }
        driver.quit();
    }
}
