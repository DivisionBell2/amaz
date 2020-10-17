package uk.co.amazon.pages;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.amazon.MainTestMethods;

public class LoginPage extends MainTestMethods {
    public LoginPage(WebDriver d) {
        driver = d;
        PageFactory.initElements(d, this);
    }

    @FindBy(id = "ap_email")
    public WebElement emailInput;
    @FindBy(id = "ap_password")
    public WebElement passwordInput;

    @FindBy(id = "continue")
    public WebElement continueButton;
    @FindBy(id = "signInSubmit")
    public WebElement signInButton;

    public void waitLoginInput() {
        waitElement(emailInput);
    }

    public void login(String email, String password) {
        enterText(emailInput, email);
        clickOn(continueButton);
        waitElement(passwordInput);
        enterText(passwordInput, password);
        clickOn(signInButton);
    }
}