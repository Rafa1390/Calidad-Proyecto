package BestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestBuyHomePage extends BasePage{
    //elements paths
    By Logo_BestBuy = By.xpath("//img[@class=\"logo\"]");
    By Close_Email_Modal = By.xpath("//button[@class=\"c-close-icon  c-modal-close-icon\"]");

    BestBuyHomePage(WebDriver driver) {
        super(driver);
    }

    public void clickBestBuy(){
        click(Close_Email_Modal);
    }
}
