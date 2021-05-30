package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageHeader;


public class MacysHomePageHeaderTests extends Base {

    HomePageHeader homePageHeader;
    String URL = "https://macys.com";

    @BeforeMethod
    void setupHomePage() {
        setup();
        driver.get(URL);

        homePageHeader = PageFactory.initElements(driver, HomePageHeader.class);
    }


    //Test Case M1: Asserting that SignIn Button is clickable
    void testSignInButtonText() {
        implicitWait(5);
        cookies();
        homePageHeader.SignInButtonClicking();
        String actualText = homePageHeader.getSignInText();
        Assert.assertEquals(actualText, "Sign In");
    }

    //Test Case M2: Asserting that only returning/existing users can log in with both valid emails and passwords
    @Test
    void testNegativeTCSignIn() {
        implicitWait(5);
        cookies();
        homePageHeader.SignInButtonClicking();
        homePageHeader.enterSignInEmail();
        homePageHeader.enterSigninPwd();
        homePageHeader.clickAccountPageSignInButton();
        String actualText = homePageHeader.wrongSignInMsgText();
        Assert.assertTrue(actualText.contains("Sorry,"));


    }


    //Test Case M3: Besides printing we are asserting that among the printed header element there's the word "STORES"
    @Test
    void testPrintHeaderElement() {
        implicitWait(5);
        cookies();
        String actualText = homePageHeader.HeaderElements();
        Assert.assertTrue(actualText.contains("STORES"));
    }


    //Test Case M4: Clicking the MACY'S logo in the Header will redirect us to the homepage
    @Test
    void testLogoRedirectToHP() {
        implicitWait(5);
        cookies();
        homePageHeader.HeaderLogoClicking();
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL, "https://www.macys.com/?lid=glbtopnav_macys_icon-us");

    }

// Test Case M5: Asserting and clicking create account button
    @Test
    void testCreateAccountButton() {
        cookies();
        homePageHeader.SignInButtonClicking();
        cookies();
        homePageHeader.clickCreateAccountButton();
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL, "https://www.macys.com/account/createaccount?cm_sp=my_account-_-sign_in-_-create_account");

    }
// Test Case M6: newAccountSignUp
    @Test
    void testNewAccountSignUp() {
        cookies();
        homePageHeader.SignInButtonClicking();
        cookies();
        homePageHeader.clickCreateAccountButton();
        homePageHeader.enterFirstname();
        homePageHeader.enterLastName();
        homePageHeader.enterEmail();
        homePageHeader.enterPassword();
       homePageHeader.clickShowPassword();
        homePageHeader.clickMonthDropDown();
        homePageHeader.selectMonth();
        homePageHeader.selectDayDropDown();
        homePageHeader.selectDay();
        JavascriptExecutor scrollDown = (JavascriptExecutor)driver;
        scrollDown.executeScript("window.scrollBy(0,250)", "");
        implicitWait(5);
        homePageHeader.clickCreateAccount();
        homePageHeader.disabledAutomatedSignUp();
        String actualText = homePageHeader.disabledAutomatedSignUp();
        Assert.assertTrue(actualText.contains("We're sorry, but we cannot display your information at this time."));
    }

    // Test Case M7: Search "Giorgi Armani Acqua Di Gio Absolu Eau de Parfum" then add to cart then choose pick up as an option
    @Test
    void addAcquaiDiGioToCart() {
        cookies();
        homePageHeader.selectProductSearchBar();
        homePageHeader.clickSearchButton();
        cookies();
        homePageHeader.selectAcquaDiGioAbsolu();
cookies();
implicitWait(5);
 driver.findElement(By.cssSelector("[class='p-qty-btn p-qty-incr ']")).click();
        driver.findElement(By.cssSelector("[data-action='change-zipcode']")).click();
        //implicitWait(5);
 driver.findElement(By.cssSelector("[placeholder='Enter ZIP Code']")).clear();
 implicitWait(5);
 driver.findElement(By.cssSelector("[placeholder='Enter ZIP Code']")).sendKeys( "02149");
 implicitWait(3);
        driver.findElement(By.cssSelector("[class='button secondary small submit-sdd-zip-code']")).click();
driver.findElement(By.cssSelector("[data-action='product:bag:add']")).click();
        //homePageHeader.selectPickUpOption();
//implicitWait(5);
        //homePageHeader.addToCart();

        //ASSERTION
    }


    }
