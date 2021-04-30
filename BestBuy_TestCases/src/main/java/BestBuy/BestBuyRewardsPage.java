package BestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestBuyRewardsPage extends BasePage{

    private By Rewards_Btn = By.xpath("//*[@id=\"shop-profile-navigation-b63a45d7-db85-4493-903d-0c69843535b7\"]/div/div/div/nav/ul/li[4]/button");
    private By Overview_Btn = By.xpath("//*[@id=\"shop-profile-navigation-b63a45d7-db85-4493-903d-0c69843535b7\"]/div/div/div/nav/ul/li[4]/ul/li[1]/a");

    public BestBuyRewardsPage(WebDriver driver) {
        super(driver);
    }

    public void clickRewards() {
        click(Rewards_Btn);
    }

    public void clickOverview() {
        click(Overview_Btn);
    }


}
