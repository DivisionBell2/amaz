package uk.co.amazon;

import org.testng.annotations.AfterMethod;
import uk.co.amazon.enums.UserData;
import uk.co.amazon.pages.*;

public class BaseTest extends MainTestMethods {
    protected MainPage main;
    protected LoginPage login;
    protected SearchPage search;
    protected ProductPage product;
    protected BusketPage busket;

    public void initialPages() {
        main = new MainPage(driver);
        login = new LoginPage(driver);
        search = new SearchPage(driver);
        product = new ProductPage(driver);
        busket = new BusketPage(driver);
    }

    public void addAndDeleteIPhoneToBusket() {
        String searchingProduct = "iphone11 256Gb black";

        main.clickOnSignIn();
        login.login(UserData.EMAIL.getValue(), UserData.PASSWORD.getValue());
        main.search(searchingProduct);
        search.selectGoodWithLowestPrice();
        product.putProductInBusket();
        busket.deleteProductFromBusket();
        busket.logout();
        login.waitLoginInput();
    }

    @AfterMethod
    public void endTest() {
        driver.quit();
    }
}
