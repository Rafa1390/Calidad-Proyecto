package BestBuy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

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
        BBHP.fillCreateAccountForm(userInfo);
        BBHP.createAccount();
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
    public void userFeedback(){
        BBHP.clickBestBuy();
        BBHP.openAccountMenu();
        BBHP.clickCreateAccount();
        BBHP.clickInputsCreateAccount();
    }
}
