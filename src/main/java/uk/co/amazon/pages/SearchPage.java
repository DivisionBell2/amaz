package uk.co.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.amazon.MainTestMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchPage extends MainTestMethods {
    public SearchPage(WebDriver d) {
        driver = d;
        PageFactory.initElements(d, this);
    }

    @FindBy(xpath = "//div[@class=\"sg-row\"]//h2/a/span[contains(., \"Apple iPhone 11\") and contains(., \"Black\")]/ancestor::div[@class=\"sg-row\"]//span[@class=\"a-price-whole\"]")
    public List<WebElement> iPhone11BlackPrice;

    public void selectGoodWithLowestPrice() {
        List<Integer> prices = new ArrayList<>();
        for (WebElement element : iPhone11BlackPrice) {
            prices.add(Integer.parseInt(element.getText()));
        }

        clickOn(iPhone11BlackPrice.get(prices.lastIndexOf(Collections.min(prices))));
    }
}