package test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.LoginPage;

public class TestItemPage extends BaseTest{
@Test
    public void testItemPage(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ItemPage itemPage = new ItemPage(driver);
        loginPage.navigateToHomePage("standard_user","secret_sauce");
        homePage.navigateToItemPage();
        itemPage.addItemToCart();
        itemPage.navigateToCartPage();
        Assert.assertTrue(itemPage.isAddedToCartPageSuccessfully());
    }
}
