package test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestCheckoutOverview extends BaseTest {
    //Test Data
    String firstName= "Ahmed";
    String lastName = "Rakha";
    String postalCode = "29938";
    @Test
    public void testCheckoutOverview(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ItemPage itemPage = new ItemPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutOverview checkoutOverview = new CheckoutOverview(driver);
        loginPage.navigateToHomePage("standard_user","secret_sauce");
        homePage.navigateToItemPage();
        itemPage.addItemToCart();
        itemPage.navigateToCartPage();
        cartPage.setCheckout();
        checkoutPage.fillUpCheckoutForm(firstName,lastName,postalCode);
        checkoutOverview.setFinishCheckout();
        Assert.assertTrue(checkoutOverview.isCheckedoutSuccessfully());

    }
}
