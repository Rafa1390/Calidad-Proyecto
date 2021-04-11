package BestBuy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDeleteProduct extends BaseTest{

    @Parameters({"email", "password"})
    @Test
    public void deleteProductCart() throws InterruptedException {
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
        BBHP.deleteProductCart();
        Thread.sleep(6000);
    }
}
