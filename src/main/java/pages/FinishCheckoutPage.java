package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishCheckoutPage {
    private final WebDriver driver;
    public FinishCheckoutPage(WebDriver driver){
        this.driver= driver;
    }

    private By asserElement = By.xpath("//div[text()=\"Finish\"]");

    public By getAsserElement(){
        return asserElement;
    }
}
