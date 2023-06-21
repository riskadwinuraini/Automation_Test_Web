package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.Dashboard;
import starter.OfficeBuddy.Login;

public class AuthSteps {
    @Steps
    Login login;
    @Steps
    Dashboard dashboard;

    @Given("I am on the login pages")
    public void iAmOnTheLoginPages() {
        login.openUrl("https://office-buddy-web.vercel.app/login");
        login.validateOnLoginPage();
    }

    @When("I enter Email {string}")
    public void iEnterEmail(String email) { login.inputEmail(email);

    }

    @And("I enter Password {string}")
    public void iEnterPassword(String password) { login.inputPassword(password);

    }

    @And("I click Login button")
    public void iClickLoginButton() { login.ClickLoginButton();

    }
    @Then("I am on the dashboard page")
    public void iAmOnTheDashboardPage() { dashboard.openUrl("https://office-buddy-web.vercel.app/dashboard");
    }

    @And("I can see error message")
    public void iCanSeeErrorMessage() {

    }


}
