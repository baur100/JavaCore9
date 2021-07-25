package pageObjectsTests;

import enums.BrowserType;
import helpers.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;

    @BeforeMethod
    public void startUp() {
        username = "testrun7809@gmail.com";
        password = "12345";
        driver = BrowserFactory.getDriver(BrowserType.FIREFOX);


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
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
