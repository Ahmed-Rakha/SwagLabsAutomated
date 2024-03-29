package test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestLoginPage extends BaseTest {

//    Test data
    String validUserName= "standard_user";
    String validPassword ="secret_sauce";
    String inValidUserName = "standard_userw";
    String inValidPassword ="secret_saucee";

@Test
    public void testValidLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToHomePage(validUserName,validPassword);
        Assert.assertTrue(loginPage.isLoggedSuccessfully());
    }

    @Test
    public void testInValidLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToHomePage(inValidUserName,inValidPassword);
        Assert.assertTrue(loginPage.isNotLoggedSuccessfully());

    }
}
