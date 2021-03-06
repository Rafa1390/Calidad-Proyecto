package BestBuy;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBestBuyPage extends BaseTest{

    @Test
    public void firstTest() { BBHP.clickBestBuy(); }

    @Parameters({"login-email", "login-password", "recovery-phone"})
    @Test
    public void validateRecoveryPhoneNumber(String email, String password, String phone) throws InterruptedException {
        BBHP.clickBestBuy();
        BBHP.redirecToLogin();
        BBL.login(email, password);
        Thread.sleep(8000);
        BBHP.clickUserAccountBtn();
        BBHP.openAccountSettings();
        BBHP.openPhoneNumbers();
//        Thread.sleep(7000);
        BBPN.clickAddNewNumber();
        BBPN.fillNumberInput(phone);
        BBPN.saveRecoveryNumber();
        Thread.sleep(10000);
        Assert.assertTrue(BBPN.isRecoveryNumberInvalid(), "Invalid Phone Number");
    }
}
