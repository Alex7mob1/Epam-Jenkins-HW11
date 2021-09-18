package rozetka.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import rozetka.decorator.elements.Button;

public class HomePage extends BasePage {

    private static final Logger LOG = LogManager.getLogger(HomePage.class);

    @FindBy(xpath = "//*[@class='sidebar sidebar_type_main']//*[contains(@href, 'computers-notebooks')]")
    private Button compLaptopBtn;

    public void clickOnCompLaptopBtn() {
        LOG.info("method clickOnCompLaptopBtn.");
        compLaptopBtn.safeClick();
    }
}