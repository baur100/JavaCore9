package pageObjects;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

// This class "LoginPageFactory", just to show how @FindBy working. It will be good for Stale Element Reference Exception.

public class LoginPageFactory {
    private WebDriver driver;

    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(driver,this.); -  we will do in other way, in 2 steps, so we don't have to use Thread.sleep ->
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,5); //with this we don't need waiters, it will be waiting for each element if needs, when we calling them
        PageFactory.initElements(factory, this);
    }

    @FindBy (css = "[type='email']")
    private WebElement email;

    @FindBy (xpath = "//*[@type='password']")
    private WebElement password;

    @FindBy (tagName = "button")
    private WebElement loginButton;

    @FindBy (className = "error")
    private WebElement error;

    public void open(){
        driver.get("https://bbb.testpro.io/");
    }

    public MainPage loginToApp(String username, String password){
        email.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
        return new MainPage(driver);
    }

    public boolean isErrorFrame(){
        try{
            return error.isDisplayed();
        } catch (TimeoutException xx) {
            return false;
        }
    }
}
