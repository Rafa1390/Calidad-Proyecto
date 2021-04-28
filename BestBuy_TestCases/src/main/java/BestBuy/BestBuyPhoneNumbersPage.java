package BestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestBuyPhoneNumbersPage extends BasePage{
    By Add_Phone_Number_Btn = By.xpath("//button[contains(text(),'Add')]");
    By Save_Phone_Number_Btn = By.xpath("//button[contains(text(),'Continue')]");

    public BestBuyPhoneNumbersPage(WebDriver driver) {
        super(driver);
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
}
