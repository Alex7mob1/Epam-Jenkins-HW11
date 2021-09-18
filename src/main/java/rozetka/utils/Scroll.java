package rozetka.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import rozetka.driver.DriverRepo;

public class Scroll {

    private WebDriver driver;

    public Scroll() {
        driver = DriverRepo.getWebDriver();
    }

    public void scroll() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
    }

}