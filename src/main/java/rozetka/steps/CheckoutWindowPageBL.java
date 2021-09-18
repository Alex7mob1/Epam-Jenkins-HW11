package rozetka.steps;

import rozetka.pages.CheckoutWindowPage;

public class CheckoutWindowPageBL {

    private CheckoutWindowPage checkoutWindowPage;

    public CheckoutWindowPageBL() {
        checkoutWindowPage = new CheckoutWindowPage();
    }

    public CheckoutPageBL clickOnCheckoutBtn() {
        checkoutWindowPage.clickOnCheckoutBtn();
        return new CheckoutPageBL();
    }
}