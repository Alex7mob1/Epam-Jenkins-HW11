package rozetka.decorator.elements;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import rozetka.decorator.ElementDecorator;
import rozetka.driver.DriverRepo;

public class CheckBox extends ElementDecorator {

    private static final Logger LOG = LogManager.getLogger(CheckBox.class);


    public CheckBox(WebElement element) {
        super(element);
    }

    public void setCheckBox() {
        DriverRepo.getWebDriverWait()
                .ignoring(StaleElementReferenceException.class)
                .until(driver -> {
                    if (!element.isSelected()) {
                        LOG.info("method setCheckBox click.");
                        element.click();
                    } else {
                        LOG.info("Box already checked");
                    }
                    return true;
                });
    }
}