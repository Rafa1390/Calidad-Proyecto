package BestBuy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest{

    //Es test tambien valida el test CP-012
    @Parameters({"email", "password"})
    @Test
    public void login(String email, String password){
        BBHP.clickBestBuy();
        BBHP.redirecToLogin();
        BBL.login(email, password);
    }
}
