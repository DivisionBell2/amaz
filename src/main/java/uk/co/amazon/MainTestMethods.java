package uk.co.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uk.co.amazon.utils.logger.TestListener;


public abstract class MainTestMethods {
    public static WebDriver driver;

    public void clickOn(WebElement element) {
        TestListener.stepInfo("Click on ", element);
        element.click();
    }

    public void enterText(WebElement element, String text) {
        TestListener.stepInfo("Еnter text '" + text + "' in ", element);
        element.sendKeys(text);
    }

    public void waitElement(WebElement element) {
        TestListener.stepInfo("Wait for element is on the page ", element);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(element));
    }

    public void waitElementInvisible(WebElement element) {
        TestListener.stepInfo("Wait for element is not on the page ", element);
        new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOf(element));
    }

    public void moveToElement(WebElement element) {
        TestListener.stepInfo("Move to Element ", element);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
}
