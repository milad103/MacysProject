package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageFooter;
import pages.HomePageHeader;

public class MacysHomePageFooterTests extends Base {
    HomePageFooter homepageFooter;

    String URL = "https://macys.com";

    @BeforeMethod
    void setupHomePage() {
        setup();
        driver.get(URL);

        homepageFooter = PageFactory.initElements(driver, HomePageFooter.class);
    }
//Test Case M8: Print all the element of the Footer with assertion.
    @Test
    void testPrintAllFooterElement(){
        cookies();
        scrollToBottom();
       homepageFooter.allFooterElements();
       String text = homepageFooter.allFooterElements();
       Assert.assertTrue(text.contains("Easy web browsing for visually impaired customers"));

    }
    //Test Case M9: Assert that media link for the macys' Facebook page is working properly
    @Test
    void testFacebookLink(){
        cookies();
        scrollToBottom();
        implicitWait(10);
        homepageFooter.getFacebookLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://www.facebook.com/Macys/");

    }

    //Test Case M10: Test App Store Link for Macys website
    @Test
    void testAppStoreLink() {
        cookies();
        scrollToBottom();
         homepageFooter.clickAppStore();
         String currentURL = driver.getCurrentUrl();
         Assert.assertEquals(currentURL, "https://apps.apple.com/us/app/id341036067");


    }
}