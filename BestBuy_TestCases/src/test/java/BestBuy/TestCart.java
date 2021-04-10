package BestBuy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCart extends BaseTest{

    @Test
    public void buyItemWithoutLogin() throws InterruptedException {
        BBHP.clickBestBuy();
        BBHP.searchByBrand();
        BBHP.clickLenovoShopNow();
        Thread.sleep(5000);
        BBHP.clickSecondLenovoShopNow();
        BBHP.shopComputer();
        Thread.sleep(10000);
        BBHP.addComputerToCart();
        Thread.sleep(6000);
        BBHP.closeAddToCartModal();
        BBHP.OpenCart();
        BBHP.clickCheckoutBtn();
        Thread.sleep(6000);
        Assert.assertTrue(BBHP.getCurrentUrl().contains("https://www.bestbuy.com/identity/signin"));
    }
}
