package MacysTests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Base {

    // Set up driver, Invoke browser, maximize windows

    public WebDriver driver;

    void setup(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "resources/Edge");
            driver = new EdgeDriver();
        } else {
            browser.equalsIgnoreCase("explorer");
            System.setProperty("webdriver.ie.driver", "resources/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
    }
    public void screenshot(String word) throws IOException {

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(scrFile, new File("./Screenshots.png"));
    }
        //driver.manage().window().maximize();


/*public void screenShot2() throws IOException {
    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(screenshot, new File("./Screenshots/macys001.png"));
    }
*/

    // Delete cookies
    void cookies() {

        driver.manage().deleteAllCookies();
    }

    // implicit wait
    void implicitWait(long wait) {
        driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
    }

    //Dismiss alert
    void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }


    //Thread.sleep

    void sleep(long millis) throws InterruptedException {
        Thread.sleep(millis);


    }

    // scroll down to the bottom of the page
    void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    // cookie Notice closing
    void closeCookiesNotice() {
        driver.findElement(By.xpath("//i[@class='close_btn icon-close-white-lg-large']")).click();
    }
    void windowScrollByPixels(String script) {
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        scrollDown.executeScript(script);
    }

    //Closing Browser

    @AfterMethod
    void closeBrowser() throws InterruptedException {
        sleep(10000);
        driver.quit();


        }
    }

    /*public void screenshotMethod() throws IOException {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileHandler.copy(source, new File("C:\\Users\\Milad\\IdeaProjects\\MacysProject\\Screenshots\\photos\\M001.JPEG"));
        }*/





