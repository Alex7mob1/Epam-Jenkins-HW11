package rozetka.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import rozetka.decorator.elements.TextArea;

public class CheckoutPage extends BasePage {

    private static final Logger LOG = LogManager.getLogger(CheckoutPage.class);

    @FindBy(xpath = "//*[contains(@class, 'js-total')]//*[contains(@class,'checkout-total__value')]")
    private TextArea totalPrice;

    public String getTotalPrice() {
        LOG.info("method getTotalPrice.");
        return totalPrice.getText();
    }
}