package uk.co.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.amazon.MainTestMethods;

public class ProductPage extends MainTestMethods {
    public ProductPage(WebDriver d) {
        driver = d;
        PageFactory.initElements(d, this);
    }

    @FindBy(id = "add-to-cart-button")
    public WebElement busketButton;
    @FindBy(id = "attachSiNoCoverage-announce")
    public WebElement noAddOtherOptionsButton;
    @FindBy(id = "attach-sidesheet-view-cart-button")
    public WebElement goToBusketButton;

    public void putProductInBusket() {
        waitElement(busketButton);
        clickOn(busketButton);
        waitElement(noAddOtherOptionsButton);
        clickOn(noAddOtherOptionsButton);
        waitElement(goToBusketButton);
        clickOn(goToBusketButton);
    }
}
