package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver= driver;
    }

    //  locate elements on Home page:
    private By assertElement = By.className("peek");
    private By selectItem = By.xpath("//div[text()=\"Sauce Labs Backpack\"]");

    public By getAssertElement(){
        return assertElement;
    }

    public void navigateToItemPage(){
        driver.findElement(selectItem).click();
    }

    public boolean isNavigatedToItemPage(){
        ItemPage itemPage = new ItemPage(driver);
        return driver.findElement(itemPage.getAssertElement()).isDisplayed();
    }
}
