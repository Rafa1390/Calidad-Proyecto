package BestBuy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGiftCard extends BaseTest{

    @Test
    public void previewGiftCard() throws InterruptedException {
        BBHP.clickBestBuy();
        BBHP.clickGiftCards();
        Thread.sleep(10000);
        Assert.assertTrue(BBHP.displayedGiftCardPreview());
    }
}
