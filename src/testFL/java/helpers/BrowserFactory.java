package helpers;

import enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserFactory {
    public static WebDriver getDriver(BrowserType browser) {
        // can use this structure with switch if we have multiple options, instead of if/else ->
        switch (browser) {
            //Edge and Opera do not work headless ->
//            case EDGE: return getEdgeDriver();
//            case OPERA: return getOperaDriver();
            case FIREFOX: return getFirefoxDriver();
            default: return getChromeDriver();
        }
    }

    private static WebDriver getChromeDriver() {
        // With these 3 lines below we will run headless mode.
        // if need to run with browser, needs to comment them and delete "options" variable from line -> return new ChromeDriver(options);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,1000");
        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(options);
    }

    private static WebDriver getFirefoxDriver(){
        // With these 4 lines below we will run headless mode (4 lines vs 3 lines for Chrome, because it(options.addArguments) works different for Firefox).
        // if need to run with browser, needs to comment them and delete "options" variable from line -> return new ChromeDriver(options);
        FirefoxOptions options= new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("--width=1400");
        options.addArguments("--height=1000");
        WebDriverManager.firefoxdriver().setup();
        // !!! if we delete option it will run with Browser !!!
        return new FirefoxDriver(options);
    }

//    private static WebDriver getEdgeDriver(){
//        WebDriverManager.edgedriver().setup();
//        return new EdgeDriver();
//    }
//
//    private static WebDriver getOperaDriver(){
//        WebDriverManager.operadriver().setup();
//        return new OperaDriver();
//    }

}
