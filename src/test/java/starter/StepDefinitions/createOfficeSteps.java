package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.CreateOffice;
import starter.OfficeBuddy.Dashboard;
import starter.OfficeBuddy.Login;
import starter.OfficeBuddy.OfficePage;

public class createOfficeSteps {


    @Steps
    CreateOffice createOffice;


    @And("I click sidebar on office name")
    public void iClickSidebarOnOfficeName() {
        createOffice.ClickSidebarOfficeName();
    }

    @And("I click button create office")
    public void iClickButtonCreateOffice() {
        createOffice.ClickButtonCreateOffice();
    }

    @And("I add office name {string}")
    public void iAddOfficeName(String office) {
        createOffice.inputOffice(office);
    }

    @And("I add address {string}")
    public void iAddAddress(String address) {
        createOffice.inputAddress(address);
    }

    @And("I add office description {string}")
    public void iAddOfficeDescription(String description) {
        createOffice.inputDescription(description);
    }

    @And("I add price {string}")
    public void iAddPrice(String prices) {
        prices = String.format("140000");
        createOffice.inputPrice(prices);
    }

    @And("I add capacity {string}")
    public void iAddCapacity(String capacity) {
        capacity = String.format("12");
        createOffice.inputCapacity(capacity);

    }

    @And("I add open {string}")
    public void iAddOpen(String OpenTime) {
        OpenTime = String.format("08:00:01");
        createOffice.inputOpen(OpenTime);
    }

    @And("I add close {string}")
    public void iAddClose(String CloseTime) {
        CloseTime = String.format("22:00:00");
        createOffice.inputClose(CloseTime);
    }

    @And("I click projector button")
    public void iClickProjectorButton() {
        createOffice.ClickFacilities();
    }

    @Then("I click create office button")
    public void iClickCreateOfficeButton() {
        createOffice.ClickCreateOfficeButton();
    }

    @And("I am on the office information page")
    public void iAmOnTheOfficeInformationPage() {
        createOffice.openUrl("https://office-buddy-web.vercel.app/dashboard");
    }

}
