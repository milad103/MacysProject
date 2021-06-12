package MacysPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class HomePageHeader {


    @FindBy(xpath = "//*[@id='myRewardsLabel-status']")
    WebElement SignInButton;

// Click Sign In button
    public void SignInButtonClicking() {

       SignInButton.click();
    }
    @FindBy(xpath = "//*[@id='pm-desktop-subheading']")
    WebElement signInTXT;

public String signInText(){
        return signInTXT.getText();
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
        String text1 = PrintHeaderElements.getText();
        return text1;
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

        email.sendKeys("ailokoi@gmail.com");
    }

    //Password
    @FindBy(css = "[name='password']")
    WebElement password;

    public void enterPassword() {

        password.sendKeys("L123456789$");
    }

    // show password
    @FindBy(css = "[id='ca-show-pass-btn']")
    WebElement showPassword;

    public void clickShowPassword() {

        showPassword.click();
    }

    //Birthday Month selection
    @FindBy(xpath = "//*[@id='ca-profile-birth-month']")
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

    //check box
    @FindBy(id = "ca-profile-star-rewards")
    WebElement checkBox;

    // Check rewards box

    public void checkRewardBox(){
        checkBox.click();
    }
    //Create Account
    @FindBy(css = "[class='primary expanded submit']")
    WebElement createAccount;

    public void clickCreateAccount() {
        createAccount.click();
    }

    @FindBy(xpath = "//*[@id='ca-page-level-error']/div/div/div[2]/div/p")
    WebElement errorMSG;

    public String disabledAutomatedSignUp() {
        return errorMSG.getText();

    }

    @FindBy (css = "[id='globalSearchInputField']")
    WebElement ProductSearchBar;

    public void clickProductSearchBar(){
        ProductSearchBar.click();
    }


    public void selectaProductInSearchBar(String ProductName){
        ProductSearchBar.sendKeys(ProductName);
    }

    @FindBy (css = "[id='searchSubmit']")
        WebElement SearchButton;
    public void clickSearchButton(){
        SearchButton.click();
    }

    @FindBy (xpath = "//*[@id=\"5870915\"]/div[2]/div/a")
    WebElement AcquaDiGioAbsolu;
    public void selectAcquaDiGioAbsolu() {
        AcquaDiGioAbsolu.click();
    }

    @FindBy (css = "[data-auto='increment-button']")
            WebElement updateQuantity;

            public void updateCartQuantity(){
            updateQuantity.click();
            }


    @FindBy(css = "[data-action='change-zipcode']")
  WebElement clickZipcode;
  public void clickToChangeZipCode(){

      clickZipcode.click();
}

    @FindBy(css = "[placeholder='Enter ZIP Code']")
    WebElement clearZipcode;
    public void clickClearZipcode(){
        clearZipcode.clear();
    }
    @FindBy(css = "[placeholder='Enter ZIP Code']")
    WebElement newZipcode;
    public void enterNewZipcode() {
        newZipcode.sendKeys( "02149");
    }

    @FindBy(css = "[class='button secondary small submit-sdd-zip-code']")
    WebElement updateNewZipCode;
    public void clickToApplyZipCode(){

        updateNewZipCode.click();
    }

    @FindBy(css = "[data-auto='add-to-bag']")
    WebElement addToBag;
    public void clickAddToBag(){
        addToBag.click();
    }

    @FindBy (css = "[class='notification-body']")////*[@id="cta-notification-order-panel-139768"]/div/div/div[2]/div/p
    WebElement notificationMSG;
    public String printNotification(){
        return notificationMSG.getText();
    }

    @FindBy(xpath = "//*[@id='logo']")
    WebElement MacysLogo;

    public boolean MacysHeaderLogo(){
        return MacysLogo.isDisplayed();
    }


    @FindBy(id = "img_202534")
    WebElement CBK200Breakmaker;

    public void selectCBK200Breakmaker(){
        CBK200Breakmaker.click();
    }

    @FindBy(id = "img_139768")
    WebElement DCC450_4_CupCoffeeMaker;
            public void selectDCC450_4_CupCoffeeMaker(){
                DCC450_4_CupCoffeeMaker.click();
            }

}