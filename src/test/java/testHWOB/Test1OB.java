package testHWOB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1OB {
    @Test
    public void loginTest_correctCredentials_loggedToApp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://koelapp.testpro.io/");


    }
}
