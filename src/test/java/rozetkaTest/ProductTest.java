package rozetkaTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import rozetka.listener.TestScreenShootListener;
import rozetka.model.Product;
import rozetka.steps.SearchPanelBL;
import rozetka.utils.TestProducts;

@Listeners(TestScreenShootListener.class)
public class ProductTest extends BaseTest {

    @DataProvider(parallel = true)
    public Object[][] products() {
        return TestProducts.getTestProducts().stream()
                .map(product -> new Object[]{product})
                .toArray(Object[][]::new);
    }

    @Test(dataProvider = "products")
    public void searchProduct(Product product) {

        SearchPanelBL searchPanelBL = new SearchPanelBL();

        searchPanelBL.searchElement(product.getType())
                .searchCompanyElements(product.getCompany())
                .clickOnExpensiveFirst()
                .clickOnFirstProduct()
                .clickOnBuyButton()
                .clickOnCheckoutBtn()
                .checkTotalPrice(product.getPrice());
    }
}