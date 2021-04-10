package BestBuy;

import org.testng.annotations.Test;

public class TestCart extends BaseTest{

    @Test
    public void buyItemWithoutLogin() throws InterruptedException {
        BBHP.clickBestBuy();
        BBHP.searchByBrand();
        Thread.sleep(10000);
    }
}
