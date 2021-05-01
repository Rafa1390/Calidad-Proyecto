package BestBuy;

import org.testng.Assert;
import org.testng.annotations.Parameters;
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

    @Test
    @Parameters({"email", "password"})
    public void testBuyGiftCard(String email, String password) throws InterruptedException {
        BBHP.clickBestBuy();
        BBHP.redirecToLogin();
        BBL.login(email, password);
        BBHP.clickGiftCard();
        BBGC.clickFirstBannerGiftCard();
        BBGC.clickCongratulations();
        Thread.sleep(5000);
        BBGC.clickAddToCart();
        BBGC.clickCheckout();
        Thread.sleep(15000);
    }
}
