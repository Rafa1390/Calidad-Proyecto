package BestBuy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class TestCreateAccount extends BaseTest{

    @Parameters({"first-name", "last-name", "email", "password", "phone-number"})
    @Test
    public void createAccountTest(String firstName, String lastName, String email, String password, String phone) throws InterruptedException {
        BBHP.clickBestBuy();
        BBHP.openAccountMenu();
        BBHP.clickCreateAccount();
        HashMap<String, String> userInfo = mapUserData(firstName,lastName,email,password,phone);
        BBCA.fillCreateAccountForm(userInfo);
        BBCA.createAccount();
        Thread.sleep(8000);
    }

    private HashMap<String, String> mapUserData(String firstName, String lastName, String email, String password, String phone) {
        HashMap<String, String> data = new HashMap<>();
        data.put("firt_name", firstName);
        data.put("last_name", lastName);
        data.put("email", email);
        data.put("password", password);
        data.put("phone_number", phone);
        return data;
    }

    @Test
    @Parameters({"EMAIL", "PASSWORD", "C_PASS", "PHONE",
            "v_f_name", "v_l_name", "v_email", "v_password",
            "v_c_pass", "v_phone"})
    public void userFeedback(String email, String password, String cPass, String phone,
                             String vFName, String vLName, String vEmail, String vPassword,
                             String vCPass, String vPhone){
        BBHP.clickBestBuy();
        BBHP.openAccountMenu();
        BBHP.clickCreateAccount();
        BBCA.clickInputsCreateAccount();
        BBCA.sendTestInfoInputsAccount(email, password, cPass, phone);
        BBCA.createAccount();
        Assert.assertTrue(BBCA.vFirstNameContent(vFName));
        Assert.assertTrue(BBCA.vLastNameContent(vLName));
        Assert.assertTrue(BBCA.vEmailContent(vEmail));
        Assert.assertTrue(BBCA.vPasswordContent(vPassword));
        Assert.assertTrue(BBCA.vCPasswordContent(vCPass));
        Assert.assertTrue(BBCA.vPhoneContent(vPhone));
    }
}
