package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private final WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver= driver;
    }

    //  locate elements on Cart page:

    private By assertElement = By.className("inventory_item_name");
    private By checkoutBtn = By.className("checkout_button");
    public By getAssertElement(){
        return  assertElement;
    }

    public void setCheckout(){
        driver.findElement(checkoutBtn).click();
    }
    public boolean isNavigatedToCheckedoutPage(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        return  driver.findElement(checkoutPage.getAssertElement()).isDisplayed();
    }
}
