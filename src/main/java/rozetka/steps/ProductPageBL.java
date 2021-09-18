package rozetka.steps;

import rozetka.pages.ProductPage;

public class ProductPageBL {

    private ProductPage productPage;

    public ProductPageBL() {
        productPage = new ProductPage();
    }

    public CheckoutWindowPageBL clickOnBuyButton() {
        productPage.clickOnBuyButton();
        return new CheckoutWindowPageBL();
    }
}