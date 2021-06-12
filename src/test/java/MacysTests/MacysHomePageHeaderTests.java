package MacysTests;


import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MacysPages.HomePageHeader;



public class MacysHomePageHeaderTests extends Base {

    HomePageHeader homePageHeader;
    String URL = "https://macys.com";

    @BeforeMethod
    void setupHomePage() {
        setup("chrome");
        driver.get(URL);

        homePageHeader = PageFactory.initElements(driver, HomePageHeader.class);
    }


    //Test Case M1: Asserting that SignIn Button is clickable
    @Test
    void testSignInButtonText() {
        implicitWait(5);
        cookies();
        homePageHeader.SignInButtonClicking();
        String actualText = homePageHeader.signInText();
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
        implicitWait(10);
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        scrollDown.executeScript("window.scrollBy(0,250)", "");
        implicitWait(10);
        homePageHeader.clickCreateAccount();
        homePageHeader.disabledAutomatedSignUp();
        String actualText = homePageHeader.disabledAutomatedSignUp();
        Assert.assertTrue(actualText.contains("We're sorry, but we cannot display your information at this time."));
    }

    // Test Case M7: Search "Giorgi Armani Acqua Di Gio Absolu Eau de Parfum" then add 2 items to cart.
    @Test
    void addAcquaiDiGioToCart() throws InterruptedException {
        cookies();
        sleep(3000);
        homePageHeader.selectProductSearchBar();
        homePageHeader.clickSearchButton();
        cookies();
        homePageHeader.selectAcquaDiGioAbsolu();
        cookies();
        implicitWait(5);
        homePageHeader.updateCartQuantity();
        cookies();
        implicitWait(5);
        homePageHeader.clickToChangeZipCode();
        homePageHeader.clickClearZipcode();
        homePageHeader.enterNewZipcode();
        homePageHeader.clickToApplyZipCode();
        cookies();
        sleep(5000);
        homePageHeader.clickAddToBag();

        //ASSERTION
        homePageHeader.printNotification();
        String actualText = homePageHeader.printNotification();
        Assert.assertTrue(actualText.contains("you can order by phone at 1-800-289-6229"));

    }

//Test Case M8: Asserting the Macys Logo is visible at the header in Macys HomePAge

    @Test
    void testHeaderMacysLogoVisiblity() {
        boolean actualCondtion = homePageHeader.MacysHeaderLogo();
        Assert.assertEquals(actualCondtion, true);
    }

    @Test
    void
    testing() {
        cookies();
        closeCookiesNotice();
        implicitWait(10);
        cookies();
        ((JavascriptExecutor) driver).executeScript("document.getElementById('shopByDepartmentDropdown').style.display='block';");
        //Actions actions = new Actions(driver);
        // actions.moveToElement(driver.findElement(By.id("shopByDepartmentDropdown"))).build().perform();
        ((JavascriptExecutor) driver).executeScript("document.getElementById('flexid_118').style.display='block';");
        ////*[@id="mainNavigationFlyouts"]/div[2]/div[1]/div/a[7]
        //driver.findElement(By.xpath("//*[@id=\"mainNavigationFlyouts\"]/div[2]/div[1]/div/a[7]")).click();


    }
}

