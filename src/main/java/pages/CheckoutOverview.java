package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverview {
    private final WebDriver driver;
    public CheckoutOverview (WebDriver driver){
        this.driver= driver;
    }
    private By assertElement = By.xpath("//div[text()=\"Checkout: Overview\"]");
    private By finishCheckoutBtn = By.className("btn_action");
    public By getAssertElement(){
        return assertElement;
    }

public void setFinishCheckout(){
        driver.findElement(finishCheckoutBtn).click();
}

public boolean isCheckedoutSuccessfully(){
        FinishCheckoutPage finishCheckoutPage = new FinishCheckoutPage(driver);
        return driver.findElement(finishCheckoutPage.getAsserElement()).isDisplayed();
}
}
