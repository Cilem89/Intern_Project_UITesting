package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class HamburgerMenuMessagingContent extends ParentPage{

    public HamburgerMenuMessagingContent(){
        PageFactory.initElements(GWD.getDriver(),this);
    }



}
