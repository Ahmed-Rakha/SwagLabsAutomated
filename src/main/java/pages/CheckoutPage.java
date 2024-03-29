package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private final WebDriver driver;
    public CheckoutPage(WebDriver driver){
        this.driver= driver;
    }

    //  locate elements on CheckoutPage:

    private By assertElement = By.xpath("//div[text()=\"Checkout: Your Information\"]");
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueBtn = By.className("cart_button");

    public By getAssertElement(){
        return  assertElement;
    }
    public void fillUpCheckoutForm(String firstName, String lastName, String postalCode){
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(firstName);
        driver.findElement(postalCodeField).sendKeys(firstName);
        driver.findElement(continueBtn).click();
    }
    public boolean ischeckoutFilledUp(){
        CheckoutOverview checkoutOverview = new CheckoutOverview(driver);
        return driver.findElement(checkoutOverview.getAssertElement()).isDisplayed();
    }
}
