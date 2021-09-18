package rozetka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import rozetka.decorator.CustomDecorator;
import rozetka.driver.DriverRepo;

public class BasePage {
    protected WebDriver driver;
    //protected WebDriverWait wait;

    public BasePage() {
        driver = DriverRepo.getWebDriver();
        //wait = DriverRepo.getWebDriverWait();
        PageFactory.initElements(new CustomDecorator(driver), this);
    }
}