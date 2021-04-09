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
}
