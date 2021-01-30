package pageObjectsHW;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.LoginPageLocators;

public class LoginPageHW extends BasePageHW {
    public LoginPageHW(WebDriver driver){
        super(driver);
    }
    private WebElement getEmailField(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(LoginPageLocators.cssEmailLocator)));
        return driver.findElement(By.cssSelector(LoginPageLocators.cssEmailLocator));
    }
    private WebElement getPasswordField(){
        return driver.findElement(LginPageLocatorsHW.byPassword);

    }
    private WebElement getLoginButton(){
        return driver.findElement(By.cssSelector("button"));
    }
    public MainPageHW login(String username, String password){
        getEmailField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return  new MainPageHW(driver);
    }
    public void open(){
        driver.get("https://koelapp.testpro.io/");
    }
    public boolean isErrorState() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error")));
        } catch (NoSuchElementException | TimeoutException ignored){};

        return driver.findElements(By.cssSelector(".error")).size()==1;
    }
}


