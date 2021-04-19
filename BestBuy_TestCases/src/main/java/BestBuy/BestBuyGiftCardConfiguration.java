package BestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestBuyGiftCardConfiguration extends BasePage{

    By gCOccasionButton = By.xpath("//button[@id=\"variaton-dropdown-Gift_Cards_Card_Occasion\"]");
    By gCOccasionThankYouAnchor = By.xpath("//a[@id=\"variations-dropdown-item-Gift_Cards_Card_Occasion-Thank_You\"]");
    By gCAmountButton = By.xpath("//button[@id=\"variaton-dropdown-Gifting_and_Prepaid_Cards_Card_Amount\"]");
    By gCAmount75Anchor = By.xpath("//a[@id=\"variations-dropdown-item-Gifting_and_Prepaid_Cards_Card_Amount-_75\"]");
    By gCAddToCartButton = By.xpath("//button[contains(text(),\"Add to Cart\")]");

    BestBuyGiftCardConfiguration(WebDriver driver) {
        super(driver);
    }

    public void clickGiftCardConfiguration(){
        click(gCOccasionButton);
        click(gCOccasionThankYouAnchor);
        click(gCAmountButton);
        click(gCAmount75Anchor);
        click(gCAddToCartButton);
    }
}
