package BestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestBuyLogin extends BasePage{

    By Login_Btn = By.xpath("/html/body/div[1]/div/section/main/div[2]/div[1]/div/div/div/div/form/div[3]/button");

    public BestBuyLogin(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        sendKeys(By.name("fld-e"), email);
        sendKeys(By.name("fld-p1"), password);
        click(Login_Btn);
    }
}
