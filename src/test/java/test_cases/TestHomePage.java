package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class TestHomePage extends BaseTest {

    @Test
    public void tesHomePage(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.navigateToHomePage("standard_user","secret_sauce");
        homePage.navigateToItemPage();
        Assert.assertTrue(homePage.isNavigatedToItemPage());
    }

}
