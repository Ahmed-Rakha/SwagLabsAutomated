package test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ItemPage;
import pages.LoginPage;

public class TetsCartPage extends BaseTest{

@Test
    public void testCartPage(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ItemPage itemPage = new ItemPage(driver);
        CartPage cartPage = new CartPage(driver);
        loginPage.navigateToHomePage("standard_user","secret_sauce");
        homePage.navigateToItemPage();
        itemPage.addItemToCart();
        itemPage.navigateToCartPage();
        cartPage.setCheckout();
        Assert.assertTrue(cartPage.isNavigatedToCheckedoutPage());
    }
}
