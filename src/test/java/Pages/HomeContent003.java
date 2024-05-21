package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomeContent003 extends ParentPage{

    public HomeContent003(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='ng-star-inserted']/img[1]")
    public WebElement logo;

    @FindBy(xpath = "//div/ms-layout-menu-button")
    public List<WebElement> menuButtons;

    @FindBy(xpath = "//span[@class='ng-star-inserted']/button[1]")
    public WebElement hamburgerMenuButton;

    @FindBy(xpath = "//div[@class='mat-mdc-menu-content ng-tns-c1923052698-6']/button")
    public List<WebElement> hamburgerMenuList;









}
