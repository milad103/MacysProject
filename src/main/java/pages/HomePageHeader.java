package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePageHeader {


    @FindBy(xpath = "//*[@id=\"myRewardsLabel-status\"]/span[1]")
    WebElement SignInButton;

    public void SignInButtonClicking() {
        SignInButton.click();
    }

    @FindBy(css = "[id='email']")
    WebElement signInEmail;

    public void enterSignInEmail() {
        signInEmail.sendKeys("testemail@mail.org");
    }

    @FindBy(css = "[id='pw-input']")
    WebElement signInPwd;

    public void enterSigninPwd() {
        signInPwd.sendKeys("123456789$");
    }

    @FindBy(css = "[id='sign-in']")
    WebElement accountPageSignInButton;

    public void clickAccountPageSignInButton() {
        accountPageSignInButton.click();
    }


    @FindBy(css = "[class='notification-body']")
    WebElement wrongSignInMSG;

    public String wrongSignInMsgText() {
        return wrongSignInMSG.getText();

    }

    //Sign In Text
    @FindBy(xpath = "//*[@id='pm-desktop-subheading']")
    WebElement SignInText;

    public String getSignInText() {
        return SignInText.getText();
    }

    //Header elements
    @FindBy(css = "div[class='redesign-header radical']")
    WebElement PrintHeaderElements;

    public String HeaderElements() {
        String text = PrintHeaderElements.getText();
        return text;
    }

    // header Logo
    @FindBy(xpath = "//*[@id='logo']")
    WebElement headerMacysLogo;

    public void HeaderLogoClicking() {
        headerMacysLogo.click();
    }


    //click create account button
    @FindBy(css = "[id='standard-sign-up']")
    WebElement createAccountButton;

    public void clickCreateAccountButton() {
        createAccountButton.click();
    }

    // enter firstName
    @FindBy(css = "[title='First name']")
    WebElement Firstname;

    public void enterFirstname() {
        Firstname.sendKeys("james");
    }

    //Last name
    @FindBy(css = "[title='Last name']") //title="Last name"
            WebElement LastName;

    public void enterLastName() {
        LastName.sendKeys("kevin");
    }

    //Email
    @FindBy(css = "[name='email']")
    WebElement email;

    public void enterEmail() {
        email.sendKeys("a@mail.com");
    }

    //Password
    @FindBy(css = "[name='password']")
    WebElement password;

    public void enterPassword() {
        password.sendKeys("123456789$");
    }

    // show password
    @FindBy(css = "[id='ca-show-pass-btn']")
    WebElement showPassword;

    public void clickShowPassword() {
        showPassword.click();
    }

    //Birthday Month selection
    @FindBy(css = "[data-date='month']")
    WebElement monthSelectDropdown;

    public void clickMonthDropDown() {
        monthSelectDropdown.click();

    }

    public void selectMonth() {
        Select drop = new Select(monthSelectDropdown);
        drop.selectByIndex(2);
    }

    //Birthday day selection
    @FindBy(css = "[title='Date']")
    WebElement daySelectDropdown;

    public void selectDayDropDown() {
        daySelectDropdown.click();

    }
// select day
    public void selectDay() {
        Select drop = new Select(daySelectDropdown);
        drop.selectByIndex(5);
    }

    //Create Account
    @FindBy(xpath = "//button[@class='primary expanded submit']")
    WebElement createAccount;
    public void clickCreateAccount(){
        createAccount.click();
    }

    @FindBy (xpath = "//*[@id='ca-page-level-error']/div/div/div[2]/div/p")
    WebElement errorMSG;

    public String disabledAutomatedSignUp(){
        return errorMSG.getText();
    }
}
//