package BestBuy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest{

    @Parameters({"email", "password"})
    @Test
    public void login(String email, String password){
        BBHP.clickBestBuy();
        BBHP.loginWorkflow(email, password);
    }
}
