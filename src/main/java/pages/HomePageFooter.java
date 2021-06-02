package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFooter {

    // all elements of the footer
    @FindBy (xpath= "//html/body/footer")
    WebElement footerElements;
            public String allFooterElements(){
               return footerElements.getText();
            }

// facebook link in footer
@FindBy (xpath= "//*[@id='social-icons-list']/li[1]/a")
WebElement facebook;

    public void getFacebookLink(){
        facebook.click();
    }

    @FindBy (css = "[id='livetype']")
    WebElement appStore;
public void clickAppStore(){
    appStore.click();

}
}
