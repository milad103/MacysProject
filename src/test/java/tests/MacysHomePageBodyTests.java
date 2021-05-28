package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import pages.HomePageBody;
import pages.HomePageHeader;

public class MacysHomePageBodyTests extends Base{
    //HomePageBody
    HomePageBody homePageBody;

    @BeforeMethod
    void setupHomePage(){
        setup();
        driver.get("https://macys.com");

        homePageBody = PageFactory.initElements(driver, HomePageBody.class);
    }
}
