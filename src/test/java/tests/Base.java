package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Base {

    // Set up driver, Invoke browser, maximize windows
    WebDriver driver;

    void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
//@BeforeClass
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
    /*@AfterMethod
    void closeBrowser() throws InterruptedException {
        sleep(10000);
       driver.quit();
    }*/

}


