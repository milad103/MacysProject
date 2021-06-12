package ReportsPKG;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
<<<<<<< HEAD
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import java.io.File;
import java.io.IOException;

public class QEReports implements ITestListener {
=======
import org.openqa.selenium.WebDriverException;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class QEReports extends TestListenerAdapter {
>>>>>>> aeb644619ec57a71518260dd9022c77b15fe26fb

    
    public void onTestStart(ITestResult results) {

        System.out.println("Test Case is starting");
    }


    public void onTestSuccess(ITestResult results) {

        System.out.println("Test Case was successful");
    }


<<<<<<< HEAD

        System.out.println("Test Case Failed");
=======
    public void onTestFailure(ITestResult results)  {
        System.out.println("Failed");
>>>>>>> aeb644619ec57a71518260dd9022c77b15fe26fb
    }


    public void onTestSkipped(ITestResult results) {
        System.out.println("Test Case is being skipped");

    }
}