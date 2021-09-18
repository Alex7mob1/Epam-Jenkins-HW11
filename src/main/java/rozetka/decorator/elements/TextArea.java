package rozetka.decorator.elements;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import rozetka.decorator.ElementDecorator;

public class TextArea extends ElementDecorator {

    private static final Logger LOG = LogManager.getLogger(TextArea.class);

    public TextArea(WebElement element) {
        super(element);
    }

    public String getText() {
        LOG.info("method getText click.");
        return element.getText();
    }
}