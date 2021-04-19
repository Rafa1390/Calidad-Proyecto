package BestBuy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGiftCard extends BaseTest{

    @Test
    public void previewGiftCard() throws InterruptedException {
        BBHP.clickBestBuy();
        BBHP.clickGiftCards();
        BBGC.clickFirstBannerGiftCard();
        BBGCL.clickWhiteGiftCardOption();
        BBGCC.clickGiftCardConfiguration();
        Thread.sleep(10000);
        Assert.assertTrue(BBCP.displayedGiftCardPreview());
    }
}
