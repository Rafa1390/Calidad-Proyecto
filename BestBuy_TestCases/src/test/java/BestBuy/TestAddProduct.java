package BestBuy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAddProduct extends BaseTest{

    @Parameters({"login-email", "login-password"})
    @Test
    public void addProductCart() throws InterruptedException {
        BBHP.clickBestBuy();
        BBHP.searchByBrand();
        BBHP.clickLenovoShopNow();
        Thread.sleep(5000);
        BBHP.clickSecondLenovoShopNow();
        BBHP.shopComputer();
        Thread.sleep(10000);
        BBHP.addComputerToCart();
    }
}