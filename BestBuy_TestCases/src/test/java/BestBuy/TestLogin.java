package BestBuy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest{

    @Test
    @Parameters({"login-email", "login-password"})
    public void login(String email, String password, String phone) throws InterruptedException {
        BBHP.clickBestBuy();
        BBHP.loginWorkflow(email, password);
    }
}
