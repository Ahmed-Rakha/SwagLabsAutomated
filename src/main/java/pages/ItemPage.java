package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage {
    private final WebDriver driver;
    public ItemPage(WebDriver driver){
        this.driver= driver;
    }

    //  locate elements on Item page:
    private By assertElement = By.className("inventory_details_price");
    private By addToCartBtn = By.className("btn_inventory");
    private By cartIcon = By.id("shopping_cart_container");

    public By getAssertElement(){
        return assertElement;
    }

    public void addItemToCart(){
        driver.findElement(addToCartBtn).click();
    }
    public void navigateToCartPage(){
        driver.findElement(cartIcon).click();
    }
    public boolean isAddedToCartPageSuccessfully(){
        CartPage cartPage = new CartPage(driver);
        return driver.findElement(cartPage.getAssertElement()).isDisplayed();
    }
}
