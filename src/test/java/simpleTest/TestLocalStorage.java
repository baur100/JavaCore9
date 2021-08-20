package simpleTest;

import helpers.TestDataGenerator;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

// This method we can use instead of login before tests. It will generate token and push it to F12>Application>Local Storage
// It will save out time
public class TestLocalStorage {
    @Test
    public void setLocalStorage(){
        // 1. Create browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,1000");
//        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // 2. Generate token
        String token = TestDataGenerator.getToken().substring(7);
        // 3. Open page
        driver.get("https://bbb.testpro.io/#!/home");
        // 4. Call executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("localStorage.setItem(arguments[0],arguments[1])","jwt-token","\""+token+"\"");
        driver.navigate().refresh();

//        driver.quit();
    }
}
