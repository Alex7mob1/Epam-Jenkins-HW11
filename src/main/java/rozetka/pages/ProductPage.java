package rozetka.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import rozetka.decorator.elements.Button;

public class ProductPage extends BasePage {

    private static final Logger LOG = LogManager.getLogger(ProductPage.class);

    @FindBy(xpath = "//*[contains(@class, 'button_with_icon button_color_green ')]")
    private Button buyButton;

    public void clickOnBuyButton() {
        LOG.info("method clickOnBuyButton.");
        buyButton.safeClick();
    }
}