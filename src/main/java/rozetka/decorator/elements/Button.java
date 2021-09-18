package rozetka.decorator.elements;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import rozetka.decorator.ElementDecorator;
import rozetka.driver.DriverRepo;

public class Button extends ElementDecorator {

    private static final Logger LOG = LogManager.getLogger(Button.class);

    public Button(WebElement element) {
        super(element);
    }

    public void safeClick() {
        DriverRepo.getWebDriverWait()
                .ignoring(ElementClickInterceptedException.class)
                .until(driver -> {
                    LOG.info("method safeClick click.");
                    element.click();
                    return true;
                });
    }
}