package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver= driver;
    }

//  locate elements on login page:

    private By userNameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginBtn = By.id("login-button");
    private By errorBtn = By.className("error-button");

// Actions of Login page:

     public void navigateToHomePage(String userName, String password){
        driver.findElement(userNameField).sendKeys(userName);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginBtn).click();
    }

    public boolean isLoggedSuccessfully(){
         HomePage homePage = new HomePage(driver);
         return driver.findElement(homePage.getAssertElement()).isDisplayed();
    }
    public boolean isNotLoggedSuccessfully(){
        return driver.findElement(errorBtn).isDisplayed();
    }
}
