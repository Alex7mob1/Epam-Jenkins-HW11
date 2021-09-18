package rozetka.utils;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import rozetka.driver.DriverRepo;

import java.io.File;
import java.io.IOException;

public class TakeScreenShoot {

    private static final Logger LOG = LogManager.getLogger(TakeScreenShoot.class);

    public TakeScreenShoot() {
    }

    public static void takeScreens(File outputDirectory) {
        try {
            File scrFile = ((TakesScreenshot) DriverRepo.getWebDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, outputDirectory);
        } catch (IOException e) {
            LOG.error("method takeScreens..");
            e.printStackTrace();
        }
    }
}