package rozetka.decorator.elements;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import rozetka.decorator.ElementDecorator;

public class InputText extends ElementDecorator {

    private static final Logger LOG = LogManager.getLogger(InputText.class);

    public InputText(WebElement element) {
        super(element);
    }

    public void safeInput(CharSequence... charSequences) {
        LOG.info("method safeInput click.");
        element.clear();
        element.sendKeys(charSequences);
    }

    public boolean isDisplayed() {
        LOG.info("method isDisplayed.");
        return element.isDisplayed();
    }
}