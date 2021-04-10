package BestBuy;

import org.testng.annotations.Test;

public class TestCart extends BaseTest{

    @Test
    public void buyItemWithoutLogin() {
        BBHP.clickBestBuy();
    }
}
