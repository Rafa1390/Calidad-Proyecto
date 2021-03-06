package BestBuy;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCart extends BaseTest{

    @Test
    public void buyItemWithoutLogin() throws InterruptedException {
        BBHP.clickBestBuy();
        BBHP.searchByBrand();
        BBCP.clickLenovoShopNow();
        Thread.sleep(5000);
        BBCP.clickSecondLenovoShopNow();
        Thread.sleep(10000);
        BBCP.addComputerToCart();
        Thread.sleep(6000);
        BBCP.closeAddToCartModal();
        BBCP.OpenCart();
        BBCP.clickCheckoutBtn();
        Thread.sleep(6000);
        Assert.assertTrue(BBCP.getCurrentUrl().contains("https://www.bestbuy.com/identity/signin"));
    }

    @Parameters({"login-email", "login-password"})
    @Test
    public void saveProduct(String email, String password) throws InterruptedException {
        BBHP.clickBestBuy();
        BBHP.redirecToLogin();
        BBL.login(email, password);
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
        BBCP.OpenCart();
        Assert.assertTrue(BBCP.displayedCartZero());
        Assert.assertTrue(BBCP.displayedCarouselProducts());
    }
}
