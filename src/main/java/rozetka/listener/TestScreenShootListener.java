package rozetka.listener;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import rozetka.utils.TakeScreenShoot;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestScreenShootListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult testResult) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        File outputFolder = new File("screens\\" + dateFormat.format(date) + ".png");
        TakeScreenShoot.takeScreens(outputFolder);
    }
}