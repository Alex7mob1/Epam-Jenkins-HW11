package rozetka.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import rozetka.decorator.elements.Button;
import rozetka.decorator.elements.CheckBox;
import rozetka.decorator.elements.InputText;
import rozetka.driver.DriverRepo;

import java.util.concurrent.TimeUnit;

public class ProductTypePage extends BasePage {

    private static final Logger LOG = LogManager.getLogger(ProductTypePage.class);

    @FindBy(xpath = "//*[@data-filter-name='producer']//*[@type='search']")
    private InputText typeSearchBox;

    @FindBy(css = "ul[class='checkbox-filter ng-star-inserted'] ul[class='checkbox-filter'] li:first-child")
    private CheckBox firstBox;

    @FindBy(css = "option[value='2: expensive']")
    private Button expensiveFirst;

    @FindBy(css = "ul[class = 'catalog-grid ng-star-inserted'] >li:first-child")
    private Button firstProduct;

    public void inputTextInTypeSearchBox(String company) {
        DriverRepo.getWebDriverWait().until((ExpectedCondition<Boolean>) wdriver -> ((JavascriptExecutor) driver).executeScript(
                "return document.readyState"
        ).equals("complete"));
        DriverRepo.getWebDriverWait().pollingEvery(1, TimeUnit.SECONDS).until((ExpectedCondition<Object>) webDriver -> typeSearchBox.isDisplayed());
        LOG.info("method inputTextInTypeSearchBox.");
        typeSearchBox.safeInput(company);
        DriverRepo.getWebDriverWait().until(ExpectedConditions.numberOfElementsToBe(By
                .cssSelector("ul[class='checkbox-filter ng-star-inserted'] ul[class='checkbox-filter'] li:first-child"), 1));
    }

    public void clickOnFirstBox() {
        LOG.info("method clickOnFirstBox.");
        firstBox.setCheckBox();
    }

    public void clickOnExpensiveFirst() {
        LOG.info("method clickOnExpensiveFirst.");
        expensiveFirst.safeClick();
    }

    public void clickOnFirstProduct() {
        LOG.info("method clickOnFirstProduct.");
        firstProduct.safeClick();
    }
}