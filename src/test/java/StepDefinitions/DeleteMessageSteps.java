package StepDefinitions;

import Pages.DeleteMessage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class DeleteMessageSteps {
    DeleteMessage dm=new DeleteMessage();
    @Given("the trash button is clicked, messages should be displayed.")
    public void theTrashButtonIsClickedMessagesShouldBeDisplayed() {
        dm.myClick(dm.hamburgerMunu);
        dm.myClick(dm.messaging);
        dm.myClick(dm.trash);

    }

    @When("the delete icon is clicked, a message deletion confirmation should appear, and the message should be deletable.")
    public void theDeleteIconIsClickedAMessageDeletionConfirmationShouldAppearAndTheMessageShouldBeDeletable() {
        dm.myClick(dm.hamburgerMunu);
        dm.myClick(dm.messaging);
        dm.myClick(dm.trash);
        dm.myClick(dm.deleteBtn);
        dm.myClick(dm.deleteConfirm);
    }

    @Then("a message is deleted, a {string} message should be displayed")
    public void aMessageIsDeletedASuccessfullyDeletedMessageShouldBeDisplayed() {
    }

    @Given("The restore button should be clickable.")
    public void theRestoreButtonShouldBeClickable() {
        dm.myClick(dm.hamburgerMunu);
        dm.myClick(dm.messaging);
        dm.myClick(dm.trash);
        dm.myClick(dm.restoreButton);
    }

    @When("A success message should be displayed.")
    public void aSuccessMessageShouldBeDisplayed() {
    }
}
