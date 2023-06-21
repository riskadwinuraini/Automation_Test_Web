package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class DeleteSteps {
    @Steps
    DeleteSteps deleteSteps;
    @And("I click button delete office")
    public void iClickButtonDeleteOffice() { deleteSteps.iClickButtonDeleteOffice();

    }

    @And("I click yes of delete office")
    public void iClickYesOfDeleteOffice() { deleteSteps.iClickYesOfDeleteOffice();

    }
    @And("I click back of delete office")
    public void iClickBackOfDeleteOffice() { deleteSteps.iClickBackOfDeleteOffice();
    }

    @Then("I can see notif successfully delete office")
    public void iCanSeeNotifSuccessfullyDeleteOffice() {
    }


}
