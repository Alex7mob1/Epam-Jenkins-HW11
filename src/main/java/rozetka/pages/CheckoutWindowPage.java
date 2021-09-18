package rozetka.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import rozetka.decorator.elements.Button;

public class CheckoutWindowPage extends BasePage {

    private static final Logger LOG = LogManager.getLogger(CheckoutWindowPage.class);

    @FindBy(css = "a[href='https://rozetka.com.ua/checkout/']")
    private Button checkoutBtn;

    public void clickOnCheckoutBtn() {
        LOG.info("method clickOnCheckoutBtn.");
        checkoutBtn.safeClick();
    }
}