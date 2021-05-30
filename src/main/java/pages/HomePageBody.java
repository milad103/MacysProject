package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageBody {

    @FindBy(xpath = "//*[@id=\"row_16\"]/ul/li/div/map/area[3]")
    WebElement bodyElements;
   public String getBodyElements() {
        return bodyElements.getText();
    }

    @FindBy(xpath = "//*[@id='row_8']/ul/li/div/div/picture/img")
       WebElement FEwaysToShop;

       public String getFEwaysToShop(){
           return  FEwaysToShop.getText();

        }

    }


