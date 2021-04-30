package BestBuy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestRewards extends BaseTest{

    @Parameters({"email", "password"})
    @Test
    public void checkUserRewards(String email, String password) throws InterruptedException {
        BBHP.clickBestBuy();
        BBHP.redirecToLogin();
        BBL.login(email, password);
        BBHP.openAccountMenu();
        BBHP.clickAccountHome();
        BBRP.clickRewards();
        BBRP.clickOverview();
        Thread.sleep(5000);
    }

}
