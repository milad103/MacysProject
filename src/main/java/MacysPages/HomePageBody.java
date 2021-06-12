package MacysPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePageBody {

    @FindBy(css = "[alt='Email Banner']")
    WebElement emailSignUp;
   public void clickEmailSignUp() {
       emailSignUp.click();
    }

    @FindBy(css = "[name='EMAIL_ADDRESS_']")
       WebElement email;

       public void enterEmail() {
           email.sendKeys("king1234@gmail.com");
       }

    @FindBy(css = "[name='POSTAL_CODE_']")
    WebElement zipCODE;

    public void enterZipCODE() {
        zipCODE.sendKeys("02149");

    }
    //click month drop down
    @FindBy(css = "[id='mmV']")
    WebElement MonthDD;

    public void clickMonthDD(){
        MonthDD.click();
    }

    public void selectMonth(){

        Select month = new Select(MonthDD);
        month.selectByValue("4");
    }


    //click day dropdown
    @FindBy(css = "[id='ddV']")
    WebElement DayDD;

    public void clickDayDD(){
        DayDD.click();
    }

    public void selectDay(){
        Select month = new Select(DayDD);
        month.selectByValue("25");
    }

    //click Year dropdown
    @FindBy(xpath = "//*[@id=\"target\"]/div[1]/div/div[3]/select/option[28]")
    WebElement yearDD;

    public void clickYearDD(){
        yearDD.click();
    }

    public void selectYear(){
        Select year = new Select(yearDD);
        year.selectByValue("1991");
    }

    @FindBy (css = "[id='VerifyCheckboxCB']")
    WebElement checkBox;
    public void clickCheckBox(){
        checkBox.click();
    }

    @FindBy (css = "#submitBtn")
            WebElement submitBtn;

            public void clickSubmitBttn(){
        submitBtn.click();

    }

    @FindBy(xpath = "/html/body/section/article/h1")
    WebElement confirmation;
            public String confirmationText(){
                return confirmation.getText();
            }
    }


