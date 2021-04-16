package BestBuy;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCart extends BaseTest{

    @Test
    public void buyItemWithoutLogin() throws InterruptedException {
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
        BBHP.clickCheckoutBtn();
        Thread.sleep(6000);
        Assert.assertTrue(BBHP.getCurrentUrl().contains("https://www.bestbuy.com/identity/signin"));
    }

    @Parameters({"login-email", "login-password"})
    @Test
    public void saveProduct(String email, String password) throws InterruptedException {
        BBHP.clickBestBuy();
        BBHP.loginWorkflow(email, password);
        Thread.sleep(8000);
        BBHP.openAppleWatchProducts();
        BBHP.selectAppleWatch();
        Thread.sleep(5000);
        BBHP.saveProduct();
        BBHP.openSavedItems();
        Thread.sleep(5000);
        Assert.assertTrue(BBHP.isItemSaved());
    }

    @Test
    public void emptyCart(){
        BBHP.clickBestBuy();
        BBHP.clickCart();
        Assert.assertTrue(BBHP.displayedCartZero());
        Assert.assertTrue(BBHP.displayedCarouselProducts());
    }
}
