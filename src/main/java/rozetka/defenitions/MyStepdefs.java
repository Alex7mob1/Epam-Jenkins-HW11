package rozetka.defenitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import rozetka.driver.DriverRepo;
import rozetka.navigation.Navigation;
import rozetka.steps.CheckoutPageBL;
import rozetka.steps.ProductPageBL;
import rozetka.steps.ProductTypePageBL;
import rozetka.steps.SearchPanelBL;
import rozetka.utils.TestProducts;

import static rozetka.enums.URLs.BASE_URL;

public class MyStepdefs {

    private SearchPanelBL searchPanelBL;
    private ProductTypePageBL productTypePageBL;
    private ProductPageBL productPageBL;
    private CheckoutPageBL checkoutPageBL;

    public MyStepdefs() {
        searchPanelBL = new SearchPanelBL();
    }

    @Before
    public void testsSetUp() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
    }

    @When("^Search product in search panel$")
    public void searchProductInSearchPanel() {
        productTypePageBL = searchPanelBL.searchElement(TestProducts.getTestProducts().get(0).getType())
                .searchCompanyElements(TestProducts.getTestProducts().get(0).getCompany());

    }

    @Then("^Find the most expensive product$")
    public void findTheMostExpensiveProduct() {
        productPageBL = productTypePageBL.clickOnExpensiveFirst()
                .clickOnFirstProduct();
    }

    @Then("^Add to basket$")
    public void addToBasket() {
        checkoutPageBL = productPageBL.clickOnBuyButton()
                .clickOnCheckoutBtn();
    }

    @Then("^Check price$")
    public void checkPrice() {
        checkoutPageBL.checkTotalPrice(TestProducts.getTestProducts().get(0).getPrice());
    }

    @After
    public void closeBrowser() {
        DriverRepo.closeBrowser();
    }
}
