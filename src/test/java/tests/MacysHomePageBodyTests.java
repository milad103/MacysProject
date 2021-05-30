package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageBody;

public class MacysHomePageBodyTests extends Base{
    //HomePageBody
    HomePageBody homePageBody;

    @BeforeMethod
    void setupHomePage(){
        setup();
        driver.get("https://macys.com");

        homePageBody = PageFactory.initElements(driver, HomePageBody.class);

    }

    //Test Case
    @Test
    void testPrintBodyElements(){
        cookies();
        implicitWait(7);
       String actualTEXT =  homePageBody.getBodyElements();
        //Assert.assertTrue(actualTEXT.contains());
        System.out.println(actualTEXT);
    }


    @Test
    void testgetFEwaysToShop(){
        cookies();
        String actualTexT = homePageBody.getFEwaysToShop();
        System.out.println(actualTexT);
    }
}