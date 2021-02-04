package pageObjectsTestOB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageOB {
    private WebDriver driver;
    private WebDriverWait wait;
    public MainPageOB(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10,100);
    }

    public boolean isOpen() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".home")));
        return driver.findElements(By.cssSelector(".home")).size()==1;
    }
}
