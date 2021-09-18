package rozetka.steps;

import rozetka.pages.CheckoutPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;

public class CheckoutPageBL {

    private CheckoutPage checkoutPage;
    private int tPrice;

    public CheckoutPageBL() {
        checkoutPage = new CheckoutPage();
        tPrice = Integer.parseInt(checkoutPage.getTotalPrice()
                .replaceAll("\\D+", ""));

    }

    public void checkTotalPrice(int price) {
        assertThat(tPrice, lessThan(price));
    }
}