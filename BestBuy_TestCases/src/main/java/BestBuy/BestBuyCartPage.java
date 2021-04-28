package BestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestBuyCartPage extends BasePage{

    By totalCartZero = By.xpath("//div[contains(text(),\"$0.00\")]");
    By carouselProducts = By.xpath("//div[contains(@class,\"pager-carousel \")]");
    By gCPreviewAnchor = By.xpath("//a[contains(@href,\"https://www.bestbuy.com/site/best-buy-75-thank-you-gift-card\")]");
    By Lenovo_Shop_Now =  By.linkText("Shop now");
    By Second_Lenovo_Shop_Now =  By.xpath("//*[@id=\"site-control-content\"]/div[4]/div/div[4]/div/div/div[1]/div/div/div/p/a");
    By Shop_Computer_Btn =  By.xpath("//a[@href=\"/site/lenovo-yoga-c740-2-in-1-14-touch-screen-laptop-intel-core-i5-8gb-memory-256gb-solid-state-drive-mica/6367805.p?skuId=6367805#tab=buyingOptions?bof=openbox\"]");
    By Add_To_Cart_Btn =  By.xpath("//*[@class=\"btn btn-primary btn-sm btn-block btn-leading-ficon add-to-cart-button\"]");
    By Close_Add_To_Cart =  By.xpath("//*[@class=\"btn-default-link close-modal-x\"]");
    By Cart_Btn = By.xpath("//a[@class=\"cart-link\"]");
    By Checkout_Btn = By.xpath("//button[text()=\"Checkout\"]");
    By ButtonDeleteProduct = By.xpath("//a[contains(text(),'Remove')]\n");

    BestBuyCartPage(WebDriver driver) {
        super(driver);
    }

    public void clickLenovoShopNow() {
        click(Lenovo_Shop_Now);
    }

    public void clickSecondLenovoShopNow() {
        click(Second_Lenovo_Shop_Now);
    }

    public void shopComputer(){
        click(Shop_Computer_Btn);
    }
    public void addComputerToCart() {
        click(Add_To_Cart_Btn);
    }

    public void closeAddToCartModal() {
        click(Close_Add_To_Cart);
    }

    public void OpenCart() {
        click(Cart_Btn);
    }

    public void clickCheckoutBtn() {
        click(Checkout_Btn);
    }

    public void deleteProductCart(){
        click(ButtonDeleteProduct);
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
