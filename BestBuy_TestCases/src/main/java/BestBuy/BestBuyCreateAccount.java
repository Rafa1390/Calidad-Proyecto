package BestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestBuyCreateAccount extends BasePage{

    By Submit_New_User = By.xpath("/html/body/div[1]/div/section/main/div[2]/div[1]/div/div/div/div/form/div[9]/button");//***
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

    BestBuyCreateAccount(WebDriver driver) {
        super(driver);
    }

    public void createAccount() {//***
        click(Submit_New_User);
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
}
