package BestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestBuyCartPage extends BasePage{

    By totalCartZero = By.xpath("//div[contains(text(),\"$0.00\")]");
    By carouselProducts = By.xpath("//div[contains(@class,\"pager-carousel \")]");
    By gCPreviewAnchor = By.xpath("//a[contains(@href,\"https://www.bestbuy.com/site/best-buy-75-thank-you-gift-card\")]");

    BestBuyCartPage(WebDriver driver) {
        super(driver);
    }

    public boolean displayedCartZero(){
        return displayedElement(totalCartZero);
    }

    public boolean displayedCarouselProducts(){
        return displayedElement(carouselProducts);
    }

    public boolean displayedGiftCardPreview(){
        return displayedElement(gCPreviewAnchor);
    }
}
