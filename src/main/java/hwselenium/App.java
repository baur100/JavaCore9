package hwselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    WebDriver driver = new ChromeDriver();

    driver.get("https://google.com");

    WebElement searchField = driver.findElement(By.cssSelector("[type='text']"));
    searchField.sendKeys("Дима");
    searchField.sendKeys(Keys.ENTER);
    Thread.sleep(5000);
    driver.quit();







    }
}