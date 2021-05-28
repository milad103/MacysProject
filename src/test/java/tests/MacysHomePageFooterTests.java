package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import pages.HomePageFooter;

public class MacysHomePageFooterTests extends Base{

    HomePageFooter homePageFooter;
    String URL = "https://macys.com";

    @BeforeMethod
    void setupHomePage() {
        setup();
        driver.get(URL);

        homePageFooter = PageFactory.initElements(driver, HomePageFooter.class);
    }

}
