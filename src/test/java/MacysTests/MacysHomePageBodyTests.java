package MacysTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MacysPages.HomePageBody;

import java.io.IOException;

public class MacysHomePageBodyTests extends Base{

    HomePageBody homePageBody;
    String URL = "https://macys.com";


    @BeforeMethod
    void setupHomePage() throws IOException {
        setup();
        driver.get(URL);
        homePageBody = PageFactory.initElements(driver, HomePageBody.class);

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


}