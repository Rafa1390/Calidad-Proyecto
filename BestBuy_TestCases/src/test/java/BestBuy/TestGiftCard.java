package BestBuy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGiftCard extends BaseTest{

    @Test
    public void previewGiftCard(){
        BBHP.clickBestBuy();
        BBHP.clickGiftCards();
    }
}
