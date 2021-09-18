package rozetka.navigation;

import org.openqa.selenium.WebDriver;
import rozetka.driver.DriverRepo;

public class Navigation {

    private WebDriver driver;

    public Navigation() {
        driver = DriverRepo.getWebDriver();
    }

    public void navigateToUrl(String url) {
        driver.get(url);
    }
}