package uk.co.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.amazon.MainTestMethods;

public class MainPage extends MainTestMethods {
    public MainPage(WebDriver d) {
        driver = d;
        PageFactory.initElements(d, this);
    }

    @FindBy(id = "nav-link-accountList")
    public WebElement signInLink;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchInput;

    @FindBy(id = "nav-search-submit-text")
    public WebElement searchButton;

    public void clickOnSignIn() {
        clickOn(signInLink);
    }

    public void search(String text) {
        waitElement(searchInput);
        enterText(searchInput, text);
        clickOn(searchButton);
    }

}
