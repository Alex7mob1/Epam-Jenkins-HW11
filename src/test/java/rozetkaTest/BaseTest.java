package rozetkaTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import rozetka.driver.DriverRepo;
import rozetka.navigation.Navigation;

import static rozetka.enums.URLs.BASE_URL;

public class BaseTest {

    @BeforeMethod
    public void testsSetUp() {
        DriverRepo.instanceWebBrowser();
        new Navigation().navigateToUrl(BASE_URL.getValue());
    }

    @AfterMethod
    public void closeBrowser() {
        DriverRepo.closeBrowser();
    }
}