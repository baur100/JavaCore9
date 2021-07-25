package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

//    private WebElement getEmailField(){
//        By emailBy = By.cssSelector("[type='email']");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
//        return driver.findElement(emailBy);
//    }

    // sometimes we can use custom wait. Example:
    private WebElement getEmailField(){
        By emailBy = By.cssSelector("[type='email']");
        for (int i=0; i<10; i++){
            try{
                WebElement email = driver.findElement(emailBy);
                return email;
            } catch (NoSuchElementException ee){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException xx){
                }
            }
        } throw new TimeoutException("No such element");
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
