package rozetka.pages.panel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import rozetka.decorator.elements.Button;
import rozetka.decorator.elements.InputText;
import rozetka.pages.BasePage;

public class SearchPanel extends BasePage {

    private static final Logger LOG = LogManager.getLogger(SearchPanel.class);

    @FindBy(xpath = "//*[@name='search']")
    private InputText searchBox;

    @FindBy(xpath = "//*[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']")
    private Button searchButton;

    public void inputTextInSearchBox(String type) {
        LOG.info("method inputTextInSearchBox.");
        searchBox.safeInput(type);
    }

    public void clickOnSearchButton() {
        LOG.info("method clickOnSearchButton.");
        searchButton.safeClick();
    }
}