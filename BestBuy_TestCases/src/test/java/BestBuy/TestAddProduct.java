package BestBuy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAddProduct extends BaseTest{

    @Parameters({"email", "password"})
    @Test
    public void addProductCart() throws InterruptedException {
        BBHP.clickBestBuy();
        BBHP.searchByBrand();
        BBCP.clickLenovoShopNow();
        Thread.sleep(5000);
        BBCP.clickSecondLenovoShopNow();
        BBCP.shopComputer();
        Thread.sleep(10000);
        BBCP.addComputerToCart();
        Thread.sleep(6000);
    }
}
