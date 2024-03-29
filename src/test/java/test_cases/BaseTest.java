package test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {

    WebDriver driver;
    String website_UT_URL = "https://www.saucedemo.com/v1/index.html";

    @BeforeMethod
    @Test
    public void setUp(){
        driver= new ChromeDriver();
        driver.navigate().to(website_UT_URL);
    }
    @AfterMethod
    @Test
    public void tearout(){
        driver.quit();
    }
}
