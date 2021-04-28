package BestBuy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDeleteProduct extends BaseTest{

    @Parameters({"email", "password"})
    @Test
    public void deleteProductCart() throws InterruptedException {
        BBHP.clickBestBuy();
        BBHP.searchByBrand();
        BBCP.clickLenovoShopNow();
        Thread.sleep(5000);
        BBCP.clickSecondLenovoShopNow();
        BBCP.shopComputer();
        Thread.sleep(10000);
        BBCP.addComputerToCart();
        Thread.sleep(6000);
        BBCP.closeAddToCartModal();
        BBCP.OpenCart();
        BBCP.deleteProductCart();
        Thread.sleep(6000);
    }
}
