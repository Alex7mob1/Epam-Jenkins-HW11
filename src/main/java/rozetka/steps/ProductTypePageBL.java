package rozetka.steps;

import rozetka.pages.ProductTypePage;
import rozetka.utils.Scroll;

public class ProductTypePageBL {

    private ProductTypePage productTypePage;

    public ProductTypePageBL() {
        productTypePage = new ProductTypePage();
    }

    public ProductTypePageBL searchCompanyElements(String company) {
        Scroll scroll = new Scroll();
        scroll.scroll();
        productTypePage.inputTextInTypeSearchBox(company);
        productTypePage.clickOnFirstBox();
        return this;
    }

    public ProductTypePageBL clickOnExpensiveFirst() {
        productTypePage.clickOnExpensiveFirst();
        return this;
    }

    public ProductPageBL clickOnFirstProduct() {
        productTypePage.clickOnFirstProduct();
        return new ProductPageBL();
    }
}