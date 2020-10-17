package uk.co.amazon;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import uk.co.amazon.utils.WebDriverSettings;
import uk.co.amazon.utils.logger.TestListener;

@Listeners(TestListener.class)
public class AddIPhoneToBusketFirefoxTest extends BaseTest {

    @BeforeMethod
    public void setup() {
        driver = WebDriverSettings.settings("firefox");
        initialPages();
    }

    @Test
    public void testFirefox() {
        addAndDeleteIPhoneToBusket();
    }
}