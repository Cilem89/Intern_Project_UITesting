package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeleteMessage extends  ParentPage {
    public DeleteMessage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//button[@aria-haspopup='menu'])[1]")
    public WebElement hamburgerMunu;

    @FindBy(xpath = "//span[@class='mat-mdc-menu-item-text']")
    public WebElement messaging;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[8]")
    public WebElement inBox;
    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[10]")
    public WebElement trash;


    @FindBy(xpath ="(//ms-delete-button)[1]")
    public WebElement deleteBtn;
    @FindBy(xpath = "//button[@class='mdc-button mat-mdc-button mdc-button--raised mat-mdc-raised-button mat-accent mat-mdc-button-base']")
    public WebElement yesButton;
    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[19]")
    public WebElement refreshButton;
    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[17]")
    public WebElement replayButton;
    @FindBy(xpath = "//span[text()=' Delete ']")
    public WebElement deleteConfirm;

    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[28]")
    public WebElement restoreButton;

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "hamburgerMunu":
                return this.hamburgerMunu;
            case "restoreButton":
                return this.restoreButton;
            case "deleteConfirm":
                return this.deleteConfirm;
            case "deleteBtn":
                return (WebElement) this.deleteBtn;
            case "trash":
                return this.trash;
            case "messaging":
                return this.messaging;


        }

        return null;

    }
}
