package MacysTests;


import MacysPages.HomePageBody;
import MacysPages.HomePageFooter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MacysHomePageBodyTests extends Base{

    HomePageBody homePageBody;
    //HomePageFooter homePageFooter;
   String URL = "https://macys.com";


    @BeforeMethod
    void setupHomePage() {
        setup("chrome");
        driver.get(URL);
        homePageBody = PageFactory.initElements(driver, HomePageBody.class);
        //homePageFooter = PageFactory.initElements(driver, HomePageFooter.class);

    }



    //Test Case M9: Test  Email Signup in the body then assert that!
    @Test
    void testEmailSignUp() throws InterruptedException {
        cookies();
        implicitWait(5);
        closeCookiesNotice();
        scrollToBottom();
        implicitWait(5);
        homePageBody.clickEmailSignUp();
        homePageBody.enterEmail();
        homePageBody.enterZipCODE();
        homePageBody.clickMonthDD();
        homePageBody.selectMonth();
        homePageBody.clickDayDD();
        homePageBody.selectDay();
        homePageBody.clickYearDD();
        homePageBody.clickYearDD();
        implicitWait(10);
       homePageBody.clickCheckBox();
        sleep(5000);
        homePageBody.clickSubmitBttn();
        // Assertion
        homePageBody.confirmationText();
        String actualText = homePageBody.confirmationText();
        Assert.assertTrue(actualText.contains("LOOKS LIKE YOU’RE ALREADY IN OUR SYSTEM!!"));
    }

// Test Case M10:
    @Test
    void testJoinStarRewards() throws InterruptedException {
        closeCookiesNotice();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,6250)");
        cookies();
        sleep(10000);
        Actions mouse = new Actions(driver);
        mouse.moveToElement(driver.findElement(By.xpath("//*[@id=\"rowP-157727\"]/div/map/area[2]")));
        driver.findElement(By.xpath("//*[@id=\"rowP-157727\"]/div/map/area[2]")).click();

    }


}