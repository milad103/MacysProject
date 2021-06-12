package ReportsPKG;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import java.io.File;
import java.io.IOException;


public class QEReports extends TestListenerAdapter {
    
    public void onTestStart(ITestResult results) {

        System.out.println("Test Case is starting");
    }


    public void onTestSuccess(ITestResult results) {

        System.out.println("Test Case was successful");
    }



    public void onTestFailure(ITestResult results)  {
        System.out.println("Failed");

    }


    public void onTestSkipped(ITestResult results) {
        System.out.println("Test Case is being skipped");

    }
}