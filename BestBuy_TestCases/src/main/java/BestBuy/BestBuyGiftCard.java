package BestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestBuyGiftCard extends BasePage{

    By gifCardTypeImg_1 = By.xpath("//img[@src=\"https://pisces.bbystatic.com/image2/BestBuy_US/Gallery/gc_2019_lv-108326.png\"]");

    BestBuyGiftCard(WebDriver driver) {
        super(driver);
    }

    public void clickFirstBannerGiftCard(){
        click(gifCardTypeImg_1);
    }
}
