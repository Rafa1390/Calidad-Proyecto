package BestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class BestBuyHomePage extends BasePage{
    //elements paths
    By Logo_BestBuy = By.xpath("//img[@class=\"logo\"]");
    By Close_Email_Modal = By.xpath("//button[@class=\"c-close-icon  c-modal-close-icon\"]");
    By Account_Menu = By.xpath("//*[@id=\"header-block\"]/div[2]/div[2]/div/nav[2]/ul/li[1]/button/div[2]");
    By Create_Account_Btn = By.xpath("//*[@id=\"ABT2465Menu\"]/header/a[2]");
    By Submit_New_User = By.xpath("/html/body/div[1]/div/section/main/div[2]/div[1]/div/div/div/div/form/div[9]/button");
    By User_Account_Btn = By.xpath("//*[@id=\"header-block\"]/div[2]/div[2]/div/nav[2]/ul/li[1]/button");
    By Account_Login_Btn = By.xpath("//*[@id=\"ABT2465Menu\"]/header/a[1]");
    By Login_Btn = By.xpath("/html/body/div[1]/div/section/main/div[2]/div[1]/div/div/div/div/form/div[3]/button");
    By Account_Settings = By.xpath("//*[@id=\"ABT2465Menu\"]/section[4]/ul/li/a");
    By Phone_Numbers_Btn = By.linkText("Phone Numbers");
    By Add_Phone_Number_Btn = By.xpath("//button[contains(text(),'Add')]");
    By Save_Phone_Number_Btn = By.xpath("//button[contains(text(),'Continue')]");
    By Search_Input = By.xpath("//*[@id=\"gh-search-input\"]");
    By Brands_Btn = By.xpath("//*[@id=\"header-block\"]/div[2]/div[2]/div/nav[1]/ul/li[2]/button");
    By Lenovo_Shop_Now =  By.linkText("Shop now");
    By Second_Lenovo_Shop_Now =  By.xpath("//*[@id=\"site-control-content\"]/div[4]/div/div[4]/div/div/div[1]/div/div/div/p/a");
    By Shop_Computer_Btn =  By.xpath("//a[@href=\"/site/lenovo-yoga-c740-2-in-1-14-touch-screen-laptop-intel-core-i5-8gb-memory-256gb-solid-state-drive-mica/6367805.p?skuId=6367805#tab=buyingOptions?bof=openbox\"]");
    By Add_To_Cart_Btn =  By.xpath("//*[@class=\"btn btn-primary btn-sm btn-block btn-leading-ficon add-to-cart-button\"]");
    By Close_Add_To_Cart =  By.xpath("//*[@class=\"btn-default-link close-modal-x\"]");
    By Cart_Btn = By.xpath("//a[@class=\"cart-link\"]");
    By Checkout_Btn = By.xpath("//button[text()=\"Checkout\"]");
    By Products_Btn = By.xpath("//*[@id=\"header-block\"]/div[2]/div[2]/div/nav[1]/ul/li[1]/button");
    By Wearable_Tec_Btn = By.xpath("//*[@id=\"header-menu-167\"]/li[3]/ul/li[10]/button");
    By Apple_Watch_Btn = By.xpath("//*[@id=\"header-menu-112\"]/li[1]/button");
    By Search_Apple_Watch = By.xpath("//*[@id=\"header-menu-112\"]/li[2]/div/ul/li[1]/a");
    By Apple_Watch_Product = By.linkText("Series 6 GPS + Cellular");
    By Save_Btn = By.xpath("//*[@id=\"shop-save-for-later-59457cc9-d7d6-4bca-94fa-ff828b2d7bf5\"]/div/div/div/button");
    By Saved_Items_Btn = By.xpath("//*[@id=\"header-block\"]/div[2]/div[2]/div/nav[2]/ul/li[4]/button");
    By Item_Saved = By.xpath("//*[@id=\"account-menu-container\"]/div/div[2]/div/div[2]/div/div/ul/li/div/div[2]/a");
    By ButtonAddProduct = By.xpath("//button[contains(text(),'Add to Cart')]\n");
    By ButtonDeleteProduct = By.xpath("//a[contains(text(),'Remove')]\n");
    By firstNameInput = By.id("firstName");
    By lastNameInput = By.id("lastName");
    By emailInput = By.id("email");
    By passwordInput = By.id("fld-p1");
    By confirmPassInput = By.id("reenterPassword");
    By phoneInput = By.id("phone");
    By firstNameSpan = By.id("firstName-text");
    By lastNameSpan = By.id("lastName-text");
    By emailSpan = By.id("email-text");
    By passwordSpan = By.id("fld-p1-text");
    By confirmPassSpan = By.id("reenterPassword-text");
    By phoneSpan = By.id("phone-text");
    By totalCartZero = By.xpath("//div[contains(text(),\"$0.00\")]");
    By carouselProducts = By.xpath("//div[contains(@class,\"pager-carousel \")]");
    By giftCardsAnchor = By.xpath("//a[contains(text(), \"Gift Cards\")]");

    BestBuyHomePage(WebDriver driver) {
        super(driver);
    }

    public void clickBestBuy(){
        click(Close_Email_Modal);
    }

    public void openAccountMenu() {
        click(Account_Menu);
    }

    public void clickCreateAccount() {
        click(Create_Account_Btn);
    }

    public void deleteProductCart(){
        click(ButtonDeleteProduct);
    }
    public void fillCreateAccountForm(HashMap<String, String> userData ){
        sendKeys(By.name("firstName"), userData.get("firt_name"));
        sendKeys(By.name("lastName"), userData.get("last_name"));
        sendKeys(By.name("email"), userData.get("email"));
        sendKeys(By.name("fld-p1"), userData.get("password"));
        sendKeys(By.name("reenterPassword"), userData.get("password"));
        sendKeys(By.name("phone"), userData.get("phone_number"));
    }

    public void createAccount() {
        click(Submit_New_User);
    }

    public void clickUserAccountBtn() {
        click(User_Account_Btn);
    }

    public void loginWorkflow(String email, String password) {
        openAccountMenu();
        click(Account_Login_Btn);
        sendKeys(By.name("fld-e"), email);
        sendKeys(By.name("fld-p1"), password);
        click(Login_Btn);
    }

    public void openAccountSettings() {
        click(Account_Settings);
    }

    public void openPhoneNumbers() {
        click(Phone_Numbers_Btn);
    }

    public void clickAddNewNumber() {
        click(Add_Phone_Number_Btn);
    }

    public void fillNumberInput(String phone) {
        sendKeys(By.name("recoveryPhone"), phone);
    }

    public void saveRecoveryNumber() {
        click(Save_Phone_Number_Btn);
    }

    public boolean isRecoveryNumberInvalid() {
        return getElementText(By.xpath("/html/body/div[1]/div/section/main/div[2]/div[1]/div/div/div[1]/div/div[2]/strong/div")).equals("Please enter a valid mobile phone number capable of receiving texts.");
    }

    public void addTextInSearchBar(String text) {
        sendKeys(Search_Input, text);
    }

    public void searchByBrand() {
        click(Brands_Btn);
        click(By.xpath("//*[@id=\"header-menu-3\"]/li[3]/ul/li[1]/a"));
    }

    public void clickLenovoShopNow() {
        click(Lenovo_Shop_Now);
    }

    public void clickSecondLenovoShopNow() {
        click(Second_Lenovo_Shop_Now);
    }

    public void shopComputer(){
        click(Shop_Computer_Btn);
    }
    public void addComputerToCart() {
        click(Add_To_Cart_Btn);
    }

    public void closeAddToCartModal() {
        click(Close_Add_To_Cart);
    }

    public void OpenCart() {
        click(Cart_Btn);
    }

    public void clickCheckoutBtn() {
        click(Checkout_Btn);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void openAppleWatchProducts() {
        click(Products_Btn);
        click(Wearable_Tec_Btn);
        click(Apple_Watch_Btn);
        click(Search_Apple_Watch);
    }

    public void selectAppleWatch(){
        click(Apple_Watch_Product);
    }

    public void saveProduct() {
        click(Save_Btn);
    }

    public void openSavedItems() {
        click(Saved_Items_Btn);
    }

    public boolean isItemSaved() {
        return driver.findElement(Item_Saved).getText().contains("Apple Watch Series 6 (GPS + Cellular)");
    }

    public void clickInputsCreateAccount(){
        click(firstNameInput);
        click(lastNameInput);
    }

    public void sendTestInfoInputsAccount(String email, String password, String cPass, String phone){
        sendKeys(emailInput, email);
        sendKeys(passwordInput, password);
        sendKeys(confirmPassInput, cPass);
        sendKeys(phoneInput, phone);
    }

    public boolean vFirstNameContent(String content){
        return containElementText(firstNameSpan, content);
    }

    public boolean vLastNameContent(String content){
        return containElementText(lastNameSpan, content);
    }

    public boolean vEmailContent(String content){
        return containElementText(emailSpan, content);
    }

    public boolean vPasswordContent(String content){
        return containElementText(passwordSpan, content);
    }

    public boolean vCPasswordContent(String content){
        return containElementText(confirmPassSpan, content);
    }

    public boolean vPhoneContent(String content){
        return containElementText(phoneSpan, content);
    }

    public boolean displayedCartZero(){
        return displayedElement(totalCartZero);
    }

    public boolean displayedCarouselProducts(){
        return displayedElement(carouselProducts);
    }

    public void clickGiftCards(){
        click(giftCardsAnchor);
    }
}
