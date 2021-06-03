package MacysTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Base {

    // Set up driver, Invoke browser, maximize windows

    WebDriver driver;
    //WebDriver driver2;

    void setup(String browser) {
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver = new FirefoxDriver();


    }

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

    /*public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(2000);*/


    //Thread.sleep

    void sleep(long millis) throws InterruptedException {
        Thread.sleep(millis);


    }
    // scroll down to the bottom of the page
    void scrollToBottom(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    // cookie Notice closing

    void closeCookiesNotice(){
        driver.findElement(By.xpath("//i[@class='close_btn icon-close-white-lg-large']")).click();
    }

    //Closing Browser
    @AfterMethod
    void closeBrowser() throws InterruptedException {
        sleep(5000);
       driver.quit();
    }

}


