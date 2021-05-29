package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

public class Base {

    // Set up driver, Invoke browser, maximize windows
    WebDriver driver;

    void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
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


    //Closing Browser
    @AfterMethod
    void closeBrowser() throws InterruptedException {
        Thread.sleep(15000);
        driver.quit();
    }


}
