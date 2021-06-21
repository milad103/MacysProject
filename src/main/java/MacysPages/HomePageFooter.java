package MacysPages;

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

@FindBy(xpath = "//*[@id='social-icons-list']/li[5]/a/span")
    WebElement YoutubeChannel;

public void clickYoutubeChannel(){
    YoutubeChannel.click();
}

@FindBy(xpath = "//*[@id='footer-redesign-row-1-panels-container']/div[1]/label/ul/li[7]/a")
    WebElement contactUs;

public  WebElement contactUsLink(){
    return contactUs;
}
}
