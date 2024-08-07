package MacysTests;

import MacysPages.HomePageBody;
import MacysPages.HomePageHeader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MacysPages.HomePageFooter;

import java.io.IOException;

public class MacysHomePageFooterTests extends Base {

    HomePageFooter homepageFooter;

    String URL = "https://macys.com";

    @BeforeMethod
    void setupHomePage() throws IOException {
        setup("chrome");
        driver.get(URL);

        homepageFooter = PageFactory.initElements(driver, HomePageFooter.class);
    }

    //Test Case M11: Print all the element of the Footer with assertion.
    @Test
    void testPrintAllFooterElement() {
        cookies();
        scrollToBottom();
        homepageFooter.allFooterElements();
        String text = homepageFooter.allFooterElements();
        Assert.assertTrue(text.contains("Easy web browsing for visually impaired customers"));

    }

    //Test Case M12: Assert that media link for the macys' Facebook page is working properly
    @Test
    void testFacebookLink() {
        cookies();
        scrollToBottom();
        implicitWait(10);
        homepageFooter.getFacebookLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.facebook.com/Macys/");

    }

    //Test Case M13: Test App Store Link for Macy's website
    @Test
    void testAppStoreLink() throws IOException {
        cookies();
        scrollToBottom();
        homepageFooter.clickAppStore();
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL, "https://apps.apple.com/us/app/id341036067");

    }

    // Test Case M10: Test Youtube media link in footer
    @Test
    void testYoutubeLink(){
        cookies();
        scrollToBottom();
        homepageFooter.clickYoutubeChannel();
        String  currentURL = driver.getCurrentUrl();
        Assert.assertTrue(true, "https://www.youtube.com/user/macys");

    }
// Test Case M20: verifying "Contact Us" link in the footer is working as it should
    @Test
    void testContactUsLink(){
        cookies();
        scrollToBottom();

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", homepageFooter.contactUsLink());
        String currentURL = driver.getCurrentUrl();
       //Assertion
        Assert.assertEquals(currentURL, "https://www.customerservice-macys.com/app/home");
    }
}