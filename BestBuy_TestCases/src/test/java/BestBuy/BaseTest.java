package BestBuy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    public BestBuyHomePage BBHP;
    public BestBuyCreateAccount BBCA;

    @Parameters({"Browser", "URL"})
    @BeforeClass
    public void TestSetUp(String browser, String url){
        switch(browser){
            case("Chrome"):
                ChromeOptions options = new ChromeOptions();
                options.addArguments("start-maximized");
                driver = new ChromeDriver(options);
                break;
            case("Edge"):
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                break;
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
    }

    @BeforeMethod
    public void methodLevelSetUp(){
        BBHP = new BestBuyHomePage(driver);
        BBCA = new BestBuyCreateAccount(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
