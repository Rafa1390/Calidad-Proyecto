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
    By Shop_Computer_Btn =  By.xpath("//a[@href=\"/site/lenovo-yoga-c940-2-in-1-14-touch-screen-laptop-intel-core-i7-12gb-memory-512gb-solid-state-drive-iron-gray/6367799.p?skuId=6367799#tab=buyingOptions?bof=openbox\"]");
    By Add_To_Cart_Btn =  By.xpath("//*[@class=\"btn btn-primary btn-sm btn-block btn-leading-ficon add-to-cart-button\"]");
    By Close_Add_To_Cart =  By.xpath("//*[@class=\"btn-default-link close-modal-x\"]");
    By Cart_Btn = By.xpath("//a[@class=\"cart-link\"]");
    By Checkout_Btn = By.xpath("//button[text()=\"Checkout\"]");
    By ButtonDeleteProduct = By.xpath("//a[contains(text(),'Remove')]\n");

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
}
