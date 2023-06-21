package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

import starter.OfficeBuddy.EditOffice;

public class editOfficeSteps {
    @Steps
    EditOffice editOffice;


    @And("I click button edit office")
    public void iClickButtonEditOffice() { editOffice.ClickEditOfficeButton();

    }

    @And("I edit description office {string}")
    public void iEditDescriptionOffice(String descriptions) { editOffice.inputUpdateDescriptions(descriptions);
    }

    @And("I edit price {string}")
    public void iEditPrice(String prices) {
        prices = String.format("140000");
        editOffice.inputUpdatePrices(prices);
    }

    @Then("I click update office button")
    public void iClickUpdateOfficeButton() { editOffice.ClickUpdateOfficeButton();

    }

    @And("I click yes button of edit office")
    public void iClickYesButtonOfEditOffice() { editOffice.ClickYesUpdateOfficeButton();

    }
    @And("I click back button of edit office")
    public void iClickBackButtonOfEditOffice() { editOffice.ClickBackUpdateOfficeButton();
    }

    @And("I can see notif successfully edit")
    public void iCanSeeNotifSuccessfullyEdit() {
    }


//    @And("I edit price {string} to {string}")
//    public void iEditPriceTo(String prices, String prices) {
//        prices = String.format("150000", "140000");
//        editOffice.inputUpdatePrices(prices);
//    }
}
