package uk.co.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.amazon.MainTestMethods;

public class BusketPage extends MainTestMethods {
    public BusketPage(WebDriver d) {
        driver = d;
        PageFactory.initElements(d, this);
    }

    @FindBy(xpath = "//input[@data-action=\"delete\"]")
    public WebElement deleteProductButton;

    @FindBy(xpath = "//div[@id=\"nav-tools\"]/a[1]")
    public WebElement userWidget;

    @FindBy(id = "nav-item-signout")
    public WebElement logoutLink;

    public void deleteProductFromBusket() {
        clickOn(deleteProductButton);
        waitElementInvisible(deleteProductButton);
    }

    public void logout() {
        moveToElement(userWidget);
        waitElement(logoutLink);
        clickOn(logoutLink);
    }
}
