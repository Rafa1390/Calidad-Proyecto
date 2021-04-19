package BestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestBuyGiftCardList extends BasePage{

    By whiteGiftCardOption = By.xpath("//a[contains(text(),\"Best Buy white gift card\")]");

    BestBuyGiftCardList(WebDriver driver) {
        super(driver);
    }

    public void clickWhiteGiftCardOption(){
        click(whiteGiftCardOption);
    }
}
