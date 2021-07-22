package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 200);
    }

    private WebElement getEmailField(){
        By emailBy = By.cssSelector("[type='email']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
        return driver.findElement(emailBy);
    }
    private WebElement getPasswordField(){
        return driver.findElement(By.cssSelector("[type='password']"));
    }
    private WebElement getLogInButton(){
        return driver.findElement(By.cssSelector("button"));
    }

    public MainPage loginToApp(String username, String password){
//        WebElement emailField = getEmailField();
//        emailField.sendKeys(username); - 2 lines, it's that we would use, but we can use just next line instead ->
        getEmailField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLogInButton().click();
        return new MainPage(driver);
    }

    public void open(){
        driver.get("https://bbb.testpro.io/");
    }
    public boolean isError(){
        By errorBy = By.className("error");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorBy));
            return true;
        } catch (TimeoutException xx) {
            return false;
        }
    }

}
