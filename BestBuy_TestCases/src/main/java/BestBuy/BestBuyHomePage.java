package BestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class BestBuyHomePage extends BasePage{
    //elements paths
    By Close_Email_Modal = By.xpath("//button[@class=\"c-close-icon c-modal-close-icon\"]");
    By Account_Menu = By.xpath("//*[@id=\"header-block\"]/div[2]/div[2]/div/nav[2]/ul/li[1]/button/div[2]");
    By Create_Account_Btn = By.xpath("//*[@id=\"ABT2465Menu\"]/header/a[2]");
    By User_Account_Btn = By.xpath("//*[@id=\"header-block\"]/div[2]/div[2]/div/nav[2]/ul/li[1]/button");
    By Account_Login_Btn = By.xpath("//*[@id=\"ABT2465Menu\"]/header/a[1]");
    By Account_Settings = By.xpath("//*[@id=\"ABT2465Menu\"]/section[4]/ul/li/a");
    By Phone_Numbers_Btn = By.linkText("Phone Numbers");
    By Brands_Btn = By.xpath("//*[@id=\"header-block\"]/div[2]/div[2]/div/nav[1]/ul/li[2]/button");
    By Products_Btn = By.xpath("//*[@id=\"header-block\"]/div[2]/div[2]/div/nav[1]/ul/li[1]/button");
    By Wearable_Tec_Btn = By.xpath("//*[@id=\"header-menu-167\"]/li[3]/ul/li[10]/button");
    By Apple_Watch_Btn = By.xpath("//*[@id=\"header-menu-112\"]/li[1]/button");
    By Search_Apple_Watch = By.xpath("//*[@id=\"header-menu-112\"]/li[2]/div/ul/li[1]/a");
    By Apple_Watch_Product = By.linkText("Series 6 GPS + Cellular");
    By Save_Btn = By.xpath("//*[@id=\"shop-save-for-later-59457cc9-d7d6-4bca-94fa-ff828b2d7bf5\"]/div/div/div/button");
    By Saved_Items_Btn = By.xpath("//*[@id=\"header-block\"]/div[2]/div[2]/div/nav[2]/ul/li[4]/button");
    By Item_Saved = By.xpath("//*[@id=\"account-menu-container\"]/div/div[2]/div/div[2]/div/div/ul/li/div/div[2]/a");
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

    public void clickUserAccountBtn() {
        click(User_Account_Btn);
    }

    public void redirecToLogin() {
        openAccountMenu();
        click(Account_Login_Btn);
    }

    public void openAccountSettings() {
        click(Account_Settings);
    }

    public void openPhoneNumbers() {
        click(Phone_Numbers_Btn);
    }

    public void searchByBrand() {
        click(Brands_Btn);
        click(By.xpath("//*[@id=\"header-menu-3\"]/li[3]/ul/li[1]/a"));
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

    public void clickGiftCards(){
        click(giftCardsAnchor);
    }
}
