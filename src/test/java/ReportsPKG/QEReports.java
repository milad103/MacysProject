package ReportsPKG;

import MacysTests.Base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import java.io.File;
import java.io.IOException;

public class QEReports implements ITestListener {

    public void onTestStart(ITestResult results) {

        System.out.println("Test Case is starting");
    }


    public void onTestSuccess(ITestResult results) {

        System.out.println("Test Case is successful");
    }

    public void onTestFailure(ITestResult results) {


        System.out.println("Test Case Failed");
    }

    public void onTestSkipped(ITestResult results) {
        System.out.println("Test Case is being skipped");

    }
}