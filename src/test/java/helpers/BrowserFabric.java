package helpers;

import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserFabric {
    public static WebDriver getWebDriver(BrowserType browserType){
        switch (browserType){
            case OPERA:
                return getOperaDriver();
            case EDGE:
                return getEdgeDriver();
            case FIREFOX:
                return getFirefoxDriver();
            default:
                return getChromedriver();
        }
    }

    private static WebDriver getOperaDriver() {
        System.setProperty("webdriver.opera.driver","operadriver.exe");
        return new OperaDriver();
    }

    private static WebDriver getEdgeDriver() {
        System.setProperty("webdriver.edge.driver","msedgedriver.exe");
        return new EdgeDriver();
    }

    private static WebDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("--width=1400");
        options.addArguments("--height=1000");
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        return new FirefoxDriver(options);
    }

    private static WebDriver getChromedriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,1000");
        options.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        return new ChromeDriver(options);
    }
}
