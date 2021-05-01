package BestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestBuyGiftCard extends BasePage{

    By gifCardTypeImg_1 = By.xpath("//img[@src=\"https://pisces.bbystatic.com/image2/BestBuy_US/Gallery/gc_2019_lv-108326.png\"]");
    By Add_To_Cart_Btn = By.xpath("//button[contains(text(), 'Add to Cart')]\n");
    By Check_Out_Btn = By.xpath("//*[@id=\"cartApp\"]/div[2]/div[1]/div/div[1]/div[1]/section[2]/div/div/div[3]/div/div[1]/button");
    By Congrats_Check = By.xpath("//*[@id=\"main-filters\"]/div[3]/div[2]/section[2]/fieldset/ul/li[3]/div/div");
    BestBuyGiftCard(WebDriver driver) {
        super(driver);
    }

    public void clickFirstBannerGiftCard(){
        click(gifCardTypeImg_1);
    }

    public void clickCongratulations() {
        click(Congrats_Check);
    }

    public void clickAddToCart() {
        click(Add_To_Cart_Btn);
    }

    public void clickCheckout() {
        click(Check_Out_Btn);
    }


}
