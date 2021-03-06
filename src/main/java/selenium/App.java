package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        WebElement searchField = driver.findElement(By.xpath("//*[@type='text']"));
        searchField.sendKeys("Java");

        searchField.sendKeys(Keys.ENTER);

        Thread.sleep(5000);
        driver.quit();
    }
}
